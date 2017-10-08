package br.edu.ifpe.av.test.negocio;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.edu.ifpe.av.model.entity.Disciplina;
import junit.framework.Assert;

public class DisciplinaTest {

	List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	@Test
	public void setNomeDisciplinaTest() {
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("Mat");
		Assert.assertEquals("Mat", disciplina.getNome());
		
		
		
		

	}

}
