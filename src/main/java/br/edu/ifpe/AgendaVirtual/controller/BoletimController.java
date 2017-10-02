package br.edu.ifpe.AgendaVirtual.controller;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.edu.ifpe.AgendaVirtual.model.entity.Boletim;
import br.edu.ifpe.AgendaVirtual.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.AgendaVirtual.persistencia.implementacoes.FabricaRepositorio;

@ManagedBean(name = "boletimController")
@SessionScoped
public class BoletimController {
	
	RepositorioGenerico<Boletim, Integer> repositorioBoletim = null;

	private Boletim selecionar;

	public Boletim getSelecionar() {
		return selecionar;
	}
	
	public void setSelecionar(Boletim selecionar) {
		this.selecionar = selecionar;
	}
	
	public BoletimController() {
		this.repositorioBoletim = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Boletim,
				FabricaRepositorio.BD);
	}
	
	public String inserir(Boletim boletim) {
		
		try {
		this.repositorioBoletim.inserir(boletim);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O boletim foi inserido!"));
		} catch(Exception x) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(x.getMessage()));
		}
		return "ApresentarBoletim.xhtml";
	}
	
	public String alterar(Boletim boletim) {
		this.repositorioBoletim.alterar(boletim);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O boletim foi alterado!"));

		return "ApresentarBoletim.xhtml";
	}
	
	public Boletim recuperarBoletim(int id) {
		return this.repositorioBoletim.recuperar(id);
	}

	public void excluir(Boletim boletim) {
		this.repositorioBoletim.excluir(boletim);
	}
	
	public List<Boletim> recuperarTodosBoletim() {
		return this.repositorioBoletim.recuperarTodos();
	}


}

