package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpr.modelo.gest_Usuario.Usuario;

public class UsuarioDAO {

    public void insUsuar(Usuario usuario) throws SQLException {

        String sql = "INSERT INTO Usuario(nickname, senha) VALUES (?,?)";

        try (Connection conexao = Conexao.getInstancia().conectar();
             PreparedStatement prt = conexao.prepareStatement(sql)) {

            prt.setString(1, usuario.getNickname());
            prt.setString(2, usuario.getSenha());

            prt.executeUpdate();

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir usuário: " + e.getMessage(), e);
        }
    }
}