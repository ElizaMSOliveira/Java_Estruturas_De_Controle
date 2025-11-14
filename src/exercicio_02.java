import java.util.Scanner;

public class exercicio_02 {
    /*ESCREVA UM CÓDIGO ONDE O USUÁRIO ENTRA COM A SUA ALTURA E PESO, SEJA FEITO O CÁLCULO
    DO IMC(IMC=PESO/ALTURAxALTURA) ESEJA EXIBIDA A MENSAGEM DE ACORDO COM O RESULTADO.
      *SE FOR MENOR OU IGUAL A 18,5 ABAIXO DO PESO
      *SE FOR ENTRE 18,5 E 24,9 PESO IDEAL
      *SE FOR ENTRE 25 E 29,9 LAVIMENTE ACIMA DO PESO
      *SE FOR ENTRE 30 E 34,9 OBESIDADE GRAI I
      *SE FOR ENTRE 35 E 39,9 OBESIDADE GRAU II(SEVERA)
      *SE FOR MAIOR QUE 40 OBESIDADE GRAU III(MORBIDA) */

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Difite a sua altura: ");
        var altura= scanner.nextDouble();
        System.out.println("Digite seu peso: ");
        var peso= scanner.nextDouble();
        var imc = peso/(altura*altura);

        if(imc <= 18.5 ){
            System.out.println("Abaixo do Peso");
        }else if(imc > 18.5 && imc < 24.9){
            System.out.println("Peso Ideal");
        }else if(imc > 24.9 && imc < 29.9){
            System.out.println("Levimente Acima do Peso");
        }else if(imc > 29.9 && imc < 34.9){
            System.out.println("Obesidade Grau I");
        }else if(imc > 34.9 && imc < 39.9){
            System.out.println("Obesidade Grau II(Severa)");
        }else if(imc > 39.9){
            System.out.println("Obesidade Grau III(Morbida");
        }


    }
}
