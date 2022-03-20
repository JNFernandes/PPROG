
public class MainUtente {
    public static void main(String[] args) {
        // a) crie um conjunto de instâncias de utentes;
        Utente u1 = new Utente("João", "Masculino", 35, 1.71, 62);
        Utente u2 = new Utente("Vitor", "Masculino", 30, 1.76, 90);
        Utente u3 = new Utente("Maria", "Feminino", 30, 1.62, 52);
        Utente u4 = new Utente("Joana",30);
        Utente u5 = new Utente();

        // b) armazene estas instâncias num contentor do tipo array;
        Utente[] utentes = new Utente[10];
        // Exemplos de objetos instanciados
        utentes[0] = u1;
        utentes[1] = u2;
        utentes[2] = u3;
        utentes[3] = u4;
        utentes[4] = u5;

        // c) programe as seguintes listagens separadas, sobre o contentor para:
        // i. obter a representação textual e legível de cada utente;
        for (int  i = 0; i < utentes.length; i++) {
            if (utentes[i] != null) {
                System.out.println(utentes[i]);
            }
        }

        // ii. obter o nome, valor do IMC e grau de obesidade de cada utente;
        for (int  i = 0; i < utentes.length; i++) {
            if (utentes[i] != null) {
                System.out.printf("Nome: %s,IMC: %.1f, Grau de Obesidade: %s %n",utentes[i].getNome(),
                        utentes[i].indiceMassaCorporal(utentes[i].getPeso(), utentes[i].getAltura()),
                        utentes[i].grauObesidade(utentes[i]));
            }
        }

        // iii. obter o nome e o grau de obesidade de cada utente que não tenha a classificação “Saudável”.
        for (int  i = 0; i < utentes.length; i++) {
            if (utentes[i] !=null && !utentes[i].verificarSeUtenteSaudavel(utentes[i]) ) {
                System.out.printf("Nome: %s, Grau de Obesidade: %s %n",utentes[i].getNome(),
                        utentes[i].grauObesidade(utentes[i]));
            }
        }

        // d) altere os valores de referência do IMC para cálculo do grau de obesidade e volte a fazer a listagem com
        //o nome, valor do IMC e grau de obesidade de cada utente;
        int valorInferior = 20;
        int valorSuperior = 25;
        Utente.setIndiceValorReferenciaInferior(valorInferior);
        Utente.setIndiceValorReferenciaSuperior(valorSuperior);
        // nova listagem (codigo repetido :/)
        for (int  i = 0; i < utentes.length; i++) {
            if (utentes[i] != null) {
                System.out.printf("Nome: %s,IMC: %.1f, Grau de Obesidade %s %n",utentes[i].getNome(),
                        utentes[i].indiceMassaCorporal(utentes[i].getPeso(), utentes[i].getAltura()),
                        utentes[i].grauObesidade(utentes[i]));
            }
        }

        // e) altere o valor da idade de um utente para o valor da idade de outro;
        utentes[0].setIdade(utentes[1].getIdade());

        // f) invoque o método para determinar qual dois utentes, usados na alínea anterior, é o mais novo.
        //Implemente código para apresentar uma mensagem adequada
        int verificacao = utentes[0].verificarIdadeEntreDoisUtentes(utentes[1]);

        if (verificacao > 0) {
            System.out.printf("%s é mais novo que %s %n", utentes[1].getNome(), utentes[0].getNome());
        }
        else if (verificacao < 0) {
            System.out.printf("%s é mais novo que %s %n", utentes[0].getNome(), utentes[1].getNome());
        }
        else {
            System.out.println("Os utentes têm a mesma idade");
        }
    }
}
