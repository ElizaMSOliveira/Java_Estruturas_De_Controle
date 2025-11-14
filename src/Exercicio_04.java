import java.util.Scanner;

public class Exercicio_04 {
    /* ESCREAVA UM CÓDIGO ONDE O USUÁRIO IRFORMA UM NÚMERO INICIAL, POSTERIORMENTE IRÁ INFORMAR N NÚMEROS,
     A EXECUÇÃO DO CÓDIGO IRÁ CONTINUAR ATE QUE O NÚMERO INFORMADO DIVIDIDO PELO PRIMEIRO
       TENHA RESTO DIFERENTE DE 0 NA DIVISÃO,
     NÚMEROS MENORES QUE O PRIMEIRO NUMERO DEVER
     SER IGNORADOS*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero inicial: ");
        var n1 = sc.nextInt();
        var n2 =0;

        do {
            System.out.println("Informe outro Número: ");
            n2 = sc.nextInt();
            if(n2 < n1){
                n2 = 0;
            }

        }while(n2%n1 == 0);
        System.out.println("By by!");

    }

}
