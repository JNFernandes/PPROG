package org.dei.tributaveis;

public class Veiculo implements Cores, Imposto{

    private String matricula;
    private int cilindrada;
    private String cor;

//    Variáveis para a alínea 13
    private static int limiteEscalao1 = 1500;
    private static float impostoEscalao1 = 15;
    private static float impostoEscalao2 = 40;

    public Veiculo(String matricula, int cilindrada, String cor) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getCor() {
        return cor;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void setLimiteEscalao1(int novoLimiteEscalao1) {
        limiteEscalao1 = novoLimiteEscalao1;
    }

    public static void setImpostoEscalao1(int novoImpostoEscalao1) {
        impostoEscalao1 = novoImpostoEscalao1;
    }

    public static void setImpostoEscalao2 (int novoImpostoEscalao2) {
        impostoEscalao2 = novoImpostoEscalao2;
    }

    @Override
    public String toString() {
        return String.format("Veículo com matrícula %s e cilindrada %d tem cor %s",
                matricula, cilindrada, cor);
    }

    @Override
    public double calcularImposto() {
        double impostoPagar;
        // return (cilindrada <limiteEscalao1) ? impostoEscalao1: impostoEscalao2;
        if (cilindrada < limiteEscalao1) {
            impostoPagar = impostoEscalao1;
        }
        else {
            impostoPagar = impostoEscalao2;
        }
        return impostoPagar;
    }

    @Override
    public String mostrarImposto() {
        return String.format("O valor do imposto a calcular é %.1f", calcularImposto());
    }
}

