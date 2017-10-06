package br.edu.ifpe.av.persistencia.implementacoes;

import java.util.List;

import br.edu.ifpe.av.model.entity.Boletim;
import br.edu.ifpe.av.model.entity.DaoManagerHiber;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;

public class RepositorioBoletim  implements RepositorioGenerico<Boletim, Integer>{
    DaoManagerHiber dao = DaoManagerHiber.getInstance();

    public void inserir(Boletim u){
        dao.persist(u);
    }
    
    public void alterar(Boletim u){
        dao.update(u);
    }
    
    
    public void excluir(Boletim u){
        DaoManagerHiber.getInstance().delete(u);
    }
    
    public List<Boletim> recuperarTodos(){
        return DaoManagerHiber.getInstance().recover("from Boletim");
    }

    
    public Boletim recuperar(Integer g) {
        try{
            return (Boletim) dao.recover("from Boletim where id=" +g);
        }catch
                (IndexOutOfBoundsException e){
            return null;
            
        }
    }




}
