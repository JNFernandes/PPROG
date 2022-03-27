package org.dei.tributaveis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void calcularImposto() {
        Veiculo vteste1 = new Veiculo("14-15-CC", 1400, Cores.AZUL);
        Veiculo vteste2 = new Veiculo("25-22-JD", 2000, Cores.AZUL);
        double actualVal = vteste1.calcularImposto();
        double expectedVal = 15;
        double actualVal2 = vteste2.calcularImposto();
        double expectedVal2 = 40;
        double error = 1e-5;

        assertEquals(actualVal, expectedVal, error);
        assertEquals(actualVal2, expectedVal2, error);
    }

}