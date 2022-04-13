public abstract class ContribuinteTributavel extends Contribuinte{

    /**
     * atributos do objeto Contribuinte tributavel
     */
    private double rendimentoTrabalhoRT;

    /**
     * atributos de classe, redimento RT por omissao
     */
    private static final double RENDIMENTO_RT_OMISSAO = 0;

    /**
     * Construtor completo que herda do contribuinte o nome, morada e rendimentosOR
     * @param nome
     * @param morada
     * @param rendimentoTrabalhoOR
     * @param rendimentoTrabalhoRT
     */
    public ContribuinteTributavel(String nome, String morada, double rendimentoTrabalhoOR, double rendimentoTrabalhoRT) {
        super(nome, morada, rendimentoTrabalhoOR);
        this.rendimentoTrabalhoRT = rendimentoTrabalhoRT;
    }

    /**
     * construtor vazio
     */
    public ContribuinteTributavel() {
        rendimentoTrabalhoRT = RENDIMENTO_RT_OMISSAO;
    }

    /**
     * getter do rendimentoTrabalho RT
     * @return rendimentoTrabalho RT
     */
    public double getRendimentoTrabalhoRT() {
        return rendimentoTrabalhoRT;
    }

    /**
     * setter do rendimento trabalho RT
     * @param rendimentoTrabalhoRT
     */
    public void setRendimentoTrabalhoRT(double rendimentoTrabalhoRT) {
        this.rendimentoTrabalhoRT = rendimentoTrabalhoRT;
    }

    /**
     * método toString que sobre-escreve da classe Object acerca do rendimento RT do Contribuinte Tributável
     * @return String
     */
    @Override
    public String toString() {
        return String.format("%s. O Contribuinte é tributável possui um rendimentoRT de %.1f Euros",
                super.toString(), rendimentoTrabalhoRT);
    }

    /**
     * método abstrato para calcular o imposto RT
     * @return sem assinatura
     */
    public abstract double impostoRT();
}
