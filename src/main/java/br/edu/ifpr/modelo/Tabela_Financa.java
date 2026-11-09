package br.edu.ifpr.modelo;

import java.math.BigDecimal;

public class Tabela_Financa {
 
    private Integer idTabela_Financia;
    private String nomeTabela;
    private BigDecimal valorTransacao;
    private Usuario usuario;
    private Transacao transacao;
    
    public Integer getIdTabela_Financia() {
        return idTabela_Financia;
    }
  
    public void setIdTabela_Financia(Integer idTabela_Financia) {
        this.idTabela_Financia = idTabela_Financia;
    }
   
    public String getNomeTabela() {
        return nomeTabela;
    }
    
    public void setNomeTabela(String nomeTabela) {
        this.nomeTabela = nomeTabela;
    }
    
    public BigDecimal getValorTransacaos() {
        return valorTransacao;
    }
    
    public void setValorTransacao(BigDecimal valorTransacao) {
        this.valorTransacao = valorTransacao;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
   
    public Transacao getTransacao() {
        return transacao;
    }
    
    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    


}
