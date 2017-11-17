package br.edu.ifpe.av.persistencia.implementacoes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.edu.ifpe.av.model.entity.DaoManagerHiber;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;

public class RepositorioDisciplina implements RepositorioGenerico<Disciplina, Integer>{
		    DaoManagerHiber dao = DaoManagerHiber.getInstance();

		    public void inserir(Disciplina u){
		        dao.persist(u);
		    }
		    
		    public void alterar(Disciplina u){
		        dao.update(u);
		    }
		    
		    
		    public void excluir(Disciplina u){
		        dao.delete(u);
		    }
		    
		    @SuppressWarnings("unchecked")
			public List<Disciplina> recuperarTodos(){
		        return dao.recover("from Disciplina");
		    }

		    
		    public Disciplina recuperar(Integer g) {
		        try{
		            return (Disciplina) dao.recover("from Disciplina where id=" +g);
		        }catch
		                (IndexOutOfBoundsException e){
		            return null;
		            
		        }
		    }


		}
