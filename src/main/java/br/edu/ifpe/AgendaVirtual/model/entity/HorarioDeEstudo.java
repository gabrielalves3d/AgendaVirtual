package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class HorarioDeEstudo {
	
	@Id
	@GeneratedValue
	public int id;
	@Column
	public String horario;
	@OneToMany(mappedBy="usuario", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	@JoinColumn(name="disciplina_id")
	public ArrayList<Disciplina> disciplina;
	@ManyToOne
	@JoinColumn(name="usuario_id", updatable=false)
	private Usuario usuario;
	
	public HorarioDeEstudo(int id, String horario, ArrayList<Disciplina> disciplina) {
		super();
		this.id = id;
		this.horario = horario;
		this.disciplina = disciplina;
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
	

}
