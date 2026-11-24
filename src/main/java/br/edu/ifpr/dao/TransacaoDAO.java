package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpr.modelo.gest_Transacao.Transacao;

public class TransacaoDAO {

     public void inserirTransacao(Transacao transacao) throws SQLException {

          String sql = "INSERT INTO Transacao (idTransacao, idTabela_Financas, tipo_Transacao, valorTransacao, data, descricao, idUsuario) VALUES (?,?,?, ?);";

          Connection conexao = null;
          PreparedStatement prt = null;

          try {

               conexao = Conexao.getInstancia().conectar();
               prt = conexao.prepareStatement(sql);
               prt.setInt(1, transacao.getId_Transacao());
               prt.setInt(2, transacao.getTabelaFinancas().getIdTabela_Financia());
               prt.setString(3, transacao.getTipoTransacao());
               prt.setBigDecimal(4, transacao.getValor_Transacao());
               prt.setDate(5, transacao.getData());
               prt.setString(6, transacao.getDescricao());
               prt.setInt(7, transacao.getUsuario().getIdUsuario());

               prt.executeUpdate();

          } catch (SQLException e) {

               System.out.println(e.getMessage());

          } finally {

               prt.close();
               conexao.close();

          }

     }

}
