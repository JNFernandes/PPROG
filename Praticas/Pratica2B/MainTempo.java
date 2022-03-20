public class MainTempo {
    public static void main(String[] args) {

        // a) Crie uma instância da classe Tempo com o nome t1 e que represente o tempo:
        // 5 horas, 30 minutos e 12 segundos.
        Tempo t1 = new Tempo(15,58,59);

        // b) Mostre o tempo t1 usando o formato "hh:mm:ss AM (ou PM)".
        String mostarTempo = t1.getTempoNormal();
        System.out.printf("Tempo t1: %s%n", mostarTempo);

        // c) Acrescente 1 segundo ao tempo t1.
        t1.adicionarSegundo();

        // d) Mostre novamente t1 usando o formato "hh:mm:ss AM (ou PM)".
        String mostrarNovoTempo = t1.getTempoNormal();
        System.out.printf("Novo tempo t1: %s%n", mostrarNovoTempo);

        // e) Crie uma outra instância da classe Tempo chamada t2 que guarde o tempo: 18 horas, 5 minutos e
        // 20 segundos.
        Tempo t2 = new Tempo(4,58,59);

        // f) Mostre o tempo t2 usando o formato "hh:mm:ss AM (ou PM)".
        String mostrarTempo2 = t2.getTempoNormal();
        System.out.printf("Tempo t2: %s%n", mostrarTempo2);

        // g) Verifique se o tempo t1 é maior do que o tempo t2.
        boolean verificacao = t1.verificarSeTempoMaiorQueOutro(t2);
        if (verificacao) {
            System.out.println("O tempo t1 é maior que o tempo t2");
        }
        else {
            System.out.println("O Tempo t1 não é maior que o tempo t2");
        }

        // h) Verifique se o tempo t1 é maior do que o tempo 23 horas, 7 minutos e 4 segundos usando o
        //método que recebe por parâmetro as horas, os minutos e os segundos de um tempo.
        boolean segundaVerificacao = t1.verificarSeTempoMaiorQueOutro(12,7,5);
        if (segundaVerificacao) {
            System.out.println("O tempo t1 é maior que o tempo dado");
        }
        else {
            System.out.println("O Tempo t1 não é maior que o tempo dado");
        }

        // i) Determinar a diferença entre o tempo t1 e o tempo t2:
        //em segundos;
        int diferencaSegundos = Tempo.diferencaTempoSegundos(t1, t2);
        System.out.printf("A diferença de tempo em segundos é: %d segundos %n", diferencaSegundos);

        //em Tempo.
        String diferencaTempo = Tempo.diferencaEntreTempos(t1, t2);
        System.out.printf("A diferença de tempo é: %s%n", diferencaTempo);
    }
}
