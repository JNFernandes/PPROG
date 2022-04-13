public abstract class Contribuinte {

    /**
     * Atributos afetos ao contribuinte
     */
    private String nome;
    private String morada;
    private double rendimentoTrabalhoOR;

    /**
     * Constantes por defeito
     */
    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String MORADA_POR_OMISSAO = "sem morada";
    private static final double RENDIMENTO_OR_OMISSAO = 0;

    /**
     * Construtor completo
     * @param nome
     * @param morada
     * @param rendimentoTrabalhoOR
     */
    public Contribuinte(String nome, String morada, double rendimentoTrabalhoOR) {
        this.nome = nome;
        this.morada = morada;
        this.rendimentoTrabalhoOR = rendimentoTrabalhoOR;
    }


    /**
     * Construtor vazio
     */
    public Contribuinte() {
        nome = NOME_POR_OMISSAO;
        morada = MORADA_POR_OMISSAO;
        rendimentoTrabalhoOR = RENDIMENTO_OR_OMISSAO;
    }

    /**
     * Getter do Nome
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter do nome
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Getter da Morada
     *
     * @return morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Setter da Morada
     *
     * @param morada
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }


    /**
     * getter do rendimento trabalho OR
     * @return rendimento trabalho OR
     */
    public double getRendimentoTrabalhoOR() {
        return rendimentoTrabalhoOR;
    }

    /**
     * setter rendimento trabalho OR
     * @param rendimentoTrabalhoOR
     */
    public void setRendimentoTrabalhoOR(double rendimentoTrabalhoOR) {
        this.rendimentoTrabalhoOR = rendimentoTrabalhoOR;
    }

    /**
     * método toString que faz override do metodo toString Object
     * @return string com o nome e morada e rendimento OR
     */
    @Override
    public String toString() {
        return String.format("Contribuinte com o nome %s, morada %s e rendimento OR de %.1f Euros%n",
                nome, morada,rendimentoTrabalhoOR);
    }

    /**
     * método abstrato sem assinatura para calcular o imposto OR
     * @return nada
     */
    public abstract double impostoOR();

    /**
     * método sem assinatura para calcular o imposto total
     * @return nada
     */
    public abstract double impostoTotal();


    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        Contribuinte outroContribuinte = (Contribuinte) outroObjeto;
        return this.nome.equalsIgnoreCase(outroContribuinte.nome);
    }


}
