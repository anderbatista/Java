package Service;
import Service.LimpaConsole;

import java.util.Scanner;

public class CadastroUsuario {
    public static void CadastroUser() {

        String nome;
        int opcoesTipoDeConta;
        String tipoConta;
        double saldoinicial;

        LimpaConsole.limpaConsole();

        Scanner dados = new Scanner(System.in);
        System.out.printf("Digite seu nome e sobrenome: ");
        nome = dados.nextLine();
        while (true) {
            System.out.println("Escolha o tipo de conta: ");
            System.out.println("1 - Conta corrente");
            System.out.println("2 - Conta poupança");
            System.out.printf("Sua opção -> ");
            opcoesTipoDeConta = dados.nextInt();

            if (opcoesTipoDeConta == 1) {
                tipoConta = "Conta corrente";
                break;
            } else if (opcoesTipoDeConta == 2) {
                tipoConta = "Conta poupança";
                break;
            } else {
                System.out.println("""
            ##########################################################
            ### Opção inválida. Por favor, escolha a opção 1 ou 2. ###
            ##########################################################
            """);
            }
        }

        System.out.printf("Saldo inicial: ");
        saldoinicial = dados.nextDouble();


        String inicioApp = """
        *********************************************************************
                                    Bem vindo!        
        """;
        System.out.println(inicioApp);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldoinicial);
        System.out.println("*********************************************************************");
    }
}