import java.util.Scanner;

public class while_do {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var nome ="";
        do {
            System.out.println("Digite um nome. Para Sair Digite Exite");
             nome = scanner.next();
            System.out.println(nome);

        }while(!nome.equalsIgnoreCase("exite"));
        System.out.println("By by!");
    }
}
