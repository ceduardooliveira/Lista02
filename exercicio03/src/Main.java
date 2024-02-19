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

        if(media < 50){
            System.out.println("REPROVADO");
            System.out.printf("Sua media é : %.2f%n", media);
        }
        else {
            System.out.println("APROVADO");
            System.out.printf("Sua media é : %.2f%n", media);
        }

        sc.close();

    }
}