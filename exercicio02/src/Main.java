import java.util.Scanner;

public class Main {
    public static void main(String[] args)    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = sc.nextInt();

        if(numero2 > numero1){
            System.out.println("O maior numero é :" + numero2);
        }
        else if(numero1 > numero2){
            System.out.println("O maior numero é: " + numero1);
        }
        else{
            System.out.println("Os numeros são iguais.");
        }

        sc.close();

    }
}