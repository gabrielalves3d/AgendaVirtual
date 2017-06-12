package br.edu.ifpe.AgendaVirtual.persistencia.implementacoes;

import br.edu.ifpe.AgendaVirtual.model.entity.Agendamento;
import br.edu.ifpe.AgendaVirtual.model.entity.Anotacao;
import br.edu.ifpe.AgendaVirtual.model.entity.Boletim;
import br.edu.ifpe.AgendaVirtual.model.entity.Disciplina;
import br.edu.ifpe.AgendaVirtual.model.entity.HorarioDeEstudo;
import br.edu.ifpe.AgendaVirtual.persistencia.generico.RepositorioGenerico;

public class FabricaRepositorio {
	public static final int Usuario = 1;
    public static final int HorarioDeEstudo = 2;
    public static final int Disciplina = 3;
    public static final int Boletim =4;
    public static final int Anotacao=5;
    public static final int Agendamento=6;
   
    public static final int BD = 1;

    public static RepositorioGenerico fabricarRepositorio(int tipoNegocio, int tipoPersistencia) {
        if (tipoPersistencia == BD) {
            if (tipoNegocio == Usuario) {
                return new RepositorioUsuario();
            }else if(tipoNegocio== HorarioDeEstudo){
                return new RepositorioHorarioDeEstudo();
            }else if(tipoNegocio == Disciplina){
                return new RepositorioDisciplina();
            }else if(tipoNegocio== Boletim){
                return new RepositorioBoletim();
            }else if(tipoNegocio==Anotacao){
                return new RepositorioAnotacao();
            }else if(tipoNegocio==Agendamento){
                return new RepositorioAgendamento();
            }
            
        }
        
        return null;
    }

}
