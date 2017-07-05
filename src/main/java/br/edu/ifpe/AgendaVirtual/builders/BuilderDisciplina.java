package br.edu.ifpe.AgendaVirtual.builders;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import br.edu.ifpe.AgendaVirtual.model.entity.Disciplina;

@ManagedBean
@RequestScoped
public class BuilderDisciplina {
 
	private int id;
	
	private String nome;
	
	private double nota;
	
	private double mediaFinal;
	
	private boolean situacao;


	public BuilderDisciplina(int id, String nome, double nota, double mediaFinal, boolean situacao) {
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
	public BuilderDisciplina(){
    }

	
	public Disciplina construirDisciplina(){
        return new Disciplina(id, nome, nota, mediaFinal, situacao);
    }

}

