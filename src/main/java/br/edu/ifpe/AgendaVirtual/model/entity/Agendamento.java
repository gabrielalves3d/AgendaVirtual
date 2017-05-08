package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Agendamento {

	@Id
	@GeneratedValue
	public int id;
	@Column
	public String atividade;
	@Column
	public Date dataHora;
	@Column
	public String Descricao;
	@OneToMany
	public Disciplina disciplina;
	
	public Agendamento(int id, String atividade, Date dataHora, String descricao, Disciplina disciplina) {
		super();
		this.id = id;
		this.atividade = atividade;
		this.dataHora = dataHora;
		Descricao = descricao;
		this.disciplina = disciplina;
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

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
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
	
	
	
	
	

}
