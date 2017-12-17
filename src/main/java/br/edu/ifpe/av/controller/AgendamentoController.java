package br.edu.ifpe.av.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import br.edu.ifpe.av.controller.util.AgendamentoJob;
import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.Usuario;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.av.persistencia.implementacoes.FabricaRepositorio;

@ManagedBean (name = "agendamentoController")
@SessionScoped
public class AgendamentoController implements Serializable{

	RepositorioGenerico<Agendamento, Integer> repositorioAgendamento = null;
	RepositorioGenerico<Disciplina, Integer> repositorioDisciplina = null;

	private Agendamento selecionar = new Agendamento();
	private Disciplina disciplinaSelecionado = new Disciplina();
	private Usuario usuarioSelecionado = new Usuario();
	
	
	private DisciplinaController disciplinaController = new DisciplinaController();

	public Disciplina getDisciplinaSelecionado() {
		return disciplinaSelecionado;
	}

	public void setDisciplinaSelecionado(Disciplina disciplinaSelecionado) {
		this.disciplinaSelecionado = disciplinaSelecionado;
	}
	

	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}
	public Agendamento getSelecionar() {
		return selecionar;
	}

	public void setSelecionar(Agendamento selecionar) {
		this.selecionar = selecionar;
	}

	public AgendamentoController() {
		this.repositorioAgendamento = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Agendamento,
				FabricaRepositorio.BD);
	}
	
	@PostConstruct
	public Scheduler init() {
		//System.out.println("Inicializou o Agendamento Controller!!");
		Scheduler sched = null;

		try {
			SchedulerFactory sf = new StdSchedulerFactory();
			sched = sf.getScheduler(); 
			JobDetail job = JobBuilder.newJob(AgendamentoJob.class).withIdentity("job1", "group1").build();
			CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
					.withSchedule(CronScheduleBuilder.cronSchedule("0 0/1 0 * * ?" )).build();
			sched.scheduleJob(job, trigger);
			
			sched.start();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		return sched;
	}
	

	public String inserir(Agendamento agendamento) {
		agendamento.setDisciplina(disciplinaSelecionado);
		agendamento.setUsuario(usuarioSelecionado);
		
		this.repositorioAgendamento.inserir(agendamento);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Agendamento foi inserido!"));
		

		return "restrito/ApresentarAgendamento.xhtml";

	}

	public String alterar(Agendamento agendamento) {
		this.repositorioAgendamento.alterar(agendamento);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Agendamento foi alterado!"));

		return "restrito/ApresentarAgendamento.xhtml";
	}

	public Agendamento recuperarAgendamento(int id) {
		return this.repositorioAgendamento.recuperar(id);

	}

	public void excluir(Agendamento agendamento) {
		this.repositorioAgendamento.excluir(agendamento);

	}

	public List<Agendamento> recuperarTodosAgendamento() {
		return this.repositorioAgendamento.recuperarTodos();
	}
	
	public List<Disciplina> recuperarTodosDisciplina() {
        return disciplinaController.repositorioDisciplina.recuperarTodos();
    }
	
	/*public Agendamento recuperarAgendamentoData(String data){
		return this.repositorioAgendamento.recuperar(data);
	}*/
	
	
 

}
