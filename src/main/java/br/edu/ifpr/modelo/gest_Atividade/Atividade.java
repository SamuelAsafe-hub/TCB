package br.edu.ifpr.modelo.gest_Atividade;

import java.sql.Date;
import java.sql.Time;

public class Atividade {
    private int id_Atividade;
    private int id_Usuario;
    private String descricao;
    private Date data_Atividade;
    private Time horario;
    private int duracao;

    public int getId_Atividade() {
        return id_Atividade;
    }

    public void setId_Atividade(int id_Atividade) {
        this.id_Atividade = id_Atividade;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_Atividade() {
        return data_Atividade;
    }

    public void setData_Atividade(Date data_Atividade) {
        this.data_Atividade = data_Atividade;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

}
