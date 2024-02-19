import java.util.Scanner;

public class Main {
    public static void main(String[] args)    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        double numero = sc.nextInt();


        if (numero >=0){
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada é: " + raizQuadrada);
        }
        else{
            System.out.println("Valor inválido!");
        }

        sc.close();

    }
}