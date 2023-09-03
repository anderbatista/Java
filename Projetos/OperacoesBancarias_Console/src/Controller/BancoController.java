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

        String inicioAplicacao = """
                *********************************************************************
                 - Operações
                 
                 1- Consultar saldo               
                 2- Receber valor
                 3- Transferir valor
                 4- Sair
                *********************************************************************
                 
                 >>>> Opção desejada: 
                """;
        System.out.printf(inicioAplicacao);


        int opcaoDesejada = 0;
        scanner.nextInt();

        String teste;
        switch (opcaoDesejada){
            case 1:
                teste = "Em manutenção";
                break;
            case 2:
                teste = "Em manutenção";
                break;
            case 3:
                teste = "Em manutenção";
                break;
            case 4:
                teste = "Em manutenção";
                break;

        }

    }
}