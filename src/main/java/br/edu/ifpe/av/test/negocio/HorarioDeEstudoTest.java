package br.edu.ifpe.av.test.negocio;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;

public class HorarioDeEstudoTest {
	Disciplina disciplina = new Disciplina();
	

	@Test
	public void getDisciplinasTest() {
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplina);
		Disciplina resultado = horariodeestudo.getDisciplina();
		Assert.assertEquals(disciplina, resultado );	
	}

	@Test
	public void setDisciplinasTest(){
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplina);
		horariodeestudo.setDisciplina(disciplina);
		Assert.assertEquals(disciplina, horariodeestudo.getDisciplina());

	}

	@Test
	public void getIdTest() {
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplina);
		int resultado = horariodeestudo.getId();
		Assert.assertEquals(22,resultado );	
	}

	@Test
	public void setIdTest() {
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplina);
		horariodeestudo.setId(22);
		Assert.assertEquals(22, horariodeestudo.getId());
	}

	@Test
	public void getHorarioTest() {
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplina);
		String resultado = horariodeestudo.getHorario();
		Assert.assertEquals("10:00",resultado );	
	}

	@Test
	public void setHorarioTest() {
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplina);
		horariodeestudo.setHorario("10:00");
		Assert.assertEquals("10:00", horariodeestudo.getHorario());
	}

}
