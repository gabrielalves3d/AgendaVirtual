package br.edu.ifpe.av.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.av.persistencia.implementacoes.FabricaRepositorio;

@ManagedBean (name = "agendamentoController")
@SessionScoped
public class AgendamentoController implements Serializable{

	RepositorioGenerico<Agendamento, Integer> repositorioAgendamento = null;
	RepositorioGenerico<Disciplina, Integer> repositorioDisciplina = null;

	private Agendamento selecionar = new Agendamento();
	private Disciplina disciplinaSelecionado = new Disciplina();
	
	private DisciplinaController disciplinaController = new DisciplinaController();

	public Disciplina getDisciplinaSelecionado() {
		return disciplinaSelecionado;
	}

	public void setDisciplinaSelecionado(Disciplina disciplinaSelecionado) {
		this.disciplinaSelecionado = disciplinaSelecionado;
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

	public String inserir(Agendamento agendamento) {
		agendamento.setDisciplina(disciplinaSelecionado);
		
		this.repositorioAgendamento.inserir(agendamento);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Agendamento foi inserido!"));
		

		return "ApresentarAgendamento.xhtml";

	}

	public String alterar(Agendamento agendamento) {
		this.repositorioAgendamento.alterar(agendamento);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Agendamento foi alterado!"));

		return "ApresentarAgendamento.xhtml";
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
	
	
 

}
