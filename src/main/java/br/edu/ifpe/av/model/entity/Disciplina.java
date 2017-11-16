package br.edu.ifpe.av.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.ifpe.av.conversores.entidade.SampleEntity;


@Entity
@Table
public class Disciplina implements Serializable, SampleEntity {
	
	@Id
	@GeneratedValue 
	private int id;
	@Column
	private String nome;
	@Column
	@Embedded
	private List <Double> nota;
	@Column
	private double mediaFinal;
	@Column
	private boolean situacao;


	public Disciplina(int id, String nome, List<Double> nota, double mediaFinal, boolean situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.nota = nota;
		this.mediaFinal = mediaFinal;
		this.situacao = situacao;
		
		
	}

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
        return this.id;
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
    
	public List<Double> getNota() {
		return nota;
	}
    
	public void setNota(List<Double> nota) {
		this.nota = nota;
	}

	public double getMediaFinal() {
		/**
		double soma = 0;
		for (double i = 0; i <= nota.size(); i++) {
			soma += nota.size();
		}
		mediaFinal = soma/4;*/
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	public String toString(){
        return this.nome;
    }
	
	public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.getId().equals(((Disciplina)obj).getId()); 
    }
	
	public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        return hash;
    }

	

}