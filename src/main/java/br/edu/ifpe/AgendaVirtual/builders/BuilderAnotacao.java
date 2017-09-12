package br.edu.ifpe.AgendaVirtual.builders;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.edu.ifpe.AgendaVirtual.model.entity.Anotacao;
import br.edu.ifpe.AgendaVirtual.model.entity.Usuario;

@ManagedBean(name = "bAnotacao")
@RequestScoped
public class BuilderAnotacao {

	private int id;
	private String texto;
	private Date data;
	private Usuario usuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public BuilderAnotacao() {
	}

	public BuilderAnotacao(int id, String texto, Date data, Usuario usuario) {
		super();
		this.id = id;
		this.texto = texto;
		this.data = data;
		this.usuario = usuario;
	}

	public Anotacao construirAnotacao() {
		return new Anotacao(id, texto, data, usuario);
	}

}
