package br.edu.ifpe.av.test.repositorio;

import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.persistencia.generico.*;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioAnotacao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class RepositorioAnotacaoTest {
	RepositorioGenerico<Anotacao, Integer> repositorioAnotacao;
	Anotacao anotacao;

	@Before
	public void setUp(){
		this.repositorioAnotacao = new RepositorioAnotacao();
		this.anotacao = new Anotacao();
	}

	@Test
	public void testInserir() {
		repositorioAnotacao.inserir(anotacao);
	}
	@Test
	public void testRecuperarId(){
		repositorioAnotacao.inserir(anotacao);
		assertEquals(anotacao, repositorioAnotacao.recuperar((int) anotacao.getId()));
	}
	@Test
	public void testAlterarTexto(){
		anotacao.setTexto("aaaaaa");
		Anotacao comparacao = anotacao;
		anotacao.setTexto("aaaaaaabbb");
		assertFalse(anotacao.equals(comparacao));
	}

	@Test
	public void testRecuperarTodos(){
		List<Anotacao> testAnotac = new ArrayList<>();
		testAnotac.add(anotacao);
		repositorioAnotacao.inserir(anotacao);
		assertEquals(testAnotac, repositorioAnotacao.recuperarTodos());
	}
	@Test
	public void testRemover(){
		repositorioAnotacao.inserir(anotacao);
		repositorioAnotacao.excluir(anotacao);
		assertNull(repositorioAnotacao.recuperar((int)anotacao.getId()));
	}
}

