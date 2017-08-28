package br.edu.ifpe.AgendaVirtual.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpe.AgendaVirtual.model.entity.Disciplina;
import br.edu.ifpe.AgendaVirtual.model.entity.HorarioDeEstudo;
import br.edu.ifpe.AgendaVirtual.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.AgendaVirtual.persistencia.implementacoes.FabricaRepositorio;

@ManagedBean 
@SessionScoped
public class HorarioDeEstudoController {
	
	RepositorioGenerico <HorarioDeEstudo, Integer> repositorioHorarioDeEstudo = null;
    private HorarioDeEstudo selecionar;
	
	public HorarioDeEstudo getSelecionar(){
		return selecionar;
	}
	     
	public void setSelecionar(HorarioDeEstudo selecionar){
		this.selecionar = selecionar;
	}

	public HorarioDeEstudoController(){
        this.repositorioHorarioDeEstudo = FabricaRepositorio.fabricarRepositorio(
                FabricaRepositorio.HorarioDeEstudo, FabricaRepositorio.BD);
    }
    
     public String inserir(HorarioDeEstudo horarioDeEstudo) {
        this.repositorioHorarioDeEstudo.inserir(horarioDeEstudo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Horario de Estudo foi inserido!"));

        return "ApresentarHorarioDeEstudo.xhtml";
     }

    public String alterar(HorarioDeEstudo horarioDeEstudo) {
        this.repositorioHorarioDeEstudo.alterar(horarioDeEstudo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Horario de Estudo foi alterado!"));

        return "ApresentarHorarioDeEstudo.xhtml";
    }

    public HorarioDeEstudo recuperarHorarioDeEstudo(int id) {
        return this.repositorioHorarioDeEstudo.recuperar(id);
    }

    public String excluir(HorarioDeEstudo horarioDeEstudo) {
        this.repositorioHorarioDeEstudo.excluir(horarioDeEstudo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Horario de Estudo foi excluído!"));

        return "ApresentarHorarioDeEstudo.xhtml";
    }

    public List<HorarioDeEstudo> recuperarTodosHorarioDeEstudo() {
        return this.repositorioHorarioDeEstudo.recuperarTodos();
    }
    
}


