import java.sql.SQLOutput;

public class MainContribuinte {
    public static void main(String[] args) {

        // a) Criação de dois objetos de cada classe instanciável
        Desempregado d = new Desempregado("João", "Porto", 1000, 5);
        Reformado r = new Reformado("André", "Braga", 2000, 8000);
        TrabalhadorOutrem tO = new TrabalhadorOutrem("António", "Lisboa", 5000, 10000, "Farfetch");
        TrabalhadorProprio tP = new TrabalhadorProprio("Ricardo", "Aveiro", 3000, 20000, "Engenheiro");

        //b) Criação e preenchimento um contentor do tipo array com comprimento superior ao número de
        //objetos criados

        Contribuinte[] contribuintes = new Contribuinte[10];
        contribuintes[0] = d;
        contribuintes[1] = r;
        contribuintes[2] = tO;
        contribuintes[3] = tP;

        // c) Varrimento do contentor para apresentação de cada objeto e respetivo valor do imposto
        //extraordinário.
        System.out.println("Resultado alinea c)");
        System.out.println("Lista dos Contribuintes:");
        System.out.println();
        int i = 1;
        for (Contribuinte contribuinte: contribuintes) {
            if (contribuinte != null) {
                System.out.printf("#Contribuinte %d%n", i);
                System.out.printf("%s. Apresenta um imposto " +
                        "extraordinário de %.1f Euros %n", contribuinte, contribuinte.impostoTotal());
                System.out.println();
            }
        i++;
        }
        System.out.println();

        // d) Varrimento do contentor para apresentação do nome e imposto extraordinário a pagar pelos
        // contribuintes desempregados
        System.out.println("Resultado alinea d)");
        for (Contribuinte contribuinte: contribuintes) {
            if (contribuinte instanceof Desempregado) {
                System.out.printf("Nome do Desempregado: %s, " +
                        "imposto a pagar é %.1f Euros",contribuinte.getNome(), contribuinte.impostoTotal());
            }
        }
        System.out.println();

        // e) Altere o valor da taxa aplicar aos OR dos desempregados
        Desempregado.setTaxaOR(0.01);

        // f) Repita o varrimento da alínea d
        System.out.println("Resultado alinea f)");
        for (Contribuinte contribuinte: contribuintes) {
            if (contribuinte instanceof Desempregado) {
                System.out.printf("Nome do Desempregado: %s, " +
                        "imposto a pagar é %.1f Euros",contribuinte.getNome(), contribuinte.impostoTotal());
            }
        }
    }
}
