import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("Informe o valor de saque desejado: ");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500;

        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } else if (saque <= saldo + limiteChequeEspecial) {
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        } 
        scanner.close();
    }
}
