package br.edu.ifpe.av.persistencia.implementacoes;

import java.util.List;

import br.edu.ifpe.av.model.entity.DaoManagerHiber;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;

public class RepositorioHorarioDeEstudo implements RepositorioGenerico<HorarioDeEstudo, Integer>{
    DaoManagerHiber dao = DaoManagerHiber.getInstance();

    public void inserir(HorarioDeEstudo u){
        dao.persist(u);
    }
    
    public void alterar(HorarioDeEstudo u){
        dao.update(u);
    }
    
    
    public void excluir(HorarioDeEstudo u){
        DaoManagerHiber.getInstance().delete(u);
    }
    
    public List<HorarioDeEstudo> recuperarTodos(){
        return DaoManagerHiber.getInstance().recover("from HorarioDeEstudo");
        
    }
   
    public HorarioDeEstudo recuperar(Integer g) {
        try{
            return (HorarioDeEstudo) dao.recover("from HorarioDeEstudo where id=" +g);
        }catch
                (IndexOutOfBoundsException e){
            return null;
            
        }
    }


}



