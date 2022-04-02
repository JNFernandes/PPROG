public class ContadorGas extends Contador{

    /**
     * variavel estatica para consumo unitário, numero de identificadores e uma string final PREFIX para o identificador
     */
    private static double consumoUnitario = 0.8;
    private static int nIdentificadores = 0;
    private static final String PREFIX = "GAS-";

    /**
     * construtor para o contador gas com consumo mes e nome cliente
     * herda da Classe contador em que o terceiro parametro é um String format ja com o identificador devidamente
     * identificado
     * @param consumoMes do contador
     * @param nomeCliente associado ao contador
     */
    public ContadorGas(int consumoMes, String nomeCliente) {
        super(consumoMes, nomeCliente, String.format("%s%d", PREFIX, nIdentificadores++));
    }

    /**
     * construtor que herda da classe Contador apenas informação do identificador
     */
    public ContadorGas() {
        super(String.format("%s%d", PREFIX, nIdentificadores++));
    }


    /**
     * variavel a alterar no futuro caso necessario
     * @param consumoAlterar em euros/m3
     */
    public static void setConsumoUnitario(double consumoAlterar) {
        consumoUnitario = consumoAlterar;
    }

    /**
     * metodo to string para retornar o contador criado mais info cliente e consumo
     * @return string formatada
     */
    @Override
    public String toString() {
        return String.format("%s%n", super.toString());
    }

    public static int getIdentificator() {
        return nIdentificadores;
    }

    /**
     * metodo para calcular o Consumo re-escrito da classe abstrata
     * @return consumo
     */
    @Override
    public double calcularConsumo() {
        return consumoUnitario * getConsumoMes();
    }

    /**
     * metodo de classe para obeter o numero de contadores criados ate ao momento
     * @return nIdentificadores
     */
    public static int getContadores() {
        return nIdentificadores;
    }
}
