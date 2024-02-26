import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o dinheiro:");
        double valorInserido = scanner.nextDouble();

        System.out.println("Menu:");
        System.out.println("1. Café Expresso - R$ 0,50");
        System.out.println("2. Café Longo - R$ 1,00");
        System.out.println("3. Cappuccino - R$ 2,50");
        System.out.println("4. Chocolate - R$ 2,00");

        System.out.println("Escolha uma opção:");
        int escolha = scanner.nextInt();

        double preco = 0;
        String bebida = "";

        switch (escolha) {
            case 1:
                preco = 0.50;
                bebida = "Café Expresso";
                break;
            case 2:
                preco = 1.00;
                bebida = "Café Longo";
                break;
            case 3:
                preco = 2.50;
                bebida = "Cappuccino";
                break;
            case 4:
                preco = 2.00;
                bebida = "Chocolate";
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                System.exit(0);
        }

        if (valorInserido >= preco) {
            double troco = valorInserido - preco;
            System.out.println("Bebida selecionada: " + bebida);
            System.out.printf("Seu troco: R$ %.2f\n", troco);
        } else {
            System.out.println("Valor inserido insuficiente. Adicione mais dinheiro.");
        }
    }
}
