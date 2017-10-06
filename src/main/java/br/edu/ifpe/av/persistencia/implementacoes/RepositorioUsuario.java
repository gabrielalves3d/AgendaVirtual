package br.edu.ifpe.av.persistencia.implementacoes;

import br.edu.ifpe.av.model.entity.*;
import br.edu.ifpe.av.persistencia.generico.*;

import java.util.List;

public class RepositorioUsuario implements RepositorioGenerico<Usuario, Integer>{
	    DaoManagerHiber dao = DaoManagerHiber.getInstance();

	    
	    public void inserir(Usuario u){
	        dao.persist(u);
	    }
	    
	    public void alterar(Usuario u){
	        dao.update(u);
	    }
	    
	    
	    public void excluir(Usuario u){
	        DaoManagerHiber.getInstance().delete(u);
	    }
	    
	    public List<Usuario> recuperarTodos(){
	        return DaoManagerHiber.getInstance().recover("from Usuario");
	    }

	    
	    public Usuario recuperar(Integer g) {
	        try{
	            return (Usuario) dao.recover("from Usuario where id=" +g);
	        }catch
	                (IndexOutOfBoundsException e){
	            return null;
	            
	        }
	    }

}
