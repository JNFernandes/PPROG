
public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    // constantes
    private static final int HORA_POR_OMISSAO = 0;
    private static final int MINUTO_POR_OMISSAO = 0;
    private static final int SEGUNDO_POR_OMISSAO = 0;
    private static final int SEGUNDOS_NUMA_HORA = 3600;
    private static final int SEGUNDOS_NUM_MINUTO = 60;
    private static final int HORA_MILITAR = 24;
    private static final int HORA_NORMAL = 12;

    // construtores

    /**
     * Implementação do construtor com todos os parametros por omissão
     */
    public Tempo() {
        hora = HORA_POR_OMISSAO;
        minuto = MINUTO_POR_OMISSAO;
        segundo = SEGUNDO_POR_OMISSAO;
    }

    /**
     * Implementação do construtor com todos os parametros
     * @param hora
     * @param minuto
     * @param segundo
     */
    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     * getter para a hora
     * @return hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * setter para a hora
     * @param hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * getter para o minuto
     * @return minutos
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * setter para o minuto
     * @param minuto
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    /**
     * getter para o segundo
     * @return segundos
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * setter para o segundo
     * @param segundo
     */
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    /**
     * metodo para obter a hora em tempo militar que vai de 0 a 24
     * @return formato da hora em estilo militar
     */
    public String getTempoHoraMilitar() {
        acertarHora();
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    /**
     * metodo para obter a hora em formato AM ou PM
     * @return formato da hora em estilo AM ou PM
     */
    public String getTempoNormal() {
        String tempo = null;
        if (hora == 0) {
            tempo = String.format("%02d:%02d:%02d AM", hora + HORA_NORMAL, minuto, segundo);
        }
        else if (hora >=1 && hora < HORA_NORMAL) {
            tempo = String.format("%02d:%02d:%02d AM", hora, minuto, segundo);
        }
        else if (hora > 12) {
            tempo = String.format("%02d:%02d:%02d PM", hora - HORA_NORMAL, minuto, segundo);
        }
        else if (hora == 12) {
            tempo = String.format("%02d:%02d:%02d PM", hora, minuto, segundo);
        }
        return tempo;
    }

    /**
     * metodo de acertar a hora para o caso de ser inserido uma hora superior a 24
     */
    public void acertarHora(){
        if (segundo >= SEGUNDOS_NUM_MINUTO) {
            segundo = 0;
            minuto++;
        }
        if (minuto >=SEGUNDOS_NUM_MINUTO) {
            minuto = 0;
            hora ++;
        }
        if (hora >=HORA_MILITAR) {
            hora = 0;
            segundo++;
        }
    }

    /**
     * metodo para adicionar um segundo, este metodo implementa tambem o acerto de hora
     */

    public void adicionarSegundo(){
        segundo++;
        acertarHora();
    }

    /**
     * meteodo para verificar se um tempo é maior que outro em termos de passagem de argumento com o objeto Tempo
     * @param outroTempo
     * @return boolean se é maior ou menor
     */

    public boolean verificarSeTempoMaiorQueOutro(Tempo outroTempo) {
        int tempo1 = hora * SEGUNDOS_NUMA_HORA + minuto * SEGUNDOS_NUM_MINUTO + segundo;
        int tempo2 = outroTempo.hora * SEGUNDOS_NUMA_HORA + outroTempo.minuto * SEGUNDOS_NUM_MINUTO + outroTempo.segundo;
        return tempo1 > tempo2;
    }

    /**
     * metodo para verificar se um tempo é maior que o outro passando como argumentos as horas, minutos e segundos
     * @param hora
     * @param minuto
     * @param segundo
     * @return booleano se é maior ou menor o tempo 1 em relação ao tempo 2
     */
    // método overloading que recebe no mesmo método que o acima diferentes parameteros
    public boolean verificarSeTempoMaiorQueOutro(int hora, int minuto, int segundo) {
        int tempo1 = this.hora * SEGUNDOS_NUMA_HORA + this.minuto * SEGUNDOS_NUM_MINUTO + this.segundo;
        int tempo2 = hora * SEGUNDOS_NUMA_HORA + minuto * SEGUNDOS_NUM_MINUTO + segundo;
        return tempo1 > tempo2;
    }
    // METODOS ESTATICOS
    /**
     * método estatico para calcular a diferença de tempos em segundos apenas
     * @param tempo1
     * @param tempo2
     * @return valor absoluto do numero de segundos
     */
    public static int diferencaTempoSegundos(Tempo tempo1,Tempo tempo2) {
        int tempoFinal1 = tempo1.hora * SEGUNDOS_NUMA_HORA + tempo1.minuto * SEGUNDOS_NUM_MINUTO + tempo1.segundo;
        int tempoFinal2 = tempo2.hora * SEGUNDOS_NUMA_HORA + tempo2.minuto * SEGUNDOS_NUM_MINUTO + tempo2.segundo;
        return Math.abs(tempoFinal1 - tempoFinal2);
    }

    /**
     * método estatico para calcular a differença de tempos em termos de tempo dado em formato HH:mm:ss
     * @param tempo1
     * @param tempo2
     * @return string formatado com o tempo em termos de diferença
     */
    public static String diferencaEntreTempos(Tempo tempo1, Tempo tempo2) {
        int diferencaSegundos = diferencaTempoSegundos(tempo1, tempo2);

        int horas = diferencaSegundos / SEGUNDOS_NUMA_HORA; //divisão inteira por 3600
        int resto = (diferencaSegundos % SEGUNDOS_NUMA_HORA);
        int minutos = resto / SEGUNDOS_NUM_MINUTO; // divisão inteira por 60
        int segundos = resto % SEGUNDOS_NUM_MINUTO; // resto para obter numero de segundos

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
