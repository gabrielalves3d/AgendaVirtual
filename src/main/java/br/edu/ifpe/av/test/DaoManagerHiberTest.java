package br.edu.ifpe.av.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.model.entity.DaoManagerHiber;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;
import br.edu.ifpe.av.model.entity.Usuario;

public class DaoManagerHiberTest {

	@Test
	public void inserirUsuarioTest() {
		Usuario usr = new Usuario();
		usr.setEmail("tst@mail.com");
		usr.setNome("Larissa");

		DaoManagerHiber.getInstance().persist(usr);
		usr = (Usuario) (DaoManagerHiber.getInstance().recover("from Usuario").get(0));
		assertNotNull(usr);
	}

	@Test
	public void inserirDisciplinaTest() {
		List<Disciplina> dis = new ArrayList<Disciplina>();
		Disciplina d = new Disciplina();
		d.setNome("Mat");
		List notas = new ArrayList();
		double nota1 = 7;
		double nota2 = 8;
		double nota3 = 9;
		double nota4 = 6;
		notas.add(nota1);
		notas.add(nota2);
		notas.add(nota3);
		notas.add(nota4);
		d.setNota(notas);
		d.setSituacao("Aprovado");
		d.setMediaFinal(6.0);

		DaoManagerHiber.getInstance().persist(d);
		d = (Disciplina) (DaoManagerHiber.getInstance().recover("from Disciplina").get(0));
		assertNotNull(d);

	}

	@Test
	public void inserirAgendamentoTest() {
		List<Agendamento> ags = new ArrayList<Agendamento>();
		Agendamento a = new Agendamento();
		Usuario usuario = new Usuario();
		usuario.setEmail("tst@mail.com");
		usuario.setNome("Larissa");
		DaoManagerHiber.getInstance().persist(usuario);
		usuario = (Usuario) (DaoManagerHiber.getInstance().recover("from Usuario").get(0));
		List nota = new ArrayList();
		nota.add(5.0);
		Disciplina disciplina = new Disciplina(1, "Mat", nota, 6.0, "Aprovado");
		DaoManagerHiber.getInstance().persist(disciplina);
		disciplina = (Disciplina) (DaoManagerHiber.getInstance().recover("from Disciplina").get(0));
		a.setAtividade("Tst");
		a.setDescricao("dsc");
		a.setData("18/02/1999");
		a.setHora("12:00");
		a.setDisciplina(disciplina);
		ags.add(a);
		usuario.setAgendamento(ags);
		DaoManagerHiber.getInstance().update(usuario);
		assertNotNull(a);
	}

	@Test
	public void inserirAnotacaoTest() {
		List<Anotacao> nt = new ArrayList<Anotacao>();
		Anotacao ant = new Anotacao();
		Usuario usuario = new Usuario();
		usuario.setEmail("tst@mail.com");
		usuario.setNome("Larissa");
		DaoManagerHiber.getInstance().persist(usuario);
		usuario = (Usuario) (DaoManagerHiber.getInstance().recover("from Usuario").get(0));
		ant.setTexto("I love you");
		ant.setData("18/02/1999");
		nt.add(ant);
		usuario.setAnotacao(nt);
		DaoManagerHiber.getInstance().update(usuario);
		assertNotNull(ant);
	}

	@Test
	public void inserirHorarioDeEstudoTest() {
		HorarioDeEstudo he = new HorarioDeEstudo();
		Usuario usuario = new Usuario();
		usuario.setEmail("tst@mail.com");
		usuario.setNome("Larissa");
		DaoManagerHiber.getInstance().persist(usuario);
		usuario = (Usuario) (DaoManagerHiber.getInstance().recover("from Usuario").get(0));
		List nota = new ArrayList();
		nota.add(5.0);
		Disciplina disciplina = new Disciplina(6, "Mat", nota, 6.0, "Aprovado");
		DaoManagerHiber.getInstance().persist(disciplina);
		disciplina = (Disciplina) (DaoManagerHiber.getInstance().recover("from Disciplina").get(0));
		he.setDisciplina(disciplina);
		he.setHorario("12:00");
		usuario.setHorarioDeEstudo(he);
		DaoManagerHiber.getInstance().update(usuario);
		assertNotNull(he);
	}
}
