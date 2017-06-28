package br.edu.ifpe.AgendaVirtual.persistencia.implementacoes;

import java.util.List;

import br.edu.ifpe.AgendaVirtual.model.entity.DaoManagerHiber;
import br.edu.ifpe.AgendaVirtual.model.entity.Agendamento;
import br.edu.ifpe.AgendaVirtual.persistencia.generico.RepositorioGenerico;

public class RepositorioAgendamento implements RepositorioGenerico<Agendamento, Integer>{
    DaoManagerHiber dao = DaoManagerHiber.getInstance();

    public void inserir(Agendamento u){
        dao.persist(u);
    }
    
    public void alterar(Agendamento u){
        dao.update(u);
    }
    
    
    public void excluir(Agendamento u){
        DaoManagerHiber.getInstance().delete(u);
    }
    
    public List<Agendamento> recuperarTodos(){
        return DaoManagerHiber.getInstance().recover("from Agendamento");
    }

    
    public Agendamento recuperar(Integer g) {
        try{
            return (Agendamento) dao.recover("from Agendamento where id=" +g);
        }catch
                (IndexOutOfBoundsException e){
            return null;
            
        }
    }

}
