package br.edu.ifpe.av.builders;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;

@ManagedBean (name="bHorarioDeEstudo")
@RequestScoped
public class BuilderHorarioDeEstudo {

	private int id;
	private Date horario;
	private Disciplina nome;
	
	public BuilderHorarioDeEstudo(int id, Date horario, Disciplina nome) {
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

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public Disciplina getNome() {
		return nome;
	}
	public void setNome(Disciplina nome) {
		this.nome = nome;
	}
	
	public BuilderHorarioDeEstudo(){
		
	}
	 
	public HorarioDeEstudo construirHorarioDeEstudo(){
		return new HorarioDeEstudo(id, horario.toString(), nome);
		
	}
}
