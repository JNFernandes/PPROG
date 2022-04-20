import java.util.ArrayList;
import java.util.List;

public class MainEmpregado {
    public static void main(String[] args) {
        // a) Crie e visualize uma instância de Data para representar a data atual;
        System.out.println("alinea a):");
        Data data = new Data(2001,12,2);
        System.out.println(data);

        // b) Crie e visualize duas instâncias de Tempo;
        System.out.println("alinea b):");
        Tempo t1 = new Tempo(15, 10, 30);
        Tempo t2 = new Tempo();
        System.out.println(t1);
        System.out.println(t2);

        // c) Crie duas instâncias de Empregado usando para o efeito as instâncias de Data e de Tempo
        //criadas anteriormente;
        System.out.println("alinea c):");
        Empregado e1 = new Empregado("Ze","Castelo Branco",data, t1, t2);
        Empregado e2 = new Empregado("ZeZe", "Camarinha", data, t1, t2);

        // d) Verifique se os atributos do tipo Data dos empregados criados possuem referências partilhadas;
        System.out.println("alinea d):");
        System.out.println(e1.getDataContrato());
        data.setData(2010, 12, 2);
        System.out.println(e1.getDataContrato());

        // e) Verifique se os atributos do tipo Tempo dos empregados criados possuem referências partilhadas;
        System.out.println("alinea e):");
        System.out.println(e1.getHoraEntrada());
        t1.setHoras(12);
        System.out.println(e1.getHoraEntrada());

        // f) Altere o conteúdo do objeto Data e o conteúdo dos objetos Tempo inicialmente criados;
        System.out.println("alinea f):");
        data.setData(2022, 11, 3);
        t1.setHoras(2);
        t2.setHoras(3);

        // g) Visualize as instâncias de Data e de Tempo, bem como as instâncias de Empregado criadas;
        System.out.println("alinea g):");
        System.out.println(data);
        System.out.println(t1);
        System.out.println(t2);

        // h) Altere a data de contrato e as horas de entrada e de saída do segundo empregado;
        System.out.println("alinea h):");
        Data data1 = new Data(2011, 2, 15);
        e2.setDataContrato(data1);
        Tempo horaEntrada1 = new Tempo(2, 1, 3);
        Tempo horaSaida1 = new Tempo(10, 13, 20);
        e2.setHoraEntrada(horaEntrada1);
        e2.setHoraSaida(horaSaida1);

        // i) Armazene as instâncias de Empregado criadas num contentor de objetos do tipo ArrayList;
        System.out.println("alinea i):");
        List<Empregado> arrEmp = new ArrayList<>();
        arrEmp.add(e1);
        arrEmp.add(e2);

        // j) Liste todos os empregados;
        System.out.println("alinea j):");
        for (Empregado empregado : arrEmp) {
            System.out.println(empregado);
        }

        // k) Liste o nome, o número de horas de trabalho por semana e a antiguidade de cada um dos
        //empregados
        System.out.println("alinea k):");
        for (Empregado empregado : arrEmp) {
            System.out.printf("Primeiro nome: %s, Num. horas trabalho por semana: %d, Ha quanto tempo foi contratado " +
                            "(dias): %d%n",
                    empregado.getPrimeiroNome(), empregado.calcularNumeroHorasTrabalho(),
                    empregado.tempoQueFoiContrato());
        }

    }


}
