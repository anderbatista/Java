package Service;

import java.util.Scanner;

public class DepositarValor {
    public static void DepositarValor(CadastroUsuario usuario) {
        Scanner ler = new Scanner(System.in);
        double saldo = usuario.getSaldoInicial();

        System.out.printf("\n- Qual valor você quer depositar: ");
        double valorDeposito = ler.nextDouble();
            saldo += valorDeposito;
            usuario.setSaldoInicial(saldo);
            System.out.printf("### Depósito realizado com sucesso.");
    }
}
