package br.edu.ifpe.av.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.model.entity.DaoManagerHiber;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;
import br.edu.ifpe.av.model.entity.Usuario;

public class DaoManagerHiberTest {

	Usuario usr = new Usuario();
	
	List<Disciplina> dis = new ArrayList<Disciplina>();
	Disciplina d = new Disciplina();
	List <Double> nota;
	@Test
	public void inserirDisciplinaTest() {
	d.setNome("Mat");
	double nota1 = 7;
	double nota2 = 8;
	double nota3 = 9;
	double nota4 = 6;
	nota.add(nota1 + nota2 + nota3 + nota4);
	d.setNota(nota);
	d.setSituacao(true);
	d.setMediaFinal(6.0);
	
	DaoManagerHiber.getInstance().persist(d);
	d = (Disciplina) (DaoManagerHiber.getInstance().recover("from Disciplina").get(0));
	dis.add(d);
	}
	

	List<Agendamento> ags = new ArrayList<Agendamento>();
	Agendamento a = new Agendamento();
	
	@Test
	public void inserirAgendamentoTest() {
	a.setAtividade("Tst");
	a.setDescricao("dsc");
	Date dataHora = new Date("18/02/1999");
	a.setDataHora(dataHora);
	a.setDisciplina(d);
	ags.add(a);
	usr.setAgendamento(ags);
	}
	

	List<Anotacao> nt = new ArrayList<Anotacao>();
	Anotacao ant = new Anotacao();
	@Test
	public void inserirAnotacaoTest() {
	ant.setTexto("I love you");
	Date data = new Date("18/02/1999");
	ant.setData(data);
	nt.add(ant);
	usr.setAnotacao(nt);
	}
	
	HorarioDeEstudo academico = new HorarioDeEstudo();
	@Test
	public void inserirHorarioDeEstudoTest(){
	academico.setHorario("12:00");
	usr.setHorarioDeEstudo(academico);
	}
	
	
	@Test 
	public void inserirUsuarioTest() {
		usr.setEmail("tst@mail.com");
		usr.setNome("Larissa");
	
	DaoManagerHiber.getInstance().persist(usr);
}
}



