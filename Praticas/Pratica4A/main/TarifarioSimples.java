public class TarifarioSimples extends Eletricidade {

    private double potencia;

    /**
     * variaveis estaticas de classes para valores tabelados para calculo do terifario simples
     * valor referencia da potencia
     * valor inferior unitario caso inferior ao valor de referencia
     * valor superior unitario caso superior ao valor de referencia
     */

    private static double valorPotTabelado = 6.9;
    private static double valorInferiorUnitario = 0.13;
    private static double valorSuperiorUnitario = 0.16;

    /**
     * construtor inicializado para consumo do mes, nome do cliente , potencia
     * @param consumoMes do contador
     * @param nomeCliente associado ao contador
     * @param potencia em kwatts
     */
    public TarifarioSimples(int consumoMes, String nomeCliente, double potencia) {
        super(consumoMes, nomeCliente);
        this.potencia = potencia;
    }

    /**
     * construtor vazio com valores por defeito
     */
    public TarifarioSimples() {
        super();
    }

    /**
     * getter para a potencia
     * @return potencia
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * setter para a potencia
     * @param potencia em kwatts
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


    /**
     * setter para a potencia caso queira alterar no futuro
     * @param novoValor
     */
    public static void setValorPotTabelado(double novoValor) {
        valorPotTabelado = novoValor;
    }

    /**
     * setter para o valor unitario inferior caso queira alterar no futuro
     * @param novoValor
     */
    public static void valorInferiorUnitario(double novoValor) {
        valorInferiorUnitario = novoValor;
    }

    /**
     * setter para o valor unitario superior caso queira alterar no futuro
     * @param novoValor
     */
    public static void valorSuperiorUnitario(double novoValor) {
        valorSuperiorUnitario = novoValor;
    }

    /**
     * metodo toString para disponibilizar infos gerais do contador
     * @return string formatada
     */
    @Override
    public String toString() {
        return String.format("%s%n", super.toString());
    }

    /**
     * metodo para calcular o consumo re-escrito da classe abstrata
     * @return consumo luz para tarifario simples
     */
    @Override
    public double calcularConsumo() {
        double consumoLuz;
        if (getPotencia() < valorPotTabelado) {
            consumoLuz = getConsumoMes() * valorInferiorUnitario;
        }
        else {
            consumoLuz = getConsumoMes() * valorSuperiorUnitario;
        }
        return consumoLuz;
    }

}
