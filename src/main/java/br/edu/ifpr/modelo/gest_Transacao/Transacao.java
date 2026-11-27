package br.edu.ifpr.modelo.gest_Transacao;

import java.math.BigDecimal;
import java.sql.Date;


public class Transacao {
    private int id_Transacao;
    private int id_Tabela;
    private String tipo;
    private BigDecimal valor;
    private String descricao;
    private Date data_Transacao;

    public int getId_Transacao() {
        return id_Transacao;
    }

    public void setId_Transacao(int id_Transacao) {
        this.id_Transacao = id_Transacao;
    }

    public int getId_Tabela() {
        return id_Tabela;
    }

    public void setId_Tabela(int id_Tabela) {
        this.id_Tabela = id_Tabela;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_Transacao() {
        return data_Transacao;
    }
    
    public void setData_Transacao(Date data_Transacao) {
        this.data_Transacao = data_Transacao;
    }
}
