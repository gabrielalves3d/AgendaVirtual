package br.edu.ifpe.av.builders;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpe.av.model.entity.Boletim;
import br.edu.ifpe.av.model.entity.Disciplina;

import java.util.ArrayList;

@ManagedBean(name = "bBoletim")
@RequestScoped
public class BuilderBoletim {
	private int id;
	private List<Disciplina> disciplinas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public BuilderBoletim(){
		
	}
	
	public BuilderBoletim(int id, List<Disciplina> disciplinas) {
		super();
		this.id = id;
		this.disciplinas = disciplinas;
	}

	public Boletim construirBoletim() {
		return new Boletim(id, disciplinas);
	}
}

