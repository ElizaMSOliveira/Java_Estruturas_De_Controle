import java.util.Scanner;

public class If_else_else_if {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var nome = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é Emancipado? S/N");
                                         //Ignore se maiuscula ou menuscula
        var isEmancipatd = scanner.next().equalsIgnoreCase("s");

        if(age>=18) {
            System.out.printf("%s, você tem %s, pode dirigir",nome,age);
        }
        else if(age>=16 && isEmancipatd){
            System.out.printf("%s apesar de ter %s anos, você é Emancipado e pode dirigir", nome,age);
        }
        else{
            System.out.printf("%s, você tem %s anos, não pode dirigir", nome,age);
        }

    }
}
