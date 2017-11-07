package br.edu.ifpe.av.model.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class HorarioDeEstudo {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String horario;
	@OneToOne
	private Disciplina disciplina;

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
		//Thu Jan 01 08:00:00 GMT-03:00 1970
		
		return horario.substring(11, 16);
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

	public HorarioDeEstudo() {
		
	}
}