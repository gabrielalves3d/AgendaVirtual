package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Usuario {
	
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String nome;
	@Column
	private String email;
	@Column
	private String senha;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="horario_estudo_id")
	private HorarioDeEstudo horarioDeEstudo;
	
	@OneToOne
	@JoinColumn(name="boletim_id")
	private Boletim boletim;
	@OneToMany(mappedBy="usuario", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	@JoinColumn(name="anotacoes_id")
	private List<Anotacoes> anotacoes;
	@OneToMany(mappedBy="usuario", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	@JoinColumn(name="agendamento_id")
	private List<Agendamento> agendamento;
	@ManyToOne
	@JoinColumn(name="usuario_id", updatable=false)
	private Usuario usuario;
	
	
	public Usuario(int id,String nome, String email, String senha, HorarioDeEstudo horarioDeEstudo, Boletim boletim,
			Anotacoes anotacoes, Agendamento agendamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.horarioDeEstudo = horarioDeEstudo;
		this.boletim = boletim;
		this.anotacoes = (List<Anotacoes>) anotacoes;
		this.agendamento = (List<Agendamento>) agendamento;
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
		return (Anotacoes) anotacoes;
	}
	public void setAnotacoes(Anotacoes anotacoes) {
		this.anotacoes = (List<Anotacoes>) anotacoes;
	}
	public Agendamento getAgendamento() {
		return (Agendamento) agendamento;
	}
	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = (List<Agendamento>) agendamento;
	}
	
	
}
