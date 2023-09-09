package Service;
import java.util.Scanner;

public class TransferirValor {
    public static void TransferirValor(CadastroUsuario usuario) {
        Scanner ler = new Scanner(System.in);
        double saldo = usuario.getSaldoInicial();

        System.out.printf("\n- Qual valor você quer transferir: ");
        double valorTransferir = ler.nextDouble();
        if (valorTransferir > saldo) {
            System.out.printf("### Sem saldo para realizar a transferência.");
        } else {
            saldo -= valorTransferir;
            usuario.setSaldoInicial(saldo);
            System.out.printf("### Transferência realizada com sucesso.");
        }

    }
}
