package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Boletim {
	
	@Id
	@GeneratedValue
	private int id;
	@OneToMany
	private List<Disciplina> disciplinas;
	
	
	public Boletim(int id, List<Disciplina> disciplinas) {
		super();
		this.id = id;
		this.disciplinas = disciplinas;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Disciplina> getDisciplinas() {
		return (List<Disciplina>) disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}	
	public Boletim(){
		
	}
}