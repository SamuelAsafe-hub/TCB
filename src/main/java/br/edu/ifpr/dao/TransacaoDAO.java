package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpr.modelo.gest_Transacao.Transacao;

public class TransacaoDAO {

     public void inserirTransacao(Transacao transacao) throws SQLException {

          String sql = "INSERT INTO Transacao (id_Tabela, tipo, valor, descricao, data_Transacao) VALUES (?,?,?,?,?);";

          Connection conexao = null;
          PreparedStatement prt = null;

          try {

               conexao = Conexao.getInstancia().conectar();
               prt = conexao.prepareStatement(sql);
               prt.setInt(1, transacao.getId_Tabela());
               prt.setString(2, transacao.getTipo());
               prt.setBigDecimal(3, transacao.getValor());
               prt.setString(4, transacao.getDescricao());
               prt.setDate(5, transacao.getData_Transacao());

               prt.executeUpdate();

          } catch (SQLException e) {

               System.out.println(e.getMessage());

          } finally {

               prt.close();
               conexao.close();

          }

     }

}
