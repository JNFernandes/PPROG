public class TarifarioBiHorario extends Eletricidade{
    /**
     * atributo associado a instanciação do objeto - horas
     */
    public int consumoVazio;
    /**
     * atributos estaticos de classe tabelados que podem ser alterados no futuro, valorHorasVazio, foraVazio
     * valor da hora limite na qual muda a taxa, horas por defeito instanciadas
     */
    private static double valorHorasVazio = 0.066;
    private static double valorHorasForaVazio = 0.14;
    private static int CONSUMO_VAZIO_DEFEITO = 0;

    /**
     * construtor com parametros
     * @param consumoMensal do contador
     * @param nomeCliente associado ao contador
     * @param consumoVazio do contador
     */
    public TarifarioBiHorario(int consumoMensal, String nomeCliente, int consumoVazio) {
        super(consumoMensal, nomeCliente);
        this.consumoVazio = consumoVazio;
    }

    /**
     * construtor vazio com valores por defeito
     */

    public TarifarioBiHorario() {
        super();
        consumoVazio = CONSUMO_VAZIO_DEFEITO;
    }

    /**
     * getter para as horas
     * @return horas
     */
    public int consumoVazio() {
        return consumoVazio;
    }

    /**
     * setter para as horas
     * @param consumoVazio
     */
    public void consumoVazio(int consumoVazio) {
        this.consumoVazio = consumoVazio;
    }

    /**
     * setter estatico para valorHorasVazio
     * @param valorHorasVazio
     */
    public static void setValorHorasVazio(double valorHorasVazio) {
        TarifarioBiHorario.valorHorasVazio = valorHorasVazio;
    }

    /**
     * setter estatico para setValorHorasForaVazio
     * @param valorHorasForaVazio
     */
    public static void setValorHorasForaVazio(double valorHorasForaVazio) {
        TarifarioBiHorario.valorHorasForaVazio = valorHorasForaVazio;
    }


    /**
     * toString para disponibilizar infos gerais do contador
     * @return string formatada
     */
    @Override
    public String toString() {
        return String.format("%s%n", super.toString());
    }

    /**
     * metodo para calcular o consumo de luz na situação bihorario que re-escreve o metodo abstrato
     * @return consumoLuzBiHorario
     */
    @Override
    public double calcularConsumo() {
        return getConsumoMes() * valorHorasForaVazio + consumoVazio() * valorHorasVazio;
    }
}
