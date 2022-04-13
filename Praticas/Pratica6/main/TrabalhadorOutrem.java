public class TrabalhadorOutrem extends ContribuinteTributavel{

    /**
     * Atributos associados ao Trabalhador Outrem
     */
    private String nomeEmpresa;

    /**
     * atributos de classe associados ao Trabalhador Outrem, constante por defeito da empresa; taxaRT1 e RT2 que são o
     * valor de imposto minimo e maximo respetivamente de acordo com um dado rendimento RT; taxaOR
     */
    private static final String NOME_EMPRESA_POR_DEFEITO = "sem nome";
    private static double taxaRT1 = 0.01;
    private static double taxaRT2 = 0.02;
    private static double valorRTLimite = 30000;
    private static double taxaOR = 0.02;

    /**
     * construtor que herda do contribuinte tributavel com a adição do nome da empresa
     * @param nomeEmpresa
     * @param nome
     * @param morada
     * @param rendimentoTrabalhoOR
     * @param rendimentoTrabalhoRT
     */
    public TrabalhadorOutrem(String nome,
                             String morada, double rendimentoTrabalhoOR, double rendimentoTrabalhoRT, String nomeEmpresa) {
        super(nome, morada, rendimentoTrabalhoOR, rendimentoTrabalhoRT);
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * construtor vazio
     */
    public TrabalhadorOutrem() {
        super();
        nomeEmpresa = NOME_EMPRESA_POR_DEFEITO;
    }

    /**
     * getter do nome da empresa
     * @return nome da empresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * setter do nome da empresa
     * @param nomeEmpresa
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * setter de classe para a Taxa RT inferior
     * @param taxaRTmenor
     */
    public static void setTaxaRT1(double taxaRTmenor) {
        taxaRT1 = taxaRTmenor;
    }

    /**
     * setter de classe para a Taxa RT superior
     * @param taxaRTmaior
     */
    public static void setTaxaRT2(double taxaRTmaior) {
        taxaRT2 = taxaRTmaior;
    }

    /**
     * setter de classe para a taxa OR
     * @param taxa
     */
    public static void setTaxaOR(double taxa) {
        taxaOR = taxa;
    }

    /**
     * setter para o valor limite sobre o qual a taxa a imputar muda
     * @param valorLimite
     */
    public static void setValorRTLimite(double valorLimite) {
        valorRTLimite = valorLimite;
    }

    /**
     * método toString que retorna a informaçao do trabalhador Outrem que trabalha na empresa e o imposto total
     * que paga
     * @return toString
     */
    @Override
    public String toString() {
        return String.format("%s. Trabalhador por Outrém trabalha na empresa %s %n",
                super.toString(), nomeEmpresa);
    }

    /**
     * calculo do imposto OR
     * @return imposto OR
     */
    @Override
    public double impostoOR() {
        return getRendimentoTrabalhoOR() * taxaOR;
    }

    /**
     * calculo do imposto RT com duas taxas para o caso do valor limite ser atingido
     * @return imposto RT
     */
    @Override
    public double impostoRT() {
        double ImpostoRT;
        if (super.getRendimentoTrabalhoRT() > valorRTLimite) {
            ImpostoRT = getRendimentoTrabalhoRT() * taxaRT2;
        }
        else {
            ImpostoRT = getRendimentoTrabalhoRT() * taxaRT1;
        }
        return ImpostoRT;
    }

    /**
     * calculo do imposto Total dado pela soma dos dois impostos
     * @return soma impostos
     */
    @Override
    public double impostoTotal() {
        return impostoOR() + impostoRT();
    }
}
