import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.println("Escolha uma opção:");
            System.out.println("1. Círculo");
            System.out.println("2. Triângulo Retângulo");
            System.out.println("3. Retângulo");


            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Informe o raio do círculo:");
                    double raioCirculo = scanner.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
                    double perimetroCirculo = 2 * Math.PI * raioCirculo;

                    System.out.println("Resultados para Círculo:");
                    System.out.println("Área: " + areaCirculo);
                    System.out.println("Perímetro: " + perimetroCirculo);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe a base do triângulo retângulo:");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.println("Informe a altura do triângulo retângulo:");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                    double perimetroTriangulo = baseTriangulo + alturaTriangulo + Math.sqrt(Math.pow(baseTriangulo, 2) + Math.pow(alturaTriangulo, 2));

                    System.out.println("Resultados para Triângulo Retângulo:");
                    System.out.println("Área: " + areaTriangulo);
                    System.out.println("Perímetro: " + perimetroTriangulo);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe a base do retângulo:");
                    double baseRetangulo = scanner.nextDouble();
                    System.out.println("Informe a altura do retângulo:");
                    double alturaRetangulo = scanner.nextDouble();
                    double areaRetangulo = baseRetangulo * alturaRetangulo;
                    double perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);

                    System.out.println("Resultados para Retângulo:");
                    System.out.println("Área: " + areaRetangulo);
                    System.out.println("Perímetro: " + perimetroRetangulo);
                    System.out.println();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

    }
}
