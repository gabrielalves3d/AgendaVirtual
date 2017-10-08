package br.edu.ifpe.av.test.negocio;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.edu.ifpe.av.model.entity.Boletim;
import br.edu.ifpe.av.model.entity.Disciplina;

public class BoletimTest {
	
	Disciplina disciplina = new Disciplina();
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();


	@Test
	public void getDisciplinasTest() {
		Boletim boletim = new Boletim(1, disciplinas);
		List<Disciplina> resultado = boletim.getDisciplinas();
		Assert.assertEquals(disciplinas, resultado );	
	}


	@Test
	public void setDisciplinasTest(){
		Boletim boletim = new Boletim();
		boletim.setDisciplinas(disciplinas);
		Assert.assertEquals(disciplinas, boletim.getDisciplinas());

	}
}
