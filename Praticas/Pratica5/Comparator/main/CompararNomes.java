package vencimentos;

import java.util.Comparator;

public class CompararNomes implements Comparator<Trabalhador> {
    public CompararNomes() {
    }

    @Override
    public int compare(Trabalhador f1, Trabalhador f2) {
        String nome1 = f1.getNome();
        String nome2 = f2.getNome();
        return nome1.compareTo(nome2);
    }
}
