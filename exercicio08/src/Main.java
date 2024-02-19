import java.util.Scanner;

public class Main {
    public static void main(String[] args)    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0 ){
            System.out.println("O número é PAR");
        }
        else {
            System.out.println("O numero é ÍMPAR");
        }

        sc.close();

    }
}