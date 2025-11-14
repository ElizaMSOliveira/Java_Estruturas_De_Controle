import java.util.Scanner;

public class exercicio_01 {
    /*ESCREVA UM CÓDIGO ONDE O ISUÁRIO ENTRA COM UM NÚMERO
    E SEJA GERADA A TABUADA DE 1 ATE 10 NUMEROS*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para gerar a tabuada: ");
        var numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i+" x "+numero+" = "+ i*numero);

        }


    }
}
