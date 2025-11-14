import java.util.Scanner;

public class switch_case_string {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um dia da semana");
            String option = scanner.next().equalsIgnoreCase("s") ? "S" : "D";
        switch(option){
             case "Domingo":
                 System.out.println("Dia 1");
                 break;
             case "Segunda":
                 System.out.println("Dia 2");
                 break;
             case "Terça":
                 System.out.println("Dia 3");
                 break;
             case "Quarta":
                 System.out.println("Dia 4");
                 break;
             case "Quinta":
                 System.out.println("Dia 5");
                 break;
             case "Sexta":
                 System.out.println("Dia 6");
                 break;
             case "Sabado":
                 System.out.println("Dia 7");
                 break;

             default:
             System.out.println("Dia Invalido");
         }

    }
}
