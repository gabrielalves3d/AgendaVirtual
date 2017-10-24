package br.edu.ifpe.av.persistencia.implementacoes;

import br.edu.ifpe.av.model.entity.Agendamento;
import br.edu.ifpe.av.model.entity.Anotacao;
import br.edu.ifpe.av.model.entity.Disciplina;
import br.edu.ifpe.av.model.entity.HorarioDeEstudo;
import br.edu.ifpe.av.persistencia.generico.RepositorioGenerico;

public class FabricaRepositorio {
	public static final int Usuario = 1;
    public static final int HorarioDeEstudo = 2;
    public static final int Disciplina = 3;
    public static final int Anotacao=4;
    public static final int Agendamento=5;
   
    public static final int BD = 1;

    public static RepositorioGenerico fabricarRepositorio(int tipoNegocio, int tipoPersistencia) {
        if (tipoPersistencia == BD) {
            if (tipoNegocio == Usuario) {
                return new RepositorioUsuario();
            }else if(tipoNegocio== HorarioDeEstudo){
                return new RepositorioHorarioDeEstudo();
            }else if(tipoNegocio == Disciplina){
                return new RepositorioDisciplina();
            }else if(tipoNegocio==Anotacao){
                return new RepositorioAnotacao();
            }else if(tipoNegocio==Agendamento){
                return new RepositorioAgendamento();
            }
            
        }
        
        return null;
    }

}
