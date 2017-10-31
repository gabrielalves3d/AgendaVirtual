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
import javax.persistence.Table;

@Entity
@Table
public class HorarioDeEstudo {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String horario;
	@ManyToMany
	private List<Disciplina> disciplinas;

	public HorarioDeEstudo(int id, String horario, List<Disciplina> disciplinas) {
		super();
		this.id = id;
		this.horario = horario;
		this.disciplinas = disciplinas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHorario() {
		String ret = horario;

		if (horario != null) {

			SimpleDateFormat fomt = new SimpleDateFormat("HH:mm");
			Date date = null;
			try {
				date = fomt.parse(horario);
				ret = fomt.format(date);
			} catch (ParseException e) {

			}
		}

		return ret;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public HorarioDeEstudo() {
		this.disciplinas = new ArrayList<Disciplina>();
	}
}