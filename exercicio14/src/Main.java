import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Débito");
        System.out.println("2. Crédito");
        System.out.println("3. Pix");

        int escolhaPagamento = scanner.nextInt();

        double totalAPagar;

        switch (escolhaPagamento) {
            case 1:
                totalAPagar = valorCompra * 0.95; // Desconto de 5% para débito
                System.out.println("Total a pagar (Débito): " + totalAPagar);
                break;
            case 2:
                System.out.println("Crédito selecionado! ");
                System.out.print("Escolha o número de parcelas: ");
                int parcelas = scanner.nextInt();

                if (parcelas <= 4) {
                    totalAPagar = valorCompra * 1.02 ; // Juros simples de 2% até 4 vezes
                } else {
                    totalAPagar = valorCompra * 1.05; // Juros simples de 5% para mais de 4 vezes
                }


                System.out.print("Valor final da compra: " + totalAPagar);
                break;
            case 3:
                totalAPagar = valorCompra * 0.9; // Desconto de 10% para Pix
                System.out.println("Total a pagar (Pix): " + totalAPagar);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
