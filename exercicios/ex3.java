import java.util.Scanner;
import java.util.Locale;

public class ex3 {
    public static void main(String[] args) {


        Locale.setDefault(new Locale("pt", "BR"));

        Scanner scanner = new Scanner(System.in);

 

        System.out.print("Digite seu nome: ");

        String nome = scanner.nextLine();

 

        System.out.print("Digite sua idade: ");

        int idade = scanner.nextInt();

 

        System.out.print("Digite sua altura: ");

        float altura = scanner.nextFloat();

 

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);

        System.out.println("Altura: " + altura);

 

        scanner.close();

    }

}

   


