import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Serviço: ");
        String servico = scanner.nextLine().trim();

        System.out.println("Nome do cliente: ");
        String entradaCliente = scanner.nextLine().trim();

        String[] partes = entradaCliente.split(",");
        //String nomeCliente = partes[0].trim();
        boolean contratado = false;


        for (int i = 0; i < partes.length; i++) {
            if (partes[i].trim().equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            } 
        }

        if(contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        scanner.close();
    }
}
