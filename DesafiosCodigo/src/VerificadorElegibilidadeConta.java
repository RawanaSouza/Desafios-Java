import java.util.Scanner;

public class VerificadorElegibilidadeConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você está elegível para criar uma conta bancaria.");
        }
        else {
            System.out.println("Você não esta elegível para criar uma conta bancaria.");
        }
        scanner.close();
    }
}
