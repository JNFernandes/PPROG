import java.util.ArrayList;
import java.util.List;

public class MainContadores {
    public static void main(String[] args) {
        // a) Construa objetos de cada uma das classes instanciáveis e guarde-os num contentor do tipo array;
        ContadorGas c1 = new ContadorGas(100,"António");
        Contador c2 = new ContadorGas(300,"José");
        TarifarioSimples t1 = new TarifarioSimples(100, "André",7);
        TarifarioSimples t2 = new TarifarioSimples(100, "Dinis",6);
        TarifarioBiHorario tb1 = new TarifarioBiHorario(100,"Diogo", 20);
        TarifarioBiHorario tb2 = new TarifarioBiHorario(100, "Joao", 10);

//        Contador [] contadores = new Contador[10];
//        contadores[0] = c1;
//        contadores[1] = t1;
//        contadores[2] = t2;
//        contadores[3] = tb1;
//        contadores[4] = tb2;

        List<Contador> contadores = new ArrayList<>();
        contadores.add(c1);
        contadores.add(c2);
        contadores.add(t1);
        contadores.add(t2);
        contadores.add(tb1);
        contadores.add(tb2);

        System.out.println("----------------------Alinea b)------------------------");
        // b) Liste os identificadores dos contadores, acompanhados dos respetivos nomes dos clientes,
        //armazenados no contentor;
        System.out.println("Lista dos identificadores dos contadores e Nomes dos clientes: ");
        listarForEachContador(contadores);

        System.out.println("----------------------Alinea c)------------------------");
        // c) Mostre a quantidade de contadores de eletricidade criados;
        System.out.printf("Numero de contadores criados: %d%n", Eletricidade.getContadores());

        System.out.println("----------------------Alinea d)------------------------");
        // d) Liste os identificadores dos contadores de eletricidade com tarifário bi-horário, armazenados no
        //contentor;
        System.out.println("Lista dos identificadores com tarifário bi-horário: ");
        listarTarifarioBiHorario(contadores);

        // e) Liste os identificadores dos contadores, acompanhados do respetivo custo do consumo. Para o efeito
        //deve usar o mecanismo do polimorfismo, sem recorrer ao método reescrito toString;
        System.out.println("----------------------Alinea e)------------------------");
        System.out.println("Lista dos identificadores com o respetivo custo de consumo: ");
        listarContadoresConsumo(contadores);

        // f) Mostre o maior valor consumido de gás;
        System.out.println("----------------------Alinea f)------------------------");
        int maiorConsumoGas = calcularMaiorConsumoGas(contadores);
        System.out.printf("O maior consumo de Gas é: %d m3%n", maiorConsumoGas);

        // g) Liste os nomes dos clientes, sem repetições, que possuem contadores.
        System.out.println("----------------------Alinea g)------------------------");
        System.out.println("Lista dos Nomes dos Clientes com contador: ");
        listarClientes(contadores);
    }

    /**
     * meteodo usado que recebe uma lista por parametro e retorna a informação do contador a nivel de identificador e
     * nome do cliente
     * @param lista
     */
    private static void listarForEachContador(List<Contador> lista) {
        for (Contador contador : lista) {
                System.out.printf("ID: %s, Nome do cliente: %s%n", contador.getIdentificador(), contador.getNomeCliente());
        }
    }

    /**
     * metodo usado que recebe uma lista por parametro e retorna apenas a informação dos identificadores dos contadores
     * que sejam do tipo biHorario
     * @param lista
     */
    private static void listarTarifarioBiHorario(List<Contador> lista) {
        for (Contador contador : lista) {
            System.out.printf("ID: %s%n", contador.getIdentificador());
        }
    }

    /**
     * método usado para listar os identificadores dos contadores e o custo do consumo associado a cada contador
     * @param lista
     */

    private static void listarContadoresConsumo(List<Contador> lista) {
        for (Contador contador : lista) {
            System.out.printf("ID: %s, Custo do cosumo: %.1f EUR%n",
                        contador.getIdentificador(), contador.calcularConsumo());
        }
    }

    /**
     * método que recebe uma lista por parametro para obter o maior consumo de Gas nos contadores
     * @param lista
     * @return inteiro com o maior consumo
     */

    private static int calcularMaiorConsumoGas(List<Contador> lista) {
        Contador contadorPrimeiro = lista.get(0);
        int maiorValor = contadorPrimeiro.getConsumoMes();
        for (int i = 1; i < lista.size(); i++) {
            Contador contador = lista.get(i);
            int consumo = contador.getConsumoMes();
            if (consumo > maiorValor){
                maiorValor = consumo;
            }
        }
        return maiorValor;
    }

    /**
     * método para listar os nomes dos clientes que possuem contador
     * @param lista
     */
    private static void listarClientes(List<Contador> lista) {
        for (Contador contador : lista) {
            System.out.printf("Nome do cliente: %s%n", contador.getNomeCliente());
        }
    }




}
