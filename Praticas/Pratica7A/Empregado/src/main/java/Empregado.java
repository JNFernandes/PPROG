public class Empregado {
    private String primeiroNome;
    private String ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    private final int NUM_DIAS_TRABALHO = 5;

    public Empregado(String primeiroNome, String ultimoNome,
                     Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(dataContrato);
        this.horaEntrada = new Tempo(horaEntrada);
        this.horaSaida = new Tempo(horaSaida);

    }

    @Override
    public String toString() {
        return String.format("Primeiro Nome: %s, Ultimo nome: %s, dataContrato: %s, horaEntrada: %s, horaSaida: %s",
                primeiroNome, ultimoNome, dataContrato, horaEntrada, horaSaida);
    }

    public int calcularNumeroHorasTrabalho() {
        Tempo diff = horaEntrada.diferencaEmTempo(horaSaida);
        return diff.getHoras() * NUM_DIAS_TRABALHO;
    }

    public int tempoQueFoiContrato() {
        Data dataAtual = Data.dataAtual();
        return dataAtual.diferenca(dataContrato);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Data getDataContrato() {
        return new Data(dataContrato);
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato = new Data(dataContrato);
    }

    public Tempo getHoraEntrada() {
        return new Tempo(horaEntrada);
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = new Tempo(horaEntrada);
    }

    public Tempo getHoraSaida() {
        return new Tempo(horaSaida);
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = new Tempo(horaSaida);
    }
}
