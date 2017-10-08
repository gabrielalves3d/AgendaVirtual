package br.edu.ifpe.av.test.repositorio;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;


public class RepositorioGenericoTest<T,G> {
	public RepositorioGenerico<T,Integer> repositorio;
	public T tipo = null;
	public Integer tipoDoID;

	@Test
	public void testInserir(){
		repositorio.inserir(tipo);
	}
	@Test
	public void testRecuperarId(){
		int id = Integer.parseInt("SELECT ID");
		T t2 = repositorio.recuperar(id);
		assertNotNull(t2);
		assertEquals(t2, tipo);
	}
	@Test
	public void testRecuperarTodos() {
		assertNotNull(tipo); // ver se o tipo é nulo ou não
		List<T> recuperar = repositorio.recuperarTodos();
		for (T t2 : recuperar) {
			if (tipo.equals(t2)) {
				assertEquals(t2, tipo);
			}
		}
	}
	@Test
	public void testAlterar(){
		repositorio.alterar(tipo);
	}
	@Test
	public void testExcluir(){
		assertNotNull(tipo);
		repositorio.excluir(tipo);
		List<T> recuperar = repositorio.recuperarTodos();
		for (T t2 : recuperar) {
			if (tipo.equals(t2)) {
				assertEquals(t2, tipo);
				tipo = null;
				fail("Not found");
				// nao pode encontrar
			}

		}
	}
}

