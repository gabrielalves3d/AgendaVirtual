package br.edu.ifpe.av.test.repositorio;

import br.edu.ifpe.av.persistencia.implementacoes.RepositorioAgendamento;
import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.persistencia.generico.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class RepositorioAgendamentoTest {
	RepositorioGenerico<Agendamento, Integer> repositorioAgendamento;  
	Agendamento agendamento;


	@Before
	public void setUp(){
		this.repositorioAgendamento = new RepositorioAgendamento();
		this.agendamento = new Agendamento();
	}

	@Test
	public void testInserir() {
		repositorioAgendamento.inserir(agendamento);
	}
	@Test
	public void testRecuperarId(){
		repositorioAgendamento.inserir(agendamento);
		assertEquals(agendamento, repositorioAgendamento.recuperar((int) agendamento.getId()));
	}
	@Test
	public void testAlterarDescricao(){
		agendamento.setDescricao("Trabalho sobre verbos");
		Agendamento comparacao = agendamento;
		agendamento.setDescricao("Trabalho sobre verbos e substantivos");
		assertFalse(agendamento.equals(comparacao));
	}
	
	@Test
	public void testRecuperarTodos(){
		List<Agendamento> testAgend = new ArrayList<>();
		testAgend.add(agendamento);
		repositorioAgendamento.inserir(agendamento);
		assertEquals(testAgend, repositorioAgendamento.recuperarTodos());
	}
	@Test
	public void testRemover(){
		repositorioAgendamento.inserir(agendamento);
		repositorioAgendamento.excluir(agendamento);
		assertNull(repositorioAgendamento.recuperar((int)agendamento.getId()));
	}
}



