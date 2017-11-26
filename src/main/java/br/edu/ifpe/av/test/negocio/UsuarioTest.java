package br.edu.ifpe.av.test.negocio;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;
import br.edu.ifpe.av.model.entity.Usuario;

public class UsuarioTest {
	
	private HorarioDeEstudo horarioDeEstudo;
	private List<Anotacao> anotacao;
	private List<Agendamento> agendamento;

	@Test
	public void getIdTest() {
		Usuario usuario = new Usuario(1,"vanessa", "vanessa@hotmail.com", "12345678", horarioDeEstudo,anotacao,agendamento);
		int resultado = usuario.getId();
	    Assert.assertEquals(1, resultado);
	}
	@Test
	public void getNomeTest() {
		Usuario usuario = new Usuario(1,"vanessa", "vanessa@hotmail.com","12345678", horarioDeEstudo,anotacao,agendamento);
		String resultado = usuario.getNome();
	    Assert.assertEquals("vanessa", resultado);
	}
	@Test
	public void getEmailTest() {
		Usuario usuario = new Usuario(1,"vanessa", "vanessa@hotmail.com","12345678", horarioDeEstudo,anotacao,agendamento);
		String resultado = usuario.getEmail();
	    Assert.assertEquals("vanessa@hotmail.com", resultado);
	}
	@Test
	public void getSenhaTest() {
		Usuario usuario = new Usuario(1,"vanessa", "vanessa@hotmail.com","12345678", horarioDeEstudo,anotacao,agendamento);
		String resultado = usuario.getSenha();
	    Assert.assertEquals("12345678", resultado);
	}
	
	@Test
	public void setIdTest() {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		Assert.assertEquals(1, usuario.getId());
	}
	@Test
	public void setNomeTest() {
		Usuario usuario = new Usuario();
		usuario.setNome("vanessa");
		Assert.assertEquals("vanessa", usuario.getNome());
	}
	@Test
	public void setEmailTest() {
		Usuario usuario = new Usuario();
		usuario.setEmail("vanessa@hotmail.com");
		Assert.assertEquals("vanessa@hotmail.com", usuario.getEmail());
	}
	@Test
	public void setSenhaTest() {
		Usuario usuario = new Usuario();
		usuario.setSenha("12345678");
		Assert.assertEquals("12345678", usuario.getSenha());
	}
	
	@Test
	public void setHorarioDeEstudoTest() {
		Usuario usuario = new Usuario();
		HorarioDeEstudo horarioDeEstudo = new HorarioDeEstudo();
		usuario.setHorarioDeEstudo(horarioDeEstudo);
		Assert.assertEquals(horarioDeEstudo, usuario.getHorarioDeEstudo());
	}
	
	@Test
	public void setAnotacaoTest(){
		Usuario usuario = new Usuario(1,"vanessa", "vanessa@hotmail.com", "12345678", horarioDeEstudo,anotacao,agendamento);
		usuario.setAnotacao(anotacao);
		Assert.assertEquals(anotacao, usuario.getAnotacao());

	}
	@Test
	public void setAgendamentoTest(){
		Usuario usuario = new Usuario(1,"vanessa", "vanessa@hotmail.com", "12345678", horarioDeEstudo,anotacao,agendamento);
		usuario.setAgendamento(agendamento);
		Assert.assertEquals(agendamento, usuario.getAgendamento());

	}
	

}
