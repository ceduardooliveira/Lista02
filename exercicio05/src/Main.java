import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)    {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a média do aluno: ");
        double media = sc.nextDouble();

        if(media >= 8.5){
            System.out.println("Conceito: A");
        }
        else if (media >= 7 && media < 8.5){
            System.out.println("Conceito: B");
        }
        else if (media >= 5 && media <7){
            System.out.println("Conceito: C");
        }
        else{
            System.out.println("Conceito: D");
        }

        sc.close();

    }
}