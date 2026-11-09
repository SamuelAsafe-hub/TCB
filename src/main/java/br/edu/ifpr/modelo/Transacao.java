package br.edu.ifpr.modelo;

import java.math.BigDecimal;
import java.sql.Date;

public class Transacao {
    
    private Integer id_Transacao;
    private Tabela_Financa tabelaFinacas;
    private String tipoTransacao;
    private BigDecimal valor;
    private Date data;
    private String descricao;
    private Usuario usuario;
   
    public Integer getId_Transacao() {
        return id_Transacao;
    }
   
    public void setId_Transacao(Integer id_Transacao) {
        this.id_Transacao = id_Transacao;
    }
   
    public Tabela_Financa getTabelaFinacas() {
        return tabelaFinacas;
    }
   
    public void setTabelaFinacas(Tabela_Financa tabelaFinacas) {
        this.tabelaFinacas = tabelaFinacas;
    }
  
    public String getTipoTransacao() {
        return tipoTransacao;
    }
  
    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
 
    public BigDecimal getValor() {
        return valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    public Date getData() {
        return data;
    }
   
    public void setData(Date data) {
        this.data = data;
    }
 
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
    public Usuario getUsuario() {
        return usuario;
    }
  
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }



}
