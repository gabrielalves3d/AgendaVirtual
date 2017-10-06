package br.edu.ifpe.av.builders;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;

import java.util.List;

@ManagedBean (name="bHorarioDeEstudo")
@RequestScoped
public class BuilderHorarioDeEstudo {

	private int id;
	private String horario;
	private Disciplina nome;
	
	public BuilderHorarioDeEstudo(int id, String horario, Disciplina nome) {
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

	public Disciplina getNome() {
		return nome;
	}

	public void setNome(Disciplina nome) {
		this.nome = nome;
	}
	
	public BuilderHorarioDeEstudo(){
		
	}
	 
	public HorarioDeEstudo construirHorarioDeEstudo(){
		return new HorarioDeEstudo(id, horario, (List<Disciplina>) nome);
		
	}
}
