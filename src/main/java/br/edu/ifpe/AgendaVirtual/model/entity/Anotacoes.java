package br.edu.ifpe.AgendaVirtual.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mayara
 */

@Entity
@Table
public class Anotacoes {
	
	@Id
	@GeneratedValue
	@Column
	public int id;
	@Column
	public String texto;
	@Column
	public Date data;
	
	
	public Anotacoes(int id, String texto, Date data) {
		super();
		this.id = id;
		this.texto = texto;
		this.data = data;
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


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}

	
}
