package br.edu.ifpe.av.test.negocio;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;

public class HorarioDeEstudoTest {
	Disciplina disciplina = new Disciplina();
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	@Test
	public void getDisciplinasTest() {
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplinas);
		List<Disciplina> resultado = horariodeestudo.getDisciplinas();
		Assert.assertEquals(disciplinas, resultado );	
	}

	@Test
	public void setDisciplinasTest(){
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplinas);
		horariodeestudo.setDisciplinas(disciplinas);
		Assert.assertEquals(disciplinas, horariodeestudo.getDisciplinas());

	}

	@Test
	public void getIdTest() {
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplinas);
		int resultado = horariodeestudo.getId();
		Assert.assertEquals(22,resultado );	
	}

	@Test
	public void setIdTest() {
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplinas);
		horariodeestudo.setId(22);
		Assert.assertEquals(22, horariodeestudo.getId());
	}

	@Test
	public void getHorarioTest() {
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplinas);
		String resultado = horariodeestudo.getHorario();
		Assert.assertEquals("10:00",resultado );	
	}

	@Test
	public void setHorarioTest() {
		HorarioDeEstudo horariodeestudo = new HorarioDeEstudo(22, "10:00", disciplinas);
		horariodeestudo.setHorario("10:00");
		Assert.assertEquals("10:00", horariodeestudo.getHorario());
	}

}
