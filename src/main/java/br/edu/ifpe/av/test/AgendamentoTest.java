package br.edu.ifpe.av.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.edu.ifpe.av.model.entity.Agendamento;
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
	
}
	
