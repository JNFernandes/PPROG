public class Professor extends Elemento implements CategoriaProfessor, GastosEscola{

    private String categoria;

    private static double salarioBase = 1500;
    private static double majoracaoCoordenador = 0.5;
    private static double majoracaoAdjunto = 0.2;
    private static double majoracaoAssistente = 0;

    public Professor(int id, String nome, String categoria) {
        super(id, nome);
        this.categoria = categoria;
    }

    public Professor() {
        super();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static void setSalarioBase(double salarioBase) {
        Professor.salarioBase = salarioBase;
    }

    public static void setMajoracaoCoordenador(double majoracaoCoordenador) {
        Professor.majoracaoCoordenador = majoracaoCoordenador;
    }

    public static void setMajoracaoAdjunto(double majoracaoAdjunto) {
        Professor.majoracaoAdjunto = majoracaoAdjunto;
    }

    public static void setMajoracaoAssistente(double majoracaoAssistente) {
        Professor.majoracaoAssistente = majoracaoAssistente;
    }


    @Override
    public double auferirValores() {
        double salarioFinal = salarioBase;
        if (categoria.equals(CategoriaProfessor.COORDENADOR)) {
            salarioFinal += salarioFinal * majoracaoCoordenador;
        }
        else if (categoria.equals(CategoriaProfessor.ASSISTENTE)) {
            salarioFinal += salarioFinal * majoracaoAdjunto;
        }
        else {
            salarioFinal += salarioFinal * majoracaoAssistente;
        }
        return salarioFinal;
    }
}
