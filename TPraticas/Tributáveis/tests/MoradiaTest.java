package org.dei.tributaveis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoradiaTest {

    @Test
    void calcularImposto() {
        Moradia mteste = new Moradia("Braga",90,Cores.CINZENTO);
        double actualValue = mteste.calcularImposto();
        double expectedValue = 180;
        double error = 1e-5;
        assertEquals(expectedValue, actualValue, error);
    }
}