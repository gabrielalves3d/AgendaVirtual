package br.edu.ifpe.av.persistencia.generico;

import java.util.List;

public interface RepositorioGenerico <T, G> {
    
    public void inserir(T t);
    public void excluir(T t);
    public void alterar(T t);
    public T recuperar(G g);
    public List<T> recuperarTodos();

    
    
    
}
