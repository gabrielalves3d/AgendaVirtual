package br.edu.ifpe.AgendaVirtual.model.entity;

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
	private List<Disciplina> nome;
	
	
	public HorarioDeEstudo(int id, String horario, List<Disciplina> nome) {
		super();
		this.id = id;
		this.horario = horario;
		this.nome = nome;
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

	public List<Disciplina> getNome() {
		return nome;
	}

	public void setNome(List<Disciplina> nome) {
		this.nome = nome;
	}
	public HorarioDeEstudo(){
		
	}
}