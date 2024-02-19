import java.util.Scanner;

public class Main {
    public static void main(String[] args)    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção entre 5 e 9: ");
        int numero = sc.nextInt();

        if(numero >= 5 && numero <= 9){
            System.out.println("Você escolheu a opção: " + numero);
        }
        else {
            System.out.println("Inválido");
        }

        sc.close();

    }
}