package vencimentos;

import java.util.Comparator;

public class CompararVencimentos implements Comparator<Trabalhador> {

    public CompararVencimentos() {
    }

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
}
