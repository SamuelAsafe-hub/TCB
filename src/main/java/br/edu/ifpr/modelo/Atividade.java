package br.edu.ifpr.modelo;

import java.sql.Date;
import java.sql.Time;

import javax.print.DocFlavor.STRING;

public class Atividade {
    
    private Integer idAtividade;
    private Usuario id_usuario; 
    private String tipoAtividade;
    private Date dataAtividade;
    private Time horario;
    private Time duracao;
   
    public Integer getIdAtividade() {
        return idAtividade;
    }
  
    public void setIdAtividade(Integer idAtividade) {
        this.idAtividade = idAtividade;
    }
    
    public Usuario getId_usuario() {
        return id_usuario;
    }
   
    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }
  
    public String getTipoAtividade() {
        return tipoAtividade;
    }
   
    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }
   
    public Date getDataAtividade() {
        return dataAtividade;
    }
   
    public void setDataAtividade(Date dataAtividade) {
        this.dataAtividade = dataAtividade;
    }
   
    public Time getHorario() {
        return horario;
    }
   
    public void setHorario(Time horario) {
        this.horario = horario;
    }
  
    public Time getDuracao() {
        return duracao;
    }
   
    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }



}
