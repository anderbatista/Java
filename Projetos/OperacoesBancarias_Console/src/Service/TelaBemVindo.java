package Service;
import java.util.Scanner;

public class TelaBemVindo {
    public static void bemVindo() {

        String inicioBemVindo = """
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
        System.out.printf(inicioBemVindo);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }


}
