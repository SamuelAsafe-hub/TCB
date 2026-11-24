package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpr.modelo.gest_TabelaFinanca.Tabela_Financa;
import br.edu.ifpr.modelo.gest_Usuario.Usuario;

public class Tabela_FinancaDAO {

     public void inserirTabelaFinanca (Tabela_Financa tabela_financa) throws SQLException {

          String sql = "INSERT INTO Tabela_Financa (idTabela_Financias, nome, valor, idUsuario, idTransacao) VALUES (?,?,?);";

          Connection conexao = null;
          PreparedStatement prt = null;

          try {

               conexao = Conexao.getInstancia().conectar();
               prt = conexao.prepareStatement(sql);
               prt.setInt(1, tabela_financa.getIdTabela_Financia());
               prt.setString(2, tabela_financa.getNomeTabela());
               prt.setBigDecimal(3, tabela_financa.getValorTransacaos());
               prt.setInt(3, tabela_financa.getUsuario().getIdUsuario());
               prt.setInt(3, tabela_financa.getTransacao().getId_Transacao());

               prt.executeUpdate();

          } catch (SQLException e) {

               System.out.println(e.getMessage());

          } finally {

               prt.close();
               conexao.close();

          }

     }

}
