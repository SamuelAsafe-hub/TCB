package br.edu.ifpr;

import java.util.Map;

import br.edu.ifpr.dao.UsuarioDAO;
import br.edu.ifpr.modelo.gest_Usuario.Usuario;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {

    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("src/main/resources/static", Location.EXTERNAL);
        });

        // Cria uma rota
        app.get("/api/teste", pedido -> pedido.result("API funcionando!"));

        app.post("/api/usuarios", pedido -> {
            Usuario u = pedido.bodyAsClass(Usuario.class);
            new UsuarioDAO().insUsuar(u);
            pedido.status(201).json(Map.of("mensagem", "Usuário criado!"));
        });
    
         app.start(8081); // Liga na porta 8081
        
    }

}