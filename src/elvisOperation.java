import java.util.Scanner;

public class elvisOperation {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var nome = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é Emancipado? S/N");
        //Ignore se maiuscula ou menuscula
        var isEmancipatd = scanner.next().equalsIgnoreCase("s");
        //        maior igula a 18 ou maior igual a 16 e r=emancipado
        var canDrive = (age >= 18) || (age>=116 && isEmancipatd);
        var message = canDrive ? //se true entra e xeiver a primeira msg
                nome + ", Voçê pode dirigir \n" :
                nome + ", você não pode dirigi \nr";// se não for true entra na ultima messagem
        System.out.println(message);

        System.out.println("Fim da Execução");

    }
}


