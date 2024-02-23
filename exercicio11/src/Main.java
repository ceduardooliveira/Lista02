import java.util.Scanner;

public class Main {
    public static void main(String[] args)    {

        Scanner sc = new Scanner(System.in);


        System.out.println("Informe um numero valido entre 1 e 7 para saber o dia da semana. ");
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "DOMINGO";
                break;

            case 2:
                dia = "SEGUNDA - feira";
                break;

            case 3:
                dia = "TERÇA - feira";
                break;

            case 4:
                dia = "QUARTA - feira";
                break;

            case 5:
                dia = "QUINTA - feira";
                break;

            case 6:
                dia = "SEXTA - feira";
                break;

            case 7:
                dia = "SABADO";
                break;

            default:
                dia = "valor invalido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();

    }
}