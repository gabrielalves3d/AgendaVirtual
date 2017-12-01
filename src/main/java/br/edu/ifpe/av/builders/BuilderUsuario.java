package br.edu.ifpe.av.builders;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;
import br.edu.ifpe.av.model.entity.Usuario;


@ManagedBean(name = "bUsuario")
@RequestScoped
public class BuilderUsuario {
	private int id;
	private String nome;
	private String email;
	private String senha;
	private HorarioDeEstudo horarioDeEstudo;
	private List<Anotacao> anotacao;
	private List<Agendamento> agendamento;
	
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
	
	public List<Anotacao> getAnotacao() {
		return anotacao;
	}
	public void setAnotacao(List<Anotacao> anotacao) {
		this.anotacao = anotacao;
	}
	public List<Agendamento> getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(List<Agendamento> agendamento) {
		this.agendamento = agendamento;
	}
	
	public BuilderUsuario(){
		
	}
	
	public BuilderUsuario(int id, String nome, String email, HorarioDeEstudo horarioDeEstudo,
			List<Anotacao> anotacao, List<Agendamento> agendamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.horarioDeEstudo = horarioDeEstudo;
		this.anotacao = anotacao;
		this.agendamento = agendamento;
	}
	
	public Usuario construirUsuario() {
		return new Usuario(id, nome, email, senha, horarioDeEstudo, anotacao, agendamento);
	}
	
}


