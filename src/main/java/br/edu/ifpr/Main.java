package br.edu.ifpr;
import java.math.BigDecimal;
import java.sql.SQLException;

import br.edu.ifpr.jdbc.UsuarioDAO;
import br.edu.ifpr.modelo.Usuario;

public class Main {
    public static void main(String[] args) throws SQLException {

    Usuario usuario = new Usuario();   
        usuario.setIdUsuario(1);
        usuario.setNickname("Hab");
        usuario.setSenha("123");
        usuario.setSaldo(new BigDecimal(25));

        UsuarioDAO dao = new UsuarioDAO();
        dao.inserir(usuario);


    }
}