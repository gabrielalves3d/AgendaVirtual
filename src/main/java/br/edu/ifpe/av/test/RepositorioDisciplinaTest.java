package br.edu.ifpe.av.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.mock.*;
import br.edu.ifpe.av.model.entity.DaoManagerHiber;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;
import junit.framework.Assert;

public class RepositorioDisciplinaTest {
	
	DaoManagerHiber dao = DaoManagerHiber.getInstance();
	
	@Test
	public void testInserir(Disciplina u) {
		
			dao.persist(u);
		}
	
	}
		 
		
	

