import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inicio = """
                 - Olá, este é meu primeiro exercício!                
                 - Objetivo: Converter a temperatura de Celsius para Fahrenheit.
                 - Vamos lá!
                """;
        System.out.println(inicio);

        int valorEntradaCelsius;

        Scanner dados = new Scanner(System.in);
        System.out.printf("Digite o valor em Celsius que deseja a conversão: ");
        valorEntradaCelsius = dados.nextInt();

        int valorCelsius = valorEntradaCelsius;
        int valorFahrenheit = (int) (valorCelsius * 1.8) + 23;

        System.out.println("A conversão em Fahrenheit é: " + valorFahrenheit);
    }
}