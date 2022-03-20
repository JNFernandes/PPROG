public class Main {
    public static void main(String[] args) {
        // a) Crie uma instância da classe Data com o nome data1 e que represente a data de hoje.
        Data data1 = new Data(2022, 3, 9);

        // b) Mostre data1 usando o formato por extenso.
        System.out.println(data1.toAnoMesDiaString());

        // c) Crie uma outra instância da classe Data chamada data2 que guarde a data 25 de abril de 1974
        Data data2 = new Data(1974, 4, 25);

        // d) Mostre data2 no formato "ano/mês/dia"
        System.out.println(data2.toAnoMesDiaString());

        // e) Utilize o método de instância isMaior para confirmar que, de facto, data1 é mais recente do que
        //data2.

        if (data1.isMaior(data2)) {
            System.out.println("A data1 e mais recente que a data2");
        }
        else if (data2.isMaior(data1)) {
            System.out.println("A data2 e mais recente que a data1");
        }
        else {
            System.out.println("As datas são iguais");
        }

        // f) Determine o número de dias entre data1 e data2
        System.out.printf("A diferença de dias entre as duas datas é %d dias %n", data1.calcularDiferenca(data2));

        // g) Determine o número de dias que faltam para o Natal, usando o método que recebe, por
        //parâmetro, o dia, o mês e o ano de uma data.
        int contarDias = data1.calcularDiferenca(2022, 12, 25);
        System.out.printf("O numero de dias que falta para o natal são: %d dias %n", contarDias);

        // h) Determine o dia da semana em que ocorreu o dia 25 de abril de 1974.
        System.out.printf("Dia da semana em que ocorreu o 25 abril 74: %s%n", data2.determinarDiaDaSemana());

        // i) Verifique se o ano 1974 foi bissexto, invocando o método de classe isAnoBissexto:
        //▪ Através do objeto data2;
        if (data2.isAnoBissexto(1974)) {
            System.out.println("É ano bissexto");
        }
        else {
            System.out.println("Não é ano bissexto");
        }
        //▪ Através da classe Data
        if (Data.isAnoBissexto(1974)) {
            System.out.println("É ano bissexto");
        }
        else {
            System.out.println("Não é ano bissexto");
        }
    }
}
