package br.edu.ifpe.av.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Anotacao {
	
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String texto;
	@Column
	private String data;
	@ManyToOne
	@JoinColumn(name="anotacao_id", updatable=false)
	private Usuario usuario;
	
	public Anotacao(){
		
	}
	
	public Anotacao(int id, String texto, String data, Usuario usuario) {
		super();
		this.id = id;
		this.texto = texto;
		this.data = data;
		this.usuario = usuario;
	}

	
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

	public String getData() {
		//Wed Nov 22 00:00:00 GMT-03:00 2017//

		String dataResultado = data;
		try {		
		if (validarData(data)) {
		    dataResultado = data.substring(3,10) + "" + " "+ data.substring(30,34);
		}
		} catch (Exception e) {
			System.out.println(data);
			e.printStackTrace();
		}
		return dataResultado;

	}

	public Boolean validarData(String dataResultado){

		if (dataResultado == null || dataResultado.isEmpty() || (data.length() < 34)) {
			return false;
		}
         return true;
	}


	public void setData(String data) {
		this.data = data;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}