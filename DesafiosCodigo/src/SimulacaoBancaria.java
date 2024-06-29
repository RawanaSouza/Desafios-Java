import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
         System.out.println("Olá cliente! Seja bem-vindo!");
        System.out.println();
        System.out.println("Menu de serviços:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("0. Encerrar");
        System.out.println();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma das opções: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f%n", saldo);

                    break;
                case 2:
                    System.out.println("Informe o valor de saque: ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    } else { 
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n", saldo);                    
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
