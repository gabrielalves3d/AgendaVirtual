package br.edu.ifpe.av.builders;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.hibernate.dialect.DB2390Dialect;

import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.Usuario;


@ManagedBean(name = "bAgendamento")
@RequestScoped
public class BuilderAgendamento {
	
	private int id;
	private String atividade;
	private String data;
	private String hora;
	private String descricao;
	private Disciplina nome;
	private Usuario usuario;
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Disciplina getNome() {
		return nome;
	}
	public void setNome(Disciplina nome) {
		this.nome = nome;
	}
	
	public BuilderAgendamento(){
	}
	
	public BuilderAgendamento(int id, String atividade, String data, String hora, String descricao, Disciplina nome, Usuario usuario){
		this.id = id;
		this.atividade = atividade;
		this.data = data;
		this.hora = hora;
		this.descricao = descricao;
		this.nome = nome;
		this.usuario = usuario;
	}
	
	public Agendamento construirAgendamento(){
		return new Agendamento(id, atividade, data, hora, descricao, nome, usuario); 
	}
	

}
