public class Elemento {
    private int idCivilNumber;
    private String nome;

    private static final int NUM_CIVIL_POR_DEFEITO = 0;
    private static final String NOME_POR_DEFEITO = "N/A";

    public Elemento(int idCivilNumber, String nome) {
        this.idCivilNumber = idCivilNumber;
        this.nome = nome;
    }

    public Elemento() {
        idCivilNumber = NUM_CIVIL_POR_DEFEITO;
        nome = NOME_POR_DEFEITO;
    }

    public int getIdCivilNumber() {
        return idCivilNumber;
    }

    public void setIdCivilNumber(int idCivilNumber) {
        this.idCivilNumber = idCivilNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Elemento com o numero identificação civil %d e o nome %s", idCivilNumber, nome);
    }

}
