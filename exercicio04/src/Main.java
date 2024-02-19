import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)    {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Insira a nota 2:");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) /2;
        System.out.printf("Sua media é : %.2f%n", media);


        if (media >= 50) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Digite a nota da prova de recuperação: ");
            double provaRecuperacao = sc.nextDouble();

            double novaMedia = (media + provaRecuperacao) / 2;

            if (novaMedia >= 50) {
                System.out.println("Aprovado na recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
        sc.close();

    }
}

