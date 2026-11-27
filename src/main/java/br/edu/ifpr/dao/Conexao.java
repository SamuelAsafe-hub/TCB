package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/sis_GeVidaPessoal";
    private static final String USUARIO ="aluno";
    private static final String PASSWORD = "aluno";
    

    public static Conexao getInstancia(){

        return new Conexao();

    }

    public Connection conectar () throws SQLException {

        Connection conexao = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        return conexao;
    }


    

}
