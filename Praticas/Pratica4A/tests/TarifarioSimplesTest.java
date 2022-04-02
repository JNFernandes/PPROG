import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarifarioSimplesTest {

    @Test
    void calcularConsumo() {
        TarifarioSimples t1 = new TarifarioSimples(100, "André",7);
        TarifarioSimples t2 = new TarifarioSimples(100, "Dinis",6);
        double actualVal1 = t1.calcularConsumo();
        double actualVal2 = t2.calcularConsumo();
        double expectedVal1 = 16;
        double expectedVal2 = 13;
        double error = 1e-5;
        assertEquals(expectedVal1, actualVal1, error);
        assertEquals(expectedVal2, actualVal2, error);
    }
}