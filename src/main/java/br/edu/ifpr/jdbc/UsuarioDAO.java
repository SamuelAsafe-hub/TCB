package br.edu.ifpr.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpr.modelo.Usuario;

public class UsuarioDAO {

public void inserir(Usuario usuario) throws SQLException {


    String sql = "INSERT INTO Usuarios(idUsuario, nickname, senha, saldo) VALUES (?,?,?, ?);";

    Connection conexao = null;
    PreparedStatement prt = null;

   try {


        conexao = Conexao.getInstancia().conectar();
        prt = conexao.prepareStatement(sql);
        prt.setInt(1, usuario.getIdUsuario());
        prt.setString(2, usuario.getNickname());
        prt.setString(3, usuario.getSenha());
        prt.setBigDecimal(4,usuario.getSaldo());
        
        
        
        prt.executeUpdate();


   } catch (SQLException e){

    System.out.println(e.getMessage());

   } finally {
        
     prt.close();
     conexao.close();
  
    }


  
   }

}
