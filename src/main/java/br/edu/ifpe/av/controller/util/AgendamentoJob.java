package br.edu.ifpe.av.controller.util;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerUtils;
import org.quartz.impl.StdSchedulerFactory;

import br.edu.ifpe.av.controller.AgendamentoController;
import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioAgendamento;

public class AgendamentoJob implements Job {
	// tarefa a ser executada
	/*Trigger responsável por determinar quando determinado
     Job deverá ser executado.*/

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
	 
	Agendamento agendamento = new Agendamento();
	EnviarEmail enviarEmail = new EnviarEmail();
	
	System.out.println("Executando Job");
	
	/*List<Agendamento> ag = (List<Agendamento>)((RepositorioAgendamento)this.repositorioAgendamento)
			.recuperar(agendamento.getData());
	
	if(dataHoje.toString() == agendamento.getData()){
		enviarEmail.postMail("ppo.agendaVirtual@gmail.com","Alerta - Agendamento ",
				"Verifique seus agendamentos no sistema","mayarasilva.mrs@gmail.com" );*/
		
	}
		
		
	
		

	

}
