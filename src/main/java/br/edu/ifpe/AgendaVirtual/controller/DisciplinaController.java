package br.edu.ifpe.AgendaVirtual.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import br.edu.ifpe.AgendaVirtual.model.entity.Disciplina;
import br.edu.ifpe.AgendaVirtual.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.AgendaVirtual.persistencia.implementacoes.FabricaRepositorio;

public class DisciplinaController {
RepositorioGenerico<Disciplina, Integer> repositorioDisciplina = null;
	
	private Disciplina selecionar;
	
	public Disciplina getSelecionar(){
		return selecionar;
	}
	     
	public void setSelecionar(Disciplina selecionar){
		this.selecionar = selecionar;
	}
	
	public DisciplinaController(){
	        this.repositorioDisciplina = FabricaRepositorio.fabricarRepositorio(
	                FabricaRepositorio.Disciplina, FabricaRepositorio.BD);
	    }
	    
	     public String inserir(Disciplina disciplina) {
	        this.repositorioDisciplina.inserir(disciplina);
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A disciplina foi inserida!"));

	        return "ApresentarDisciplina.xhtml";
	     }

	    public String alterar(Disciplina disciplina) {
	        this.repositorioDisciplina.alterar(disciplina);
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A disciplina foi alterada!"));

	        return "ApresentarDisciplina.xhtml";
	    }

	    public Disciplina recuperarDisciplina(int id) {
	        return this.repositorioDisciplina.recuperar(id);
	    }

	    public void excluir(Disciplina disciplina) {
	        this.repositorioDisciplina.excluir(disciplina);
	    }

	    public List<Disciplina> recuperarTodosDisciplina() {
	        return this.repositorioDisciplina.recuperarTodos();
	    }
	    
	}

