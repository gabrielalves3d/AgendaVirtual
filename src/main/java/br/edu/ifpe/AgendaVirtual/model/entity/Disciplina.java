package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Disciplina {
	
	@Id
	@GeneratedValue 
	private int id;
	@Column
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
	@ManyToOne
	@JoinColumn(name="disciplina_id", updatable=false)
	private Boletim boletim;
	@ManyToOne
	@JoinColumn(name="disciplina_id", updatable=false)
	private List<Agendamento> agendamento;


	public Disciplina(int id, String nome, double nota, double mediaFinal, boolean situacao,
			HorarioDeEstudo horarioEstudo, Boletim boletim, List<Agendamento> agendamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.nota = nota;
		this.mediaFinal = mediaFinal;
		this.situacao = situacao;
		this.horarioEstudo = horarioEstudo;
		this.boletim = boletim;
		this.agendamento = agendamento;
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

	public Boletim getBoletim() {
		return boletim;
	}

	public void setBoletim(Boletim boletim) {
		this.boletim = boletim;
	}

	public List<Agendamento> getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(List<Agendamento> agendamento) {
		this.agendamento = agendamento;
	}
	
}