package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Boletim {
	
	@Id
	@GeneratedValue
	private int id;
	@OneToMany(mappedBy="boletim", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	@JoinColumn(name="disciplina_id")
	private ArrayList<Disciplina> disciplina;

	public Boletim(int id,ArrayList<Disciplina> disciplina) {
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

	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
	

}
