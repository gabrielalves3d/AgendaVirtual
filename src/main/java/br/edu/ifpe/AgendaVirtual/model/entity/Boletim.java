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
	@OneToMany(mappedBy="id", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Disciplina> disciplina;
	
	
	public Boletim(int id, List<Disciplina> disciplina) {
		super();
		this.id = id;
		this.disciplina = disciplina;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Disciplina> getDisciplina() {
		return (List<Disciplina>) disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}	
	public Boletim(){
		
	}
}