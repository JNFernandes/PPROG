public class Aluno extends Elemento implements CategoriaAluno, GastosEscola{

    private int numMecanografico;
    private String categoria;
    private double bolsa;

    public Aluno(int idCivilNumber, String nome, int numMecanografico, String categoria, double bolsa) {
        super(idCivilNumber, nome);
        this.numMecanografico = numMecanografico;
        this.categoria = categoria;
        this.bolsa = bolsa;
    }

    public Aluno() {
        super();
    }

    public int getNumMecanografico() {
        return numMecanografico;
    }

    public void setNumMecanografico(int numMecanografico) {
        this.numMecanografico = numMecanografico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public double auferirValores() {
        double valorBolsa = 0;
        if (categoria.equals(CategoriaAluno.BOLSEIRO)) {
            valorBolsa = this.bolsa;
        }
        return valorBolsa;
    }
}
