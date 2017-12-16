package br.edu.ifpe.av.model.entity;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;


public interface UsuDao extends RepositorioGenerico<Usuario, Integer>{
	public Usuario recuperarEmail(String email);
}
