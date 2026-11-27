package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpr.modelo.gest_Atividade.Atividade;

public class AtividadeDAO {

    public void inserirAtividade(Atividade atividade) throws SQLException {

        String sql = "INSERT INTO Atividade (id_Usuario, descricao, data_Atividade, horario, duracao) VALUES (?,?,?,?,?);";

        Connection conexao = null;
        PreparedStatement prt = null;

        try {

            conexao = Conexao.getInstancia().conectar();
            prt = conexao.prepareStatement(sql);
            prt.setInt(1, atividade.getId_Usuario());
            prt.setString(2, atividade.getDescricao());
            prt.setDate(3, atividade.getData_Atividade());
            prt.setTime(4, atividade.getHorario());
            prt.setInt(5, atividade.getDuracao());

            prt.executeUpdate();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            prt.close();
            conexao.close();

        }

    }

}
