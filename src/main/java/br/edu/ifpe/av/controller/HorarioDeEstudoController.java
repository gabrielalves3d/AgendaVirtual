package br.edu.ifpe.av.controller;


import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.av.persistencia.implementacoes.FabricaRepositorio;

@ManagedBean (name="horarioDeEstudoController")
@SessionScoped
public class HorarioDeEstudoController implements Serializable{
	
	RepositorioGenerico <HorarioDeEstudo, Integer> repositorioHorarioDeEstudo = null;
	RepositorioGenerico<Disciplina, Integer> repositorioDisciplina = null;
	
    private HorarioDeEstudo selecionar;
    private Disciplina disciplinaSelecionado = new Disciplina();
    private DisciplinaController disciplinaController = new DisciplinaController();
    
    public Disciplina getDisciplinaSelecionado() {
		return disciplinaSelecionado;
	}

	public void setDisciplinaSelecionado(Disciplina disciplinaSelecionado) {
		this.disciplinaSelecionado = disciplinaSelecionado;
	}
	
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
    	 horarioDeEstudo.setDisciplinas((List<Disciplina>) disciplinaSelecionado);
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

    public List <HorarioDeEstudo> recuperarTodosHorarioDeEstudo() {
        return this.repositorioHorarioDeEstudo.recuperarTodos();
    }
    public List<Disciplina> recuperarTodosDisciplina() {
        return disciplinaController.repositorioDisciplina.recuperarTodos();
    }
    
}

