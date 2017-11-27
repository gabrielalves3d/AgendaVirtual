package br.edu.ifpe.av.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Agendamento {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String atividade;
	@Column
	private String data;
	@Column
	private String hora;
	@Column
	private String Descricao;
	@OneToOne
	private Disciplina disciplina;
	@ManyToOne
	@JoinColumn(name="usuario_id", updatable=false)
	private Usuario usuario;
	
	public Agendamento(int id, String atividade, String data, String hora, String descricao, Disciplina disciplina, Usuario usuario) {
		super();
		this.id = id;
		this.atividade = atividade;
		this.data = data;
		this.hora= hora;
		this.Descricao = descricao;
		this.disciplina = disciplina;
		this.usuario = usuario;
	}

	
	public Agendamento() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public String getData() {
		//Wed Nov 22 00:00:00 GMT-03:00 2017//
		
        String dataResultado = data.substring(3,10) + "" + " "+ data.substring(30,34);
	    return dataResultado;

	}

	public void setData(String data) {
		this.data = data;
	}
	

	public String getHora() {
		return hora.substring(11, 16);
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	

}
