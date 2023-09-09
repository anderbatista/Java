package Service;
import java.util.Scanner;

public class Menu {
    public static void Menu() {

        int opcaoDesejada = 0;

        CadastroUsuario usuario = new CadastroUsuario();
        usuario.cadastrarUsuario();

        String inicioAplicacao = """
                \n*********************************************************************
                 - Operações
                 
                 1- Consultar saldo               
                 2- Transferir valor
                 3- Depositar valor
                 4- Sair
                *********************************************************************
                 
                 >>>> Opção desejada -> """;
        Scanner lerDados = new Scanner(System.in);

        while (opcaoDesejada != 4){
            System.out.printf(inicioAplicacao);
            opcaoDesejada = lerDados.nextInt();

            if (opcaoDesejada == 1) {
                ConsultarSaldo.ConsultarSaldo(usuario);
            } else if (opcaoDesejada == 2) {
                TransferirValor.TransferirValor(usuario);
            } else if (opcaoDesejada == 3) {
                DepositarValor.DepositarValor(usuario);
            }
        }
    }
}
