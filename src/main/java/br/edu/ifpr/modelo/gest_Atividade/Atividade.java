package br.edu.ifpr.modelo.gest_Atividade;

import java.sql.Date;
import java.sql.Time;

import javax.print.DocFlavor.STRING;

import br.edu.ifpr.modelo.gest_Usuario.Usuario;

public class Atividade {
    
    private Integer idAtividade;
    private Usuario usuario; 
    private String nomeAtividade;
    private Date dataAtividade;
    private Time horarioAtividade;
   
    public Integer getIdAtividade() {
        return idAtividade;
    }
    public void setIdAtividade(Integer idAtividade) {
        this.idAtividade = idAtividade;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNomeAtividade() {
        return nomeAtividade;
    }
    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }
    public Date getDataAtividade() {
        return dataAtividade;
    }
    public void setDataAtividade(Date dataAtividade) {
        this.dataAtividade = dataAtividade;
    }
    public Time getHorarioAtividade() {
        return horarioAtividade;
    }
    public void setHorarioAtividade(Time horarioAtividade) {
        this.horarioAtividade = horarioAtividade;
    }
  
   
   
   


}
