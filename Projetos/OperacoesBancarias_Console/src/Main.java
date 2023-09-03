import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inicio = """
                 *********************************************************************
                 - Bem vindo!
                 - Este é o meu primeiro projeto de console em JAVA.               
                 - Objetivo: Input dos dados básicos do cliente em forma de extrato,
                 criação de operações básicas em um banco, como consultar saldo, 
                 receber valor, transferir valor e sair da aplicação.
                 - Vamos lá!
                 *********************************************************************
                """;
        System.out.println(inicio);

        String nome;

        Scanner dados = new Scanner(System.in);
        System.out.printf("Digite seu nome e sobrenome: ");
        nome = dados.nextLine();

        System.out.println("Nome: " + nome);
    }
}