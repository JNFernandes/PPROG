import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ficheiroNaoCriado = false;
        do {
            System.out.print("Nome do ficheiro: ");
            String caminho = sc. nextLine();
            try {
                File ficheiro = new File(caminho);
                if (ficheiro.createNewFile()) {
                    System.out.println("Ficheiro criado.");
                } else {
                    System.out.println("Ficheiro já existe");
                }
                PrintWriter pw = new PrintWriter(ficheiro);
                System.out.print("Nome (ENTER para terminar): ");
                String nome = sc.nextLine();
                while (!nome.trim().isEmpty()) {
                    String data = ReadData.readDataFromConsole();
                    String info = String.format("%s;%s", nome, data);
                    pw.println(info);
                    System.out.print("Nome (ENTER para terminar): ");
                    nome = sc.nextLine();
                }
                pw.close();
            }catch (IOException e) {
                System.out.println("Impossivel criar ficheiro");
                System.out.printf("%s (acesso negado)", caminho);
                ficheiroNaoCriado = true;
            }
        } while(ficheiroNaoCriado);
    }
}
