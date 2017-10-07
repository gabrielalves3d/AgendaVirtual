package br.edu.ifpe.av.test.negocio;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.model.entity.Boletim;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;
import br.edu.ifpe.av.model.entity.Usuario;

public class UsuarioTest {
	
	private HorarioDeEstudo horarioDeEstudo;
	private Boletim boletim;
	private List<Anotacao> anotacao;
	private List<Agendamento> agendamento;

	@Test
	public void getIdTest() {
		Usuario usuario = new Usuario(1,"vanessa", "vanessa@hotmail.com","1234",horarioDeEstudo,boletim,anotacao,agendamento);
		int resultado = usuario.getId();
	    Assert.assertEquals(1, resultado);
	}
	@Test
	public void getNomeTest() {
		Usuario usuario = new Usuario(1,"vanessa", "vanessa@hotmail.com","1234",horarioDeEstudo,boletim,anotacao,agendamento);
		String resultado = usuario.getNome();
	    Assert.assertEquals("vanessa", resultado);
	}
	@Test
	public void getEmailTest() {
		Usuario usuario = new Usuario(1,"vanessa", "vanessa@hotmail.com","1234",horarioDeEstudo,boletim,anotacao,agendamento);
		String resultado = usuario.getEmail();
	    Assert.assertEquals("vanessa@hotmail.com", resultado);
	}
	@Test
	public void getSenhaTest() {
		Usuario usuario = new Usuario(1,"vanessa", "vanessa@hotmail.com","1234",horarioDeEstudo,boletim,anotacao,agendamento);
		String resultado = usuario.getSenha();
	    Assert.assertEquals("1234", resultado);
	}

}
