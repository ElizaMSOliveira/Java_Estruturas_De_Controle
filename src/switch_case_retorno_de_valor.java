import java.util.Scanner;

public class switch_case_retorno_de_valor {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7: ");
        var option = scanner.nextInt();
        var message =  switch (option) {

            case 1, 7 ->{
                //Quando se tem uma linha não pecisa indicar onde é o retorno mas quando é mais que uma é preciso dizer qual a linha de retorno
                //A keyword de retorno do switch é  YIELD
                var day = option == 1 ? "Domingo": "Sabado";
                yield String.format("Hoje é %s, fim de semana!");
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
           // case 7 -> "Sabado";
            default -> "Opção Inválida!";
        };
        System.out.println(message);


    }
}
