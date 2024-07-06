import java.util.Scanner;

public class ControleSimplesDeSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();
        double restoLimite = limiteDiario;



        for (int i = 1; i <= limiteDiario;i++) {
            System.out.println("Informe o valor do primeiro saque: ");
            double valorSaque = scanner.nextDouble();

            if(valorSaque == 0) {
                System.out.println("Transações encerradas.\n");
                break;
            } else if(restoLimite == 0) {
                System.out.println("Saldo insuficiente para saque. Transações encerradas.\n");
                break;
            } else if(valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transações encerradas.\n");
                break;
            } else {
                restoLimite -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: " + restoLimite + ". \n");

            }
        System.out.println("Quantidade de saques: " + i + "\n");
        }
        scanner.close();
    }
}