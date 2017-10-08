package br.edu.ifpe.av.test.repositorio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifpe.av.model.entity.Boletim;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioBoletim;

public class RepositorioBoletimTest {
	RepositorioGenerico<Boletim, Integer> repositorioBoletim;
	Boletim boletim;
	Disciplina disciplina = new Disciplina();
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	@Before
	public void setUp(){
		this.repositorioBoletim = new RepositorioBoletim();
		this.boletim = new Boletim();
	}

	@Test
	public void testInserir() {
		repositorioBoletim.inserir(boletim);
	}
	
	@Test
	public void testRecuperarId(){
		repositorioBoletim.inserir(boletim);
		assertEquals(boletim, repositorioBoletim.recuperar((int)boletim.getId()));
	}
	
	@Test
	public void testAlterarDisciplina(){
		boletim.setDisciplinas(disciplinas);
		Boletim comparacao = boletim;
		boletim.setDisciplinas (disciplinas);
		assertFalse(boletim.equals(comparacao));
	}

	@Test
	public void testRecuperarTodos(){
		List<Boletim> testBolet = new ArrayList<>();
		testBolet.add(boletim);
		repositorioBoletim.inserir(boletim);
		assertEquals(testBolet, repositorioBoletim.recuperarTodos());
	}
}
