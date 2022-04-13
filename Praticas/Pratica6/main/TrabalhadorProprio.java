public class TrabalhadorProprio extends ContribuinteTributavel{
    /**
     * atributos do objeto a instanciar
     */
    private String profissao;
    /**
     * atributos de classe , profissão por defeito, taxaRT, taxaOR inferior e superior respetivamente, valor OR limite
     * para o qual mudará a taxa
     */
    private static final String PROFISSAO_POR_DEFEITO = "profissão não definida";
    private static double taxaRT = 0.03;
    private static double taxaOR1 = 0.02;
    private static double taxaOR2 = 0.05;
    private static double valorORLimite = 50000;

    /**
     * Construtor que herda do contribuinte tributável com a associação da profissão
     * @param nome
     * @param morada
     * @param rendimentoTrabalhoOR
     * @param rendimentoTrabalhoRT
     * @param profissao
     */
    public TrabalhadorProprio(String nome,
                              String morada, double rendimentoTrabalhoOR, double rendimentoTrabalhoRT, String profissao) {
        super(nome, morada, rendimentoTrabalhoOR, rendimentoTrabalhoRT);
        this.profissao = profissao;
    }

    /**
     * construtor vazio
     */
    public TrabalhadorProprio() {
        super();
        profissao = PROFISSAO_POR_DEFEITO;
    }

    /**
     * getter da profissão
     * @return profissão
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * setter da profissão
     * @param profissao
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * setter de classe para a taxa OR inferior
     * @param taxaORmenor
     */
    public static void setTaxaOR1(double taxaORmenor) {
        taxaOR1 = taxaORmenor;
    }

    /**
     * setter de classe para a taxa OR superior
     * @param taxaORmaior
     */
    public static void setTaxaOR2(double taxaORmaior) {
        taxaOR2 = taxaORmaior;
    }

    /**
     * setter para a taxa RT
     * @param taxa
     */
    public static void setTaxaRT(double taxa) {
        taxaRT = taxa;
    }

    /**
     * setter para o valor limite sobre o qual a taxar a imputar mudará
     * @param valorLimite
     */

    public static void setValorRTLimite(double valorLimite) {
        valorORLimite = valorLimite;
    }

    /**
     * método para mostrar a informação acerca do trabalhador conta propria, profissão e imposto total
     * @return toString
     */
    @Override
    public String toString() {
        return String.format("%s. O trabalhador por conta própria tem a profissão %s%n", super.toString(),
                profissao);
    }

    /**
     * método que herda da classe abstrata para calcular o imposto RT
     * @return imposto RT
     */
    @Override
    public double impostoRT() {
        return getRendimentoTrabalhoRT() * taxaRT;
    }

    /**
     * método que herda da classe abstrata para calcular o imposto OR
     * @return imposto OR
     */
    @Override
    public double impostoOR() {
        double ImpostoRT;
        if (super.getRendimentoTrabalhoOR() > valorORLimite) {
            ImpostoRT = getRendimentoTrabalhoOR() * taxaOR2;
        }
        else {
            ImpostoRT = getRendimentoTrabalhoOR() * taxaOR1;
        }
        return ImpostoRT;
    }

    /**
     * método para calcular o imposto Total
     * @return soma dos impostos OR com RT
     */
    @Override
    public double impostoTotal() {
        return impostoOR() + impostoRT();
    }
}
