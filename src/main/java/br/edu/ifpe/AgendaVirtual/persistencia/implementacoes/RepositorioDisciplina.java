package br.edu.ifpe.AgendaVirtual.persistencia.implementacoes;

import java.util.List;

import br.edu.ifpe.AgendaVirtual.model.entity.Disciplina;
import br.edu.ifpe.AgendaVirtual.model.entity.DaoManagerHiber;
import br.edu.ifpe.AgendaVirtual.persistencia.generico.RepositorioGenerico;

public class RepositorioDisciplina implements RepositorioGenerico<Disciplina, Integer>{
		    DaoManagerHiber dao = DaoManagerHiber.getInstance();

		    public void inserir(Disciplina u){
		        dao.persist(u);
		    }
		    
		    public void alterar(Disciplina u){
		        dao.update(u);
		    }
		    
		    
		    public void excluir(Disciplina u){
		        DaoManagerHiber.getInstance().delete(u);
		    }
		    
		    public List<Disciplina> recuperarTodos(){
		        return DaoManagerHiber.getInstance().recover("from Disciplina");
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
