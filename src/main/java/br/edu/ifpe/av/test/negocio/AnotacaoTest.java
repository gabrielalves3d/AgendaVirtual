package br.edu.ifpe.av.test.negocio;

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
		Assert.assertEquals(1, anotacao.getId());
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
	@Test
	public void setIdTest() {
		Anotacao anotacao = new Anotacao();
		anotacao.setId(1);
		Assert.assertEquals(1, anotacao.getId());
	}
	@Test
	public void setTextoTest() {
		Anotacao anotacao = new Anotacao();
		anotacao.setTexto("Fazer atividade");
		Assert.assertEquals("Fazer atividade", anotacao.getTexto());
	}
	@Test
	public void setDataTest() {
		Anotacao anotacao = new Anotacao();
		anotacao.setData(data);
		Assert.assertEquals(data, anotacao.getData());
	}
	@Test
	public void setUsuarioTest() {
		Anotacao anotacao = new Anotacao();
		Usuario usuario = new Usuario();
		anotacao.setUsuario(usuario);
		Assert.assertEquals(usuario, anotacao.getUsuario());
	}
}
