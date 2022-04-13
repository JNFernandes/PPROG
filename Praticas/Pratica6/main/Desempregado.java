public class Desempregado extends Contribuinte {

    /**
     * atributos do Desempregado
     */
    private int mesesParagem;

    /**
     * atributos de classe por defeito para meses de paragem e taxa OR
     */
    private static final int MESES_PARAGEM_DEFEITO = 0;
    private static double taxaOR = 0.02;

    /**
     * construtor completo que herda os atributos do contribuinte
     * @param mesesParagem
     * @param nome
     * @param morada
     * @param rendimentoTrabalhoOR
     */
    public Desempregado(String nome, String morada, double rendimentoTrabalhoOR, int mesesParagem) {
        super(nome, morada, rendimentoTrabalhoOR);
        this.mesesParagem = mesesParagem;
    }

    /**
     * Construtor vazio por defeito
     */
    public Desempregado() {
        super();
        mesesParagem = MESES_PARAGEM_DEFEITO;
    }

    /**
     * getter para os meses de paragem
     * @return meses de paragem
     */
    public int getMesesParagem() {
        return mesesParagem;
    }

    /**
     * setter para os meses de paragem
     * @param mesesParagem
     */
    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
    }

    /**
     * setter de classe estático para a taxaOR
     * @param valorTaxaOR
     */
    public static void setTaxaOR(double valorTaxaOR) {
        taxaOR = valorTaxaOR;
    }

    /**
     * método toString para retornar informação acerca do desempregado em termos de mese de paragem
     * Obs: herda toString do Contribuinte
     * @return toString
     */
    @Override
    public String toString() {
        return String.format("%s. Desempregado com %d meses de paragem %n", super.toString(), mesesParagem);
    }

    /**
     * calcula impostoOR a pagar pelo desempregado
     * @return impostoOR
     */
    @Override
    public double impostoOR() {
        return super.getRendimentoTrabalhoOR() * taxaOR;
    }

    /**
     * calcula o impostoTotal que sobre escreve o método abstrato da classe Contribuinte (neste caso é coincidente
     * com o imposto OR)
     * @return imposto total
     */
    @Override
    public double impostoTotal() {
        return impostoOR();
    }
}
