public abstract class Eletricidade extends Contador{

    /**
     * atributo de classe para contar o numero de instanciações da Luz
     */
    private static int nIdentificadores = 0;
    private static final String PREFIX = "ELECT-";

    /**
     * construtor Eletricidade para consumo mensal, nome cliente, potencia
     * herda da Classe contador em que o terceiro parametro é um String format ja com o identificador devidamente
     * identificado
     * @param consumoMensal do contador
     * @param nomeCliente associado ao contador
     */
    public Eletricidade(int consumoMensal, String nomeCliente) {
        super(consumoMensal, nomeCliente, String.format("%s%d", PREFIX, nIdentificadores++));
    }

    /**
     * construtor que herda apenas a informação do identificador
     */
    public Eletricidade() {
        super(String.format("%s%d", PREFIX, nIdentificadores++));
        nIdentificadores++;
    }

    public static int getContadores() {
        return nIdentificadores;
    }
}
