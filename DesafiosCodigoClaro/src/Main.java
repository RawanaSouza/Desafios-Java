import java.util.Scanner;

public class Main {
    public static String verificarComboCompleto(String[] servicosContratados) {
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        for(String servico : servicosContratados) {
            if(servico.trim().equalsIgnoreCase("movel")) {
                movelContratado = true;
            } else if (servico.trim().equalsIgnoreCase("banda larga")) {
                bandaLargaContratada = true;
            } else if(servico.trim().equalsIgnoreCase("tv")) {
                tvContratada = true;
            }
        }

        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Serviços: ");
        String input = scanner.nextLine();

        String[] servicosContratados = input.split(",");

        String resultado = verificarComboCompleto(servicosContratados);

        System.out.println(resultado);

        scanner.close();
    }
}
