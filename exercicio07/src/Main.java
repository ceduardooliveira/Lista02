import java.util.Scanner;

public class Main {
    public static void main(String[] args)    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o coificiente A: ");
        double a = sc.nextDouble();

        System.out.println("Digite o coificiente A: ");
        double b = sc.nextDouble();
        System.out.println("Digite o coificiente A: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if(delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Soluções x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Solução unica: x = " + x);
        }
        else{
            System.out.println("Não há raizes reais para a equação.");
        }

        sc.close();

    }
}