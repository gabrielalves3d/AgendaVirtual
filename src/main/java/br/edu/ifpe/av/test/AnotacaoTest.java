package br.edu.ifpe.av.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.model.entity.Usuario;
import org.junit.Assert;

public class AnotacaoTest {
	
	Date data = new Date("18/02/1999");
	Usuario usr = new Usuario();

	@Test
	public void getIdTest() {
		Anotacao anotacao = new Anotacao(1,"Fazer atividade",data, usr);
		int resultado = anotacao.getId();
		Assert.assertEquals(1, resultado);
	}
	@Test
	public void getTextoTest() {
		Anotacao anotacao = new Anotacao(1,"Fazer atividade",data, usr);
		String resultado = anotacao.getTexto();
		Assert.assertEquals("Fazer atividade", resultado);
	}
	@Test
	public void getDataTest() {
		Anotacao anotacao = new Anotacao(1,"Fazer atividade",data, usr);
		Date resultado = anotacao.getData();
		Assert.assertEquals(data, resultado);
	}
	
}
