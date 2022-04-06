package vencimentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira",
                500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        System.out.println("### Trabalhadores ###");
        listar(trabs);
        System.out.println("---------------------------------------------------");

        System.out.println("Trabalhadores por Ordem Crescente de vencimento #");

        Comparator<Trabalhador> criterio1 = new Comparator<Trabalhador>() {

            @Override
            public int compare(Trabalhador f1, Trabalhador f2) {
                double sal1 = f1.calcularVencimento();
                double sal2 = f2.calcularVencimento();

                if (sal1 < sal2) {
                    return -1;
                } else if (sal1 > sal2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(trabs, criterio1);
        listar(trabs);
        System.out.println("---------------------------------------------------");
        System.out.println("Trabalhadores por Ordem Decrescente de vencimento #");
        Collections.sort(trabs, Collections.reverseOrder(criterio1));
        listar(trabs);
        System.out.println("---------------------------------------------------");
        System.out.println("Trabalhadores por Ordem Alfabetica de nomes #");

        Comparator<Trabalhador> criterio2 = new Comparator<Trabalhador>() {

            @Override
            public int compare(Trabalhador f1, Trabalhador f2) {
                String nome1 = f1.getNome();
                String nome2 = f2.getNome();
                return nome1.compareTo(nome2);
            }
        };
        Collections.sort(trabs, criterio2);
        listar(trabs);
    }

    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(), 
                                    trab.calcularVencimento());
            }
        }
    }

}
