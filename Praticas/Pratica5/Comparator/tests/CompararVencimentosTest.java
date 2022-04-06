package vencimentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompararVencimentosTest {

    @Test
    void compare() {
        CompararVencimentos c1 = new CompararVencimentos();
        TrabalhadorComissao tc1 = new TrabalhadorComissao("Susana Ferreira",
                500.0f, 1500.0f, 6f);
        TrabalhadorComissao tc2 = new TrabalhadorComissao("Susana Ferreira",
                300.0f, 1500.0f, 6f);

        int actualVal = c1.compare(tc1, tc2);
        int expectedVal = 1;
        double error = 1e-5;

        assertEquals(expectedVal, actualVal, error);

    }
}