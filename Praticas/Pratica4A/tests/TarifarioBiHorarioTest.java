import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarifarioBiHorarioTest {

    @Test
    void calcularConsumo() {
        TarifarioBiHorario tb1 = new TarifarioBiHorario(100,"Diogo", 10);
        TarifarioBiHorario tb2 = new TarifarioBiHorario(100, "Joao", 20);
        double actualVal1 = tb1.calcularConsumo();
        double actualVal2 = tb2.calcularConsumo();
        double expectedVal1 = 14.66;
        double expectedVal2 = 15.32;
        double error = 1e-5;
        assertEquals(expectedVal1, actualVal1, error);
        assertEquals(expectedVal2, actualVal2, error);
    }
}