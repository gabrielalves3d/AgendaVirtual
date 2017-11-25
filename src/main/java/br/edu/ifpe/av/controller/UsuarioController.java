package br.edu.ifpe.av.controller;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpe.av.model.entity.Usuario;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.av.persistencia.implementacoes.FabricaRepositorio;

@ManagedBean(name = "usuarioController")
@SessionScoped
public class UsuarioController {

	RepositorioGenerico<Usuario, Integer> repositorioUsuario = null;
	
	private Usuario selecionar;
	
	public Usuario getSelecionar() {
		return selecionar;
	}

	public void setSelecionar(Usuario selecionar) {
		this.selecionar = selecionar;
	}
	
	public UsuarioController() {
		this.repositorioUsuario = FabricaRepositorio.fabricarRepositorio(FabricaRepositorio.Usuario,
				FabricaRepositorio.BD);
	}
	
	public String inserir(Usuario usuario) {
		
		try {
		this.repositorioUsuario.inserir(usuario);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuário inserido!"));
		} catch(Exception x) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(x.getMessage()));
		}
		return "CadastrarDisciplina.xhtml";
	}
	
	public String alterar(Usuario usuario) {
		this.repositorioUsuario.alterar(usuario);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuário alterado!"));

		return "menu.xhtml";
	}
	
	public Usuario recuperarUsuario(int id) {
		return this.repositorioUsuario.recuperar(id);
	}
	
	public String excluir(Usuario usuario) {
		this.repositorioUsuario.excluir(usuario);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Dados excluídos com sucesso!"));
        return "ApresentarUsuario.xhtml";

	}
	
	public List<Usuario> recuperarTodosUsuario() {
		return this.repositorioUsuario.recuperarTodos();
	}

}
