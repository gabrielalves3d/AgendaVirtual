package br.edu.ifpe.av.test.repositorio;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.ifpe.av.persistencia.implementacoes.FabricaRepositorio;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioAgendamento;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioAnotacao;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioBoletim;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioDisciplina;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioHorarioDeEstudo;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioUsuario;
import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.model.entity.Boletim;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;
import br.edu.ifpe.av.model.entity.Usuario;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;

public class FabricaRepositorioTest {

	@Test
	public void fabricarRepositorioUsuarioTest() {
		RepositorioGenerico <Usuario, Integer> repositorio = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Usuario, FabricaRepositorio.BD);
		assertTrue(repositorio instanceof RepositorioUsuario);
	}
	@Test
	public void fabricarRepositorioHorarioDeEstudoTest() {
		RepositorioGenerico <HorarioDeEstudo, Integer> repositorio = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.HorarioDeEstudo, FabricaRepositorio.BD);
		assertTrue(repositorio instanceof RepositorioHorarioDeEstudo);
	}
	@Test
	public void fabricarRepositorioDisciplinaTest() {
		RepositorioGenerico <Disciplina, Integer> repositorio = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Disciplina, FabricaRepositorio.BD);
		assertTrue(repositorio instanceof RepositorioDisciplina);
	}
	@Test
	public void fabricarRepositorioBoletimTest() {
		RepositorioGenerico <Boletim, Integer> repositorio = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Boletim, FabricaRepositorio.BD);
		assertTrue(repositorio instanceof RepositorioBoletim);
	}
	@Test
	public void fabricarRepositorioAnotacaoTest() {
		RepositorioGenerico <Anotacao, Integer> repositorio = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Anotacao, FabricaRepositorio.BD);
		assertTrue(repositorio instanceof RepositorioAnotacao);
	}
	@Test
	public void fabricarRepositorioAgendamentoTest() {
		RepositorioGenerico <Agendamento, Integer> repositorio = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Agendamento, FabricaRepositorio.BD);
		assertTrue(repositorio instanceof RepositorioAgendamento);
	}
			
    }

