package Service;

public class ConsultarSaldo {
    public static void ConsultarSaldo(CadastroUsuario usuario) {
        double saldo = usuario.getSaldoInicial();

        System.out.println("\n### Seu saldo atual é de: R$" + saldo);
    }
}
