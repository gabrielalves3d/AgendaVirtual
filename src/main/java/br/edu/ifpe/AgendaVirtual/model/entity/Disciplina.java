package br.edu.ifpe.AgendaVirtual.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Disciplina {
	
	@Id
	@GeneratedValue
	public int id;
	@Column
	public String nome;
	@Column
	public double nota;
	@Column
	public double mediaFinal;
	@Column
	public boolean situacao;
	
	
	public Disciplina(int id, String nome, double nota, double mediaFinal, boolean situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.nota = nota;
		this.mediaFinal = mediaFinal;
		this.situacao = situacao;
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
	
	
	
	
	

}
