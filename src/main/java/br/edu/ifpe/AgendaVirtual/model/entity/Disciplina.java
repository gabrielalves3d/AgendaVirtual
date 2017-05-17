package br.edu.ifpe.AgendaVirtual.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Disciplina {
	
	@Id
	@GeneratedValue 
	private int id;
	@Column
	@NotNull
	private String nome;
	@Column
	private double nota;
	@Column
	private double mediaFinal;
	@Column
	private boolean situacao;
	@ManyToOne
	@JoinColumn(name="disciplina_id", updatable=false)
	private HorarioDeEstudo horarioEstudo;
	
	
	
	public Disciplina(int id, String nome, double nota, double mediaFinal, boolean situacao,HorarioDeEstudo horarioEstudo) {
		super();
		this.id = id;
		this.nome = nome;
		this.nota = nota;
		this.mediaFinal = mediaFinal;
		this.situacao = situacao;
		this.horarioEstudo = horarioEstudo;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}


	public double getMediaFinal() {
		return mediaFinal;
	}


	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}


	public boolean isSituacao() {
		return situacao;
	}


	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}



	public HorarioDeEstudo getHorarioEstudo() {
		return horarioEstudo;
	}



	public void setHorarioEstudo(HorarioDeEstudo horarioEstudo) {
		this.horarioEstudo = horarioEstudo;
	}
	
	
	
	
	

}
