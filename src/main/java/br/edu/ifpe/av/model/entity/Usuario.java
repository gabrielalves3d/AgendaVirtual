package br.edu.ifpe.av.model.entity;


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
	private int id;
	@Column
	private String nome;
	@Column
	private String email;
	@Column
	private String senha;
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="horario_estudo_id", updatable=false)
	private HorarioDeEstudo horarioDeEstudo;
	@OneToMany(mappedBy="usuario", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Anotacao> anotacao;
	@OneToMany(mappedBy="usuario", fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	private List<Agendamento> agendamento;


	public Usuario(int id, String nome, String email, String senha, HorarioDeEstudo horarioDeEstudo,
			List<Anotacao> anotacao, List<Agendamento> agendamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.horarioDeEstudo = horarioDeEstudo;
		this.anotacao = anotacao;
		this.agendamento = agendamento;
	}

	public Usuario() {
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
	public Anotacao getAnotacao() {
		return (Anotacao) anotacao;
	}
	public void setAnotacao(List<Anotacao> anotacao) {
		this.anotacao = anotacao;
	}
	public Agendamento getAgendamento() {
		return (Agendamento) agendamento;
	}
	public void setAgendamento(List<Agendamento> agendamento) {
		this.agendamento = agendamento;
	}
	
}