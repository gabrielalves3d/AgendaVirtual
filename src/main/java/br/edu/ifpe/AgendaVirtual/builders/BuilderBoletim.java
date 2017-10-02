package br.edu.ifpe.AgendaVirtual.builders;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import br.edu.ifpe.AgendaVirtual.model.entity.Boletim;
import br.edu.ifpe.AgendaVirtual.model.entity.Disciplina;

@ManagedBean(name = "bBoletim")
@RequestScoped
public class BuilderBoletim {
	private int id;
	private List<Disciplina> disciplinas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public BuilderBoletim(int id, List<Disciplina> disciplinas) {
		super();
		this.id = id;
		this.disciplinas = disciplinas;
	}

	public Boletim construirBoletim() {
		return new Boletim(id, disciplinas);
	}
}

