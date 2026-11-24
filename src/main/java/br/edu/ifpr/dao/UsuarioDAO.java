package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import br.edu.ifpr.modelo.gest_Usuario.Usuario;

public class UsuarioDAO {

    public void insUsuar(Usuario usuario) throws SQLException {

        String sql = "INSERT INTO Usuarios(nickname, senha, saldo, idTabela_Financa, idAtividade) VALUES (?,?,?,?,?)";

        try (Connection conexao = Conexao.getInstancia().conectar();
             PreparedStatement prt = conexao.prepareStatement(sql)) {

            prt.setString(1, usuario.getNickname());
            prt.setString(2, usuario.getSenha());
            prt.setBigDecimal(3, usuario.getSaldo());

            if (usuario.getTabela_Financa() != null) {
                prt.setInt(4, usuario.getTabela_Financa().getIdTabela_Financia());
            } else {
                prt.setNull(4, Types.INTEGER);
            }

            if (usuario.getAtividade() != null) {
                prt.setInt(5, usuario.getAtividade().getIdAtividade());
            } else {
                prt.setNull(5, Types.INTEGER);
            }

            prt.executeUpdate();

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir usuário: " + e.getMessage(), e);
        }
    }
}