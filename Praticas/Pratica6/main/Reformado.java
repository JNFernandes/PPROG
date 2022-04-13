import java.awt.peer.PanelPeer;

public class Reformado extends ContribuinteTributavel{

    /**
     * atributos de classe, taxa RT e taxa OR
     */
    public static double taxaRT = 0.01;
    public static double taxaOR = 0.03;

    /**
     * construtor do reformado que herda do contribuinte tributavel e contribuinte indiretamente
     * @param nome
     * @param morada
     * @param rendimentoTrabalhoOR
     * @param rendimentoTrabalhoRT
     */
    public Reformado(String nome, String morada, double rendimentoTrabalhoOR, double rendimentoTrabalhoRT) {
        super(nome, morada, rendimentoTrabalhoOR, rendimentoTrabalhoRT);
    }

    /**
     * construtor vazio
     */
    public Reformado() {
        super();
    }

    public static void  setTaxaOR(double taxaORval) {
        taxaOR = taxaORval;
    }

    public static void  setTaxaRT(double taxaRTval) {
        taxaRT = taxaRTval;
    }

    @Override
    public String toString() {
        return String.format("%s%n", super.toString());
    }

    @Override
    public double impostoOR() {
        return getRendimentoTrabalhoOR() * taxaOR;
    }

    @Override
    public double impostoRT() {
        return getRendimentoTrabalhoRT() * taxaRT;
    }

    @Override
    public double impostoTotal() {
        return impostoOR() + impostoRT();
    }

}
