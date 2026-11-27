package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpr.modelo.gest_TabelaFinanca.Tabela_Financa;

public class Tabela_FinancaDAO {

     public void inserirTabelaFinanca (Tabela_Financa tabela_financa) throws SQLException {

          String sql = "INSERT INTO Tabela_Financa (id_Usuario, nome, saldo_Inicial, valor_Alvo) VALUES (?,?,?,?);";

          Connection conexao = null;
          PreparedStatement prt = null;

          try {

               conexao = Conexao.getInstancia().conectar();
               prt = conexao.prepareStatement(sql);
               prt.setInt(1, tabela_financa.getId_Usuario());
               prt.setString(2, tabela_financa.getNome());
               prt.setBigDecimal(3, tabela_financa.getSaldo_Inicial());
               prt.setBigDecimal(4, tabela_financa.getValor_Alvo());

               prt.executeUpdate();

          } catch (SQLException e) {

               System.out.println(e.getMessage());

          } finally {

               prt.close();
               conexao.close();

          }

     }

}
