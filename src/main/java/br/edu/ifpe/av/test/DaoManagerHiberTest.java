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

	Usuario usr = new Usuario();

	@Test
	public void inserirUsuarioTest() {
		usr.setEmail("tst@mail.com");
		usr.setNome("Larissa");

		DaoManagerHiber.getInstance().persist(usr);
		this.usr = (Usuario) (DaoManagerHiber.getInstance().recover("from Usuario").get(0));
		assertNotNull(this.usr);
	}
	
	List<Disciplina> dis = new ArrayList<Disciplina>();
	Disciplina d = new Disciplina();

	@Test
	public void inserirDisciplinaTest() {
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
		d.setSituacao(true);
		d.setMediaFinal(6.0);

		DaoManagerHiber.getInstance().persist(d);
		this.d = (Disciplina) (DaoManagerHiber.getInstance().recover("from Disciplina").get(0));
		assertNotNull(this.d);
		
	}

	List<Agendamento> ags = new ArrayList<Agendamento>();
	Agendamento a = new Agendamento();

	@Test
	public void inserirAgendamentoTest() {
		a.setAtividade("Tst");
		a.setDescricao("dsc");
		a.setData("18/02/1999");
		a.setHora("12:00");
		a.setDisciplina(d);
		ags.add(a);
		usr.setAgendamento(ags);
		DaoManagerHiber.getInstance().update(usr);
	}

	List<Anotacao> nt = new ArrayList<Anotacao>();
	Anotacao ant = new Anotacao();

	@Test
	public void inserirAnotacaoTest() {
		ant.setTexto("I love you");
		ant.setData("18/02/1999");
		nt.add(ant);
		usr.setAnotacao(nt);
		DaoManagerHiber.getInstance().update(usr);
	}

	HorarioDeEstudo academico = new HorarioDeEstudo();

	@Test
	public void inserirHorarioDeEstudoTest() {
		academico.setHorario("12:00");
		usr.setHorarioDeEstudo(academico);
		DaoManagerHiber.getInstance().update(usr);
	}
}
