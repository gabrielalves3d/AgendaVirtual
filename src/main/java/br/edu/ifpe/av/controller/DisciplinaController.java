package br.edu.ifpe.av.controller;

import java.util.List;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.av.persistencia.implementacoes.FabricaRepositorio;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioDisciplina;

@ManagedBean
@SessionScoped
public class DisciplinaController {
	RepositorioGenerico<Disciplina, Integer> repositorioDisciplina = null;

	private Disciplina selecionar;

	public Disciplina getSelecionar() {
		return selecionar;
	}

	public void setSelecionar(Disciplina selecionar) {
		this.selecionar = selecionar;
	}

	public DisciplinaController() {
		this.repositorioDisciplina = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Disciplina,
				FabricaRepositorio.BD);
	}

	public String inserir(Disciplina disciplina) {

		if (((RepositorioDisciplina) this.repositorioDisciplina).recuperarNome(disciplina.getNome()) == null) {
			this.repositorioDisciplina.inserir(disciplina);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A disciplina foi inserida!"));

		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A disciplina já existe!"));
		}
		return "/ApresentarDisciplina.xhtml?faces-redirect=true";

	}

	public String alterar(Disciplina disciplina) {
		this.repositorioDisciplina.alterar(disciplina);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A disciplina foi alterada!"));

		return "ApresentarDisciplina.xhtml";
	}

	public Disciplina recuperarDisciplina(int id) {
		return this.repositorioDisciplina.recuperar(id);
	}

	public String excluir(Disciplina disciplina) {
		this.repositorioDisciplina.excluir(disciplina);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A disciplina foi excluída!"));

		return "ApresentarDisciplina.xhtml";
	}

	public List<Disciplina> recuperarTodosDisciplina() {
		return this.repositorioDisciplina.recuperarTodos();
	}

}
