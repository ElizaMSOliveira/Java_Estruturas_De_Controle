import java.util.Scanner;

public class exercicio_03 {
    /*ESCREVA UM CÓDIGO QUE O USUÁRIO ENTRE COM UM PRIMEIRO N[UMERO, UM SEGUNDO NUMERO MAIOR QUE
    O PRIMEIRO E
    ESCOLHA ENTRE A OPÇÃO PAR E IMPAR COM ISSO O CODIGO DEVE INFORMAR TODOS OS NÚMEROS PARES
    OI ÍMPARES( DE ACORDO COM A SELEÇÃO INICIAL) NO INTERVALO DE NÚMEROS INFORMADOS INCLUINDO OS
    NÚMEROS INFOTMADOS E EM OSRDEM DECRESCENTE*/
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Primeiro Número");
        var num1 = scanner.nextInt();
        System.out.println("Digite o Segundo Número Maior que o primeiro");
        var num2 = scanner.nextInt();

       if(num1<num2){
           System.out.println("Você quer Ver os Números Pares ou Ímpares?");
           String option = scanner.next();

           switch (option){
               case "Pares":
                   System.out.println("Entrou Pares");
                   for (int i = num2; i >= num1; i--){
                       if (i % 2 == 0){
                           System.out.println(i);
                       }
                   }
                   break;

               case "Impares":
                   System.out.println("Impares");
                   for (int i = num2; i >= num1; i--){
                       if (i % 2 != 0){
                           System.out.println(i);
                       }
                   }
                   break;

               default:
                   System.out.println("Escolha Inválida");

           }

       }else {
           System.out.println("O Primeiro Número Precisa Ser Menor Que O Sengundo");
       }


    }
}
