package br.edu.ifpe.AgendaVirtual.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mayara
 */

@Entity
@Table
public class HorarioDeEstudo {
	
	@Id
	@GeneratedValue
	@Column
	public int id;
	@Column
	public String horario;
	@Column
	public Disciplina disciplina;
	
	public HorarioDeEstudo(int id, String horario, Disciplina disciplina) {
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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
	

}
