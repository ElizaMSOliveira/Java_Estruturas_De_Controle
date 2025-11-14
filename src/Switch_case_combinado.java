import java.util.Scanner;

public class Switch_case_combinado {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor de 1 a 7");
        var option = scanner.nextInt();
        //Unindo 2 cases para informar final de semana
        switch (option) {
            case 1, 7:
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Dia Invalido");
        }
    }
}

