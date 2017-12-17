package br.edu.ifpe.av.controller;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpe.av.model.entity.DaoManagerHiber;
import br.edu.ifpe.av.model.entity.UsuDao;
import br.edu.ifpe.av.model.entity.Usuario;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;
import br.edu.ifpe.av.persistencia.implementacoes.FabricaRepositorio;
import br.edu.ifpe.av.persistencia.implementacoes.RepositorioUsuario;


/**
 *
 * @author Larissa
 */

@ManagedBean(name = "usuarioController")
@SessionScoped
public class UsuarioController {

	RepositorioGenerico<Usuario, Integer> repositorioUsuario = null;
	private Usuario usuario;
	UsuDao usuDao;
	private Usuario selecionar;

	@PostConstruct
	public void inicializar() {
		usuario = new Usuario();
		usuDao =  new RepositorioUsuario();
	}

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
		return "restrito/CadastrarDisciplina.xhtml";
	}

	public String alterar(Usuario usuario) {
		this.repositorioUsuario.alterar(usuario);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuário alterado!"));

		return "ApresentarUsuario.xhtml";
	}

	public Usuario recuperarUsuario(int id) {
		return this.repositorioUsuario.recuperar(id);
	}

	public String excluir(Usuario usuario) {
		this.repositorioUsuario.excluir(usuario);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Dados excluídos com sucesso!"));
		return "restrito/ApresentarUsuario.xhtml";

	}

	public List<Usuario> recuperarTodosUsuario() {
		return this.repositorioUsuario.recuperarTodos();
	}
	
	

	DaoManagerHiber dao = DaoManagerHiber.getInstance();


	public String realizarLogin(String email, String senha){

		if(email!=null && senha!=null){
			if (this.usuDao != null) {
				Usuario usu = this.usuDao.recuperarEmail(email);

				if(usu != null){
					if (usu.getEmail().equals(email)&& usu.getSenha().equals(senha) ) {

						dao.recuperarUsuarioLogin(email, senha);
						return "restrito/CadastrarDisciplina.xhtml";
					}
				}
			}
		}
	
		return "DADOS INCORRETOS";
	
		

}
	 public String sairDoSistema() {
	        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	        return "/index.xhtml";
	 }
	
}