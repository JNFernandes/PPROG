
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmpregadoTest {
    private Empregado emp;
    private Data data;
    private Tempo entrada;
    private Tempo saida;

    @Before
    public void setUp() {
        data = new Data(Data.dataAtual());
        entrada = new Tempo(12);
        saida = new Tempo(16);
        emp = new Empregado("Fernando", "Melão aka Excesso", data, entrada, saida);
    }

    @org.junit.Test
    public void calcularNumeroHorasTrabalho() {
        int actuaVal = emp.calcularNumeroHorasTrabalho();
        int expectedVal = 20;
        double erro = 1e-5;

        Assert.assertEquals(expectedVal, actuaVal, erro);

    }

    @org.junit.Test
    public void tempoQueFoiContrato() {
        int actuaVal = emp.tempoQueFoiContrato();
        int expectedVal = 0;
        double erro = 1e-5;
        Assert.assertEquals(expectedVal, actuaVal, erro);


    }
}