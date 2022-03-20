public class Utente {
    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;

    // variável de classe
    private static int totalUtentes = 0;

    //constantes
    private static final String NOME_POR_DEFEITO = "sem nome";
    private static final String GENERO_POR_DEFEITO = "sem genero";
    private static final int IDADE_POR_DEFEITO = 10;
    private static final double ALTURA_POR_DEFEITO = 1.50;
    private static final double PESO_POR_DEFEITO = 50;

    //valores de referencia
    private static double indiceValorReferenciaInferior = 18;
    private static double indiceValorReferenciaSuperior = 25;

    // Construtores
    /**
     * construtor vazio - todos os valores sao definidos por defeito
     */
    public Utente() {
        nome = NOME_POR_DEFEITO;
        genero = GENERO_POR_DEFEITO;
        idade = IDADE_POR_DEFEITO;
        altura = ALTURA_POR_DEFEITO;
        peso = PESO_POR_DEFEITO;
        totalUtentes++;
    }

    /**
     * contrutor so com nome e idade, genero, altura e peso definidos por defeito
     * @param nome
     * @param idade
     */
    public Utente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        genero = GENERO_POR_DEFEITO;
        altura = ALTURA_POR_DEFEITO;
        peso = PESO_POR_DEFEITO;
        totalUtentes++;
    }

    /**
     * construtor completo
     * @param nome
     * @param genero
     * @param idade
     * @param altura
     * @param peso
     */
    public Utente(String nome, String genero, int idade, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        totalUtentes++;
    }

    // Getters and Setters

    /**
     * get para o nome
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * set para o nome
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * get para o genero
     * @return genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * set para o genero
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * get para a idade
     * @return idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * set para idade
     * @param idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * get para altura
     * @return altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * set para altura
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * get para peso
     * @return peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * set para peso
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * metodo toString para retornar a informação do utente
     * @return frase com info do clinte em termos de nome, genero, idade, altura e peso
     */
    @Override
    public String toString() {
        return String.format("O utente com o nome %s, género %s, com a idade %d, " +
                "altura %.1f m e peso %.1f Kg", nome, genero, idade, altura, peso);
    }

    /**
     * calcula a diferença de idades entre dois utentes
     * @param outro - segundo objeto criado do utente
     * @return diferença de idades em valor absoluto
     */
    public int diferencaIdadesEntreUtentes(Utente outro) {
        return Math.abs(this.idade - outro.idade);
    }

    /**
     * calculdo do IMC - Indice de Massa Corporal
     * @param peso
     * @param altura
     * @return formula de calculo do IMC = peso / altura^2, com altura em metros
     */
    public double indiceMassaCorporal(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }


    /**
     * obter o grau de obesidade, este metodo recebe como parametros o peso a e altura da pessoa, calcula o IMC
     * e com base nos valores obtidos irá fazer a classificação de "Magro", "Saudável" ou "Obeso"
     * @param utente objeto criado de utente para fazer as verificações necessárias quanto ao seu IMC
     * @return uma String com a classificação do grau de Obesidade
     */
    public String grauObesidade(Utente utente) {
        double indice = utente.indiceMassaCorporal(peso, altura);
        String classificacao;
        if (indice < indiceValorReferenciaInferior) {
            classificacao = "Magro";
        }
        else if (indice >= indiceValorReferenciaInferior && indice <= indiceValorReferenciaSuperior) {
            classificacao = "Saudável";
        }
        else {
            classificacao = "Obeso";
        }
        return  classificacao;
    }

    /**
     * metodo para verificar se o utente é ou não saudável como classificação
     * @param utente — objeto utente criado para verificar posteriormente o seu grau de obesidade e fazer a comparação
     * @return um booleano que retorna verdadeiro se a classificação for saudável e falso para os restantes
     */
    public boolean verificarSeUtenteSaudavel(Utente utente) {
        return grauObesidade(utente).equals("Saudável");
    }

    /**
     * verificar a idade entre dois utentes
     * @param outroUtente — objeto criado de outro utente para comparação
     * @return um booleano
     */
    public int verificarIdadeEntreDoisUtentes(Utente outroUtente) {
        int valorControlo = 0; // valor por defeito se as idades forem iguais
        if (this.idade > outroUtente.idade) {
            valorControlo = 1;
        }
        else if (this.idade < outroUtente.idade) {
            valorControlo = -1;
        }
        return valorControlo;
    }


    // MÉTODOS DE CLASSE (comuns a todos os utentes)
    // definição dos valores alvo que posteriormente podem ser alterados

    /**
     * set para o valor indice de referencia inferior caso queira ser alterado posteriormente
     * @param valorAlvo - valor para o que queremos alterar
     */
    public static void setIndiceValorReferenciaInferior(int valorAlvo) {
        indiceValorReferenciaInferior = valorAlvo;
    }
    /**
     * set para o valor indice de referencia superior caso queira ser alterado posteriormente
     * @param valorAlvo - valor para o que queremos alterar
     */
    public static void setIndiceValorReferenciaSuperior(int valorAlvo) {
        indiceValorReferenciaSuperior = valorAlvo;
    }

    /**
     * obter o número de instâncias de utentes criadas
     * @return um inteiro que aponta para o número total de utentes
     */
    public static int getTotalUtentes() {
        return totalUtentes;
    }


}
