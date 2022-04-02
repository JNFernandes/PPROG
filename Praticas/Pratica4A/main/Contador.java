public abstract class Contador {

    /**
     * atributos associados ao objeto abstrato de contador: consumo mes e nome do Cliente
     */
    private int consumoMes;
    private String nomeCliente;
    private String identificador;


    /**
     * variavel estatica ao consumo por defeito e ao nome do cliente por defeito para instanciar o construtor vazio
     */
    private static final int CONSUMO_POR_DEFEITO = 0;
    private static final String NOME_CLINTE_POR_DEFEITO = "sem nome";
    private static String IDENTIFICADOR_POR_DEFEITO = "sem identificador";

    /**
     * construtor com tres parametros: consumo mes e nome do cliente
     * @param consumoMes do contador
     * @param nomeCliente associado ao contador
     * @param identificador associado ao identificador
     */
    public Contador(int consumoMes, String nomeCliente, String identificador) {
        this.consumoMes = consumoMes;
        this.nomeCliente = nomeCliente;
        this.identificador = identificador;
    }

    /**
     * construtor com apenas um parametro, o identificador
     * @param identificador
     */

    public Contador(String identificador) {
        consumoMes = CONSUMO_POR_DEFEITO;
        nomeCliente = NOME_CLINTE_POR_DEFEITO;
        this.identificador = identificador;
    }


    /**
     * getter para o consumo do mes
     * @return consumo do mes
     */
    public int getConsumoMes() {
        return consumoMes;
    }

    /**
     * setter consumoMes
     * @param consumoMes do contador
     */
    public void setConsumoMes(int consumoMes) {
        this.consumoMes = consumoMes;
    }

    /**
     * getter para o nome do cliente
     * @return nome do cliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * setter para o nome do cliente
     * @param nomeCliente do cliente
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * getter para o identificador
     * @return identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * setter para o identificador
     * @param identificador
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * metodo toString para retornar informação acerca do cliente e consumo mensal
     * @return consumo mensal
     */
    @Override
    public String toString() {
        return String.format("O cliente %s apresenta um consumo mensal de %d, " +
                "no identificador %s%n", nomeCliente, consumoMes, identificador);
    }

    /**
     * metodo abstrato para calcular o consumo
     * @return metodo sem assinatura abstrato
     */
    public abstract double calcularConsumo();
}
