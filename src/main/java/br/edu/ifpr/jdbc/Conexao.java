package br.edu.ifpr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/gerenciatesteVp";
    private static final String USUARIO ="aluno";
    private static final String PASSWORD = "aluno";
    
    public Conexao() {

    }

    public static Conexao getInstancia(){

        return new Conexao();

    }

    public Connection conectar () throws SQLException {

        return DriverManager.getConnection(URL, USUARIO, PASSWORD);

    }




}
