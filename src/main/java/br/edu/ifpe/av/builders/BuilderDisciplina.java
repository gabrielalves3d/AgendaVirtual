package br.edu.ifpe.av.builders;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.edu.ifpe.av.model.entity.Disciplina;

@ManagedBean (name="bDisciplina")
@RequestScoped
public class BuilderDisciplina  {
 
	private int id;
	
	private String nome;
	
	private List <Double> nota;
	double DisciplinaNota1;
	double DisciplinaNota2;
	double DisciplinaNota3;
	double DisciplinaNota4;
	
	private double mediaFinal;
	
	private boolean situacao;


	public BuilderDisciplina(int id, String nome, List<Double> nota, double DisciplinaNota1,double DisciplinaNota2,
			double DisciplinaNota3,double DisciplinaNota4, double mediaFinal, boolean situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.nota = nota;
		this.mediaFinal = mediaFinal;
		this.situacao = situacao;
		this.DisciplinaNota1 = DisciplinaNota1;
		this.DisciplinaNota2 = DisciplinaNota2;
		this.DisciplinaNota3 = DisciplinaNota3;
		this.DisciplinaNota4 = DisciplinaNota4;
		
		
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

	public List<Double> getNota() {
		return nota;
	}

	public void setNota(List<Double> nota) {
		this.nota = nota;
	}

	public double getMediaFinal() {
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
	public double getDisciplinaNota1() {
		return DisciplinaNota1;
	}

	public void setDisciplinaNota1(double disciplinaNota1) {
		DisciplinaNota1 = disciplinaNota1;
	}

	public double getDisciplinaNota2() {
		return DisciplinaNota2;
	}

	public void setDisciplinaNota2(double disciplinaNota2) {
		DisciplinaNota2 = disciplinaNota2;
	}

	public double getDisciplinaNota3() {
		return DisciplinaNota3;
	}

	public void setDisciplinaNota3(double disciplinaNota3) {
		DisciplinaNota3 = disciplinaNota3;
	}

	public double getDisciplinaNota4() {
		return DisciplinaNota4;
	}

	public void setDisciplinaNota4(double disciplinaNota4) {
		DisciplinaNota4 = disciplinaNota4;
	}
	public BuilderDisciplina(){
    }

	
	public Disciplina construirDisciplina(){
		nota = new ArrayList<Double>();
		nota.add(DisciplinaNota1);
		nota.add(DisciplinaNota2);
		nota.add(DisciplinaNota3);
		nota.add(DisciplinaNota4);
        return new Disciplina(id, nome, nota, mediaFinal, situacao);
    }

	

}

