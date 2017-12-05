package br.edu.ifpe.av.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.ifpe.av.conversores.entidade.SampleEntity;


@Entity
@Table
@ManagedBean
public class Disciplina implements Serializable, SampleEntity {
	
	@Id
	@GeneratedValue 
	private int id;
	@Column (unique=true)
	private String nome;
	@ElementCollection
	private List <Double> nota;
	@Column
	private double mediaFinal;
	@Column
	private String situacao;


	public Disciplina(int id, String nome, List<Double> nota, double mediaFinal, String situacao) {
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
		
		double soma = 0.0;
		for (int i = 0; i < nota.size(); i++) {
			soma += nota.get(i);
		}
		mediaFinal = soma/4.0;
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public String getSituacao() {
		double soma = 0.0;
		for (int i = 0; i < nota.size(); i++) {
			soma += nota.get(i);
		}
		if(soma>=24) {
			return "Aprovado";
		}else {
		return "Reprovado";
		}
	}

	public void setSituacao(String situacao) {
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

	public Double getNota1() {
		return this.nota.get(0);
	}
	
	public void setNota1(Double nota1) {
		this.nota.set(0, nota1);
	}
	
	public Double getNota2() {
		return this.nota.get(1);
	}
	
	public void setNota2(Double nota2) {
		this.nota.set(1, nota2);
	}
	
	public Double getNota3() {
		return this.nota.get(2);
	}
	
	public void setNota3(Double nota3) {
		this.nota.set(2, nota3);
	}
	
	public Double getNota4() {
		return this.nota.get(3);
	}
	
	public void setNota4(Double nota4) {
		this.nota.set(3, nota4);
	}
}