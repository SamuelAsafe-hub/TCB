package br.edu.ifpr.modelo.gest_Transacao;

import java.math.BigDecimal;
import java.sql.Date;

import br.edu.ifpr.modelo.gest_TabelaFinanca.Tabela_Financa;
import br.edu.ifpr.modelo.gest_Usuario.Usuario;

public class Transacao {
    
    private Integer id_Transacao;
    private Tabela_Financa tabelaFinancas;
    private String tipoTransacao;
    private BigDecimal valor_Transacao;
    private Date data;
    private String descricao;
    private Usuario usuario;
   
    public Integer getId_Transacao() {
        return id_Transacao;
    }
   
    public void setId_Transacao(Integer id_Transacao) {
        this.id_Transacao = id_Transacao;
    }
    
    public Tabela_Financa getTabelaFinancas() {
        return tabelaFinancas;
    }
  
    public void setTabelaFinancas(Tabela_Financa tabelaFinancas) {
        this.tabelaFinancas = tabelaFinancas;
    }
   
    public String getTipoTransacao() {
        return tipoTransacao;
    }
   
    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
   
    public BigDecimal getValor_Transacao() {
        return valor_Transacao;
    }
  
    public void setValor_Transacao(BigDecimal valor_Transacao) {
        this.valor_Transacao = valor_Transacao;
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
