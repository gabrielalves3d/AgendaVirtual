package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Usuario {
	
	@Id
	@GeneratedValue
	public int id;
	@Column
	public String nome;
	@Column
	public String email;
	@Column
	public String senha;
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="horario_estudo_id")
	private HorarioDeEstudo horarioDeEstudo;
	@OneToOne
	private Boletim boletim;
	@OneToMany(mappedBy="usuario", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Anotacoes> anotacoes;
	@OneToMany
	private List<Agendamento> agendamento;
	
	
	public Usuario(int id,String nome, String email, String senha, HorarioDeEstudo horarioDeEstudo, Boletim boletim,
			Anotacoes anotacoes, Agendamento agendamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.horarioDeEstudo = horarioDeEstudo;
		this.boletim = boletim;
		this.anotacoes = anotacoes;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public HorarioDeEstudo getHorarioDeEstudo() {
		return horarioDeEstudo;
	}
	public void setHorarioDeEstudo(HorarioDeEstudo horarioDeEstudo) {
		this.horarioDeEstudo = horarioDeEstudo;
	}
	public Boletim getBoletim() {
		return boletim;
	}
	public void setBoletim(Boletim boletim) {
		this.boletim = boletim;
	}
	public Anotacoes getAnotacoes() {
		return anotacoes;
	}
	public void setAnotacoes(Anotacoes anotacoes) {
		this.anotacoes = anotacoes;
	}
	public Agendamento getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}
	
	
}
