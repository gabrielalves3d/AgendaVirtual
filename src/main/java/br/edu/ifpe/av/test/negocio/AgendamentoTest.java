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
        Date dataHora = new Date("18/02/1999");
        
        @Test
    	public void getIdTest() {
    		Agendamento ag = new Agendamento(1,"Trabalho",dataHora,"csdcder", d , usr);
    	    int resultado = ag.getId();
    	    Assert.assertEquals(1, resultado);
    	}
	@Test
	public void getAtividadeTest() {
		Agendamento ag = new Agendamento(1,"Trabalho",dataHora,"csdcder", d , usr);
	    String resultado = ag.getAtividade();
	    Assert.assertEquals("Trabalho", resultado);
	}
	@Test
	public void getDataTest() {
		Agendamento ag = new Agendamento(1,"Trabalho",dataHora,"csdcder", d , usr);
	    Date resultado = ag.getDataHora();
	    Assert.assertEquals(dataHora, resultado);
	}
	@Test
	public void getDescricaoTest() {
		Agendamento ag = new Agendamento(1,"Trabalho",dataHora,"Atividade avaliativa", d , usr);
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
		ag.setDataHora(dataHora);
		Assert.assertEquals(dataHora, ag.getDataHora());
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
	
