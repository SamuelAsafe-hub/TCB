package br.edu.ifpr.modelo;

import java.math.BigDecimal;

public class Usuario {
   
    private Integer idUsuario;
    private String Nickname;
    private String Senha;
    private BigDecimal saldo;
    private Tabela_Financa tabela_Financa;
    private Atividade atividade;
   
    public Integer getIdUsuario() {
        return idUsuario;
    }
   
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
   
    public String getNickname() {
        return Nickname;
    }
   
    public void setNickname(String nickname) {
        Nickname = nickname;
    }
   
   
    public String getSenha() {
        return Senha;
    }
    
    public void setSenha(String senha) {
        Senha = senha;
    }
   
    public BigDecimal getSaldo() {
        return saldo;
    }
   
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
   
    public Tabela_Financa getTabela_Financa() {
        return tabela_Financa;
    }
    
    public void setTabela_Financa(Tabela_Financa tabela_Financa) {
        this.tabela_Financa = tabela_Financa;
    }
   
    public Atividade getAtividade() {
        return atividade;
    }
    
    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    
  


}
