import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Qual a sua idade: ");
        int idade = sc.nextInt();

//        System.out.printf("Saudações %s", nome);
        Pessoa p1 = new Pessoa(nome, idade);
        // fazer saudacao
        System.out.println(p1.toString());

    }
}
