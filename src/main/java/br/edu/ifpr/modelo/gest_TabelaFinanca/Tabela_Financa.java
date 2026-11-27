package br.edu.ifpr.modelo.gest_TabelaFinanca;

import java.math.BigDecimal;

public class Tabela_Financa {    
    private int id_Tabela;
    private int id_Usuario;
    private String nome;
    private BigDecimal saldo_Inicial;
    private BigDecimal valor_Alvo;

    public int getId_Tabela() {
        return id_Tabela;
    }

    public void setId_Tabela(int id_Tabela) {
        this.id_Tabela = id_Tabela;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSaldo_Inicial() {
        return saldo_Inicial;
    }

    public void setSaldo_Inicial(BigDecimal saldo_Inicial) {
        this.saldo_Inicial = saldo_Inicial;
    }

    public BigDecimal getValor_Alvo() {
        return valor_Alvo;
    }
    
    public void setValor_Alvo(BigDecimal valor_Alvo) {
        this.valor_Alvo = valor_Alvo;
    }
    
}
