import java.util.Scanner;

public class while_ {
    public  static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       var nome = "";
       while(!nome.equals("exit")){
           System.out.println("Digite seu nome: "  );
           nome = scanner.next();
           System.out.println(nome);
       }
    }
}
