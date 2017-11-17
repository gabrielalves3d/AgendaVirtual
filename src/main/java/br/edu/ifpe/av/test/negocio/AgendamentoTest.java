package br.edu.ifpe.av.test.negocio;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.Usuario;

public class AgendamentoTest {
	
        Disciplina d = new Disciplina();
        Usuario usr = new Usuario();
       
        
        @Test
    	public void getIdTest() {
    		Agendamento ag = new Agendamento(1,"Trabalho","18/02/1999","12:00","csdcder", d , usr);
    	    int resultado = ag.getId();
    	    Assert.assertEquals(1, resultado);
    	}
	@Test
	public void getAtividadeTest() {
		Agendamento ag = new Agendamento(1,"Trabalho","18/02/1999","12:00","csdcder", d , usr);
	    String resultado = ag.getAtividade();
	    Assert.assertEquals("Trabalho", resultado);
	}
	@Test
	public void getDataTest() {
		Agendamento ag = new Agendamento(1,"Trabalho","18/02/1999","12:00","csdcder", d , usr);
	    String resultado = ag.getData();
	    Assert.assertEquals("18/02/1999", resultado);
	}@Test
	public void getHoraTest() {
		Agendamento ag = new Agendamento(1,"Trabalho","18/02/1999","12:00","csdcder", d , usr);
	    String resultado = ag.getHora();
	    Assert.assertEquals("12:00", resultado);
	}
	@Test
	public void getDescricaoTest() {
		Agendamento ag = new Agendamento(1,"Trabalho","18/02/1999","12:00","Atividade avaliativa", d , usr);
	    String resultado = ag.getDescricao();
	    Assert.assertEquals("Atividade avaliativa", resultado);
	}
	@Test
	public void setIdTest() {
		Agendamento ag = new Agendamento();
		ag.setId(1);
		Assert.assertEquals(1, ag.getId());
	}
	@Test
	public void setAtividadeTest() {
		Agendamento ag = new Agendamento();
		ag.setAtividade("Trabalho");
		Assert.assertEquals("Trabalho", ag.getAtividade());
	}
	@Test
	public void setDataTest() {
		Agendamento ag = new Agendamento();
		ag.setData("18/02/1999");
		Assert.assertEquals("18/02/1999", ag.getData());
	}
	@Test
	public void setHoraTest() {
		Agendamento ag = new Agendamento();
		ag.setHora("12:00");
		Assert.assertEquals("12:00", ag.getHora());
	}
	@Test
	public void setDescricaoTest() {
		Agendamento ag = new Agendamento();
		ag.setDescricao("Atividade avaliativa");
		Assert.assertEquals("Atividade avaliativa", ag.getDescricao());
	}
	@Test
	public void setUsuarioTest() {
		Agendamento ag = new Agendamento();
		Usuario usuario = new Usuario();
		ag.setUsuario(usuario);
		Assert.assertEquals(usuario, ag.getUsuario());
	}
	@Test
	public void setDisciplinaTest() {
		Agendamento ag = new Agendamento();
		Disciplina disciplina = new Disciplina();
		ag.setDisciplina(disciplina);
		Assert.assertEquals(disciplina, ag.getDisciplina());
	}
}
	
