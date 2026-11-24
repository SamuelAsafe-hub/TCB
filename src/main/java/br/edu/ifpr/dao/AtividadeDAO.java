package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpr.modelo.gest_Atividade.Atividade;
import br.edu.ifpr.modelo.gest_TabelaFinanca.Tabela_Financa;

public class AtividadeDAO {

    public void inserirAtividade(Atividade atividade) throws SQLException {

        String sql = "INSERT INTO Atividade (idAtividade, idUsuario, nome_Atividade, dataAtividade, horarioAtividade) VALUES (?,?,?);";

        Connection conexao = null;
        PreparedStatement prt = null;

        try {

            conexao = Conexao.getInstancia().conectar();
            prt = conexao.prepareStatement(sql);
            prt.setInt(1, atividade.getIdAtividade());
            prt.setInt(2, atividade.getUsuario().getIdUsuario());
            prt.setString(3, atividade.getNomeAtividade());
            prt.setDate(4, atividade.getDataAtividade());
            prt.setTime(4, atividade.getHorarioAtividade());

            prt.executeUpdate();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            prt.close();
            conexao.close();

        }

    }

}
