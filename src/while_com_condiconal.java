import java.util.Scanner;

public class while_com_condiconal {
    public  static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);

        while (true) {
            System.out.println("Digite um nome");
            var nome=scanner.next();
            System.out.println(nome);

            if(nome.equalsIgnoreCase("exite")) break;
        }
    }
}
