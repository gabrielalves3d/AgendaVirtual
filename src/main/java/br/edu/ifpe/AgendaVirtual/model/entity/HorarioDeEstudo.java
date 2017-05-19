package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@OneToMany(mappedBy="horarioDeEstudo_id", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	private ArrayList<Disciplina> disciplina;
	@OneToOne(mappedBy="horarioDeEstudo_id", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	private Usuario usuario;
	
	public HorarioDeEstudo(int id, String horario, ArrayList<Disciplina> disciplina, Usuario usuario) {
		super();
		this.id = id;
		this.horario = horario;
		this.disciplina = disciplina;
		this.usuario = usuario;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}