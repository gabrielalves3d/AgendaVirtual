package br.edu.ifpe.av.persistencia.implementacoes;

import java.util.List;

import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.model.entity.DaoManagerHiber;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;

public class RepositorioAnotacao implements RepositorioGenerico<Anotacao, Integer>{
    DaoManagerHiber dao = DaoManagerHiber.getInstance();

    public void inserir(Anotacao u){
        dao.persist(u);
    }
    
    public void alterar(Anotacao u){
        dao.update(u);
    }
    
    
    public void excluir(Anotacao u){
        DaoManagerHiber.getInstance().delete(u);
    }
    
    public List<Anotacao> recuperarTodos(){
        return DaoManagerHiber.getInstance().recover("from Anotacao");
    }

    
    public Anotacao recuperar(Integer g) {
        try{
            return (Anotacao) dao.recover("from Anotacao where id=" +g);
        }catch
                (IndexOutOfBoundsException e){
            return null;
            
        }
    }


}


