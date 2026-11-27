package br.edu.ifpr.modelo.gest_Usuario;

import java.util.ArrayList;
import java.util.Scanner;

   

public class UsuarioService {
    
    public final static Scanner LER = new Scanner(System.in);
    // Regras de Negócio:

    // ---- Usuário e acesso ----
    public static void acessoUsuariConta () {

        // Salvar NICKNAME dos Usuários!
        ArrayList<String> listNickname = new ArrayList<>();

        System.out.println("Digite seu nickname:");

        String nickname = LER.nextLine();
        
        // Converter String em char para contar os caracteres!
       char[] qtdLetras = nickname.toCharArray();

       if(nickname.length() < 5 || nickname.length() > 12) {

        System.out.println("Número de carateres inválido");

       }

    }
























}

