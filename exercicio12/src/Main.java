import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Resultado da Soma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado da Divisão: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
