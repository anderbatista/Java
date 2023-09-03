package Controller;
import java.util.Scanner;

import Service.LimpaConsole;
import Service.CadastroUsuario;

public class BancoController {
    public static void main(String[] args) {
        String telaBemVindo = """
                 *********************************************************************
                 - Bem vindo!
                 - Este é o meu primeiro projeto de console em JAVA.               
                 - Objetivo: Input dos dados básicos do cliente em forma de extrato,
                 criação de operações básicas em um banco, como consultar saldo, 
                 receber valor, transferir valor e sair da aplicação.
                 - Vamos lá!
                 *********************************************************************
                 
                 >>>> Pressione enter
                """;
        System.out.printf(telaBemVindo);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        //LimpaConsole.limpaConsole();
        CadastroUsuario.CadastroUser();

    }
}