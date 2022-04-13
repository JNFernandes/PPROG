import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Comparator;

public class MainContribuinte {
    public static void main(String[] args) {

        // a) Na classe principal, crie um contentor do tipo ArrayList<Contribuinte> chamado contribuintes
        List<Contribuinte> contribuintes = new ArrayList<>();

        // b) Adicione contribuintes ao contentor, usando o seguinte código:
        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new TrabalhadorOutrem("Ana", "Ovar", 1800, 300, "CMM"));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new TrabalhadorOutrem("Salvio", "Seixal", 8000, 1000, "SSB"));
        contribuintes.add(new TrabalhadorProprio("Mário", "Guarda", 1500, 300, "Eletricista"));
        contribuintes.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
        contribuintes.add(new TrabalhadorOutrem("João", "Lisboa", 800, 100, "CML"));
        contribuintes.add(new TrabalhadorProprio("Carla", "Porto", 15000, 1000, "Advogado"));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));

        // c) Programe uma listagem dos contribuintes do contentor.
        System.out.println("Listagem dos contribuintes: ");
        listarForEachContribuinte(contribuintes);
        System.out.println("--------------------------------------------------------------------------");

        // d) Programe a eliminação do desempregado "Lito Vidal" do contentor. Para o efeito use o método
        //remove(Object o) do contentor e, passando por parâmetro, uma nova instância equivalente à que se
        //pretende eliminar.
        boolean res = contribuintes.remove(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        System.out.println("Foi corretamente removido? " + res);

        // e) Programe uma nova listagem dos contribuintes do contentor e verifique que a eliminação do
        //desempregado do contentor não foi efetuada.
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Listagem atualizada dos contribuintes: ");
        listarForEachContribuinte(contribuintes);

        // f) Reescreva o método equals nas classes da hierarquia de contribuintes.
        // verificar metodo na classe Contribuintes

        // g) Invoque novamente a eliminação do desempregado e verifique que foi realizada.
        System.out.println("Foi corretamente removido? " + res);

        // h) Invoque o método equals verificando a equivalência de:
//          a) Duas instâncias com características iguais.
//          b) Duas instâncias do mesmo tipo com características diferentes.
//          c) Duas instâncias de tipos diferentes.
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("### Equals ###");
        System.out.println("Duas instâncias com características iguais: " +
                new Reformado("Valter Cubilhas", "Olival", 600, 400).
                        equals(new Reformado("Valter Cubilhas", "Olival",
                                600, 400)));

        System.out.println("Duas instâncias do mesmo tipo com características diferentes: " +
                new Reformado("Valter Cubilhas", "Olival", 600, 400).
                equals(new Reformado("Jaime Magalhães",
                        "Porto", 1500, 100)));

        System.out.println("Duas instâncias de tipos diferentes: " +
                new Reformado("Valter Cubilhas", "Olival", 600, 400).
                        equals(new TrabalhadorOutrem("João", "Lisboa",
                                800, 100, "CML")));

//        9. Programe as seguintes listagens dos contribuintes armazenados no contentor:
//        a) Ordem alfabética inversa dos tipos de contribuintes.
        Comparator<Contribuinte> criterio1 = new Comparator<Contribuinte>() {

            @Override
            public int compare(Contribuinte c1, Contribuinte c2) {
                String class1 = String.valueOf(c1.getClass());
                String class2 = String.valueOf(c2.getClass());
                return class1.compareTo(class2);
            }
        };
        Collections.sort(contribuintes, criterio1.reversed());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Listagem dos contribuintes por ordem alfabetica revertida das classes: ");
        listarOrdemClasses(contribuintes);

//      b) Ordem alfabética dos tipos de contribuintes e, em cada tipo de contribuinte, os contribuintes
//      apresentados por ordem alfabética dos seus nomes.

        Comparator<Contribuinte> criterio2 = new Comparator<Contribuinte>() {
            @Override
            public int compare(Contribuinte o1, Contribuinte o2) {
                String class1 = String.valueOf(o1.getClass());
                String class2 = String.valueOf(o2.getClass());
                String nome1 = o1.getNome();
                String nome2 = o2.getNome();
                if (class1.equals(class2)) {
                    return nome1.compareTo(nome2);
                }
                return class1.compareTo(class2);
            }
        };

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Listagem dos contribuintes por ordem alfabetica seguida do nome: ");
        Collections.sort(contribuintes, criterio2);
        listarOrdemClasses(contribuintes);
    }

    private static void listarForEachContribuinte(List<Contribuinte> lista) {
        for (Contribuinte contribuinte : lista) {
            System.out.printf("Nome do contribuinte: %s%n", contribuinte.getNome());
        }
    }

    private static void listarOrdemClasses(List<Contribuinte> lista) {
        for (Contribuinte contribuinte : lista) {
            System.out.printf("Nome da classe: %s, Nome do contribuinte: %s%n", contribuinte.getClass(), contribuinte.getNome());
        }
    }
}
