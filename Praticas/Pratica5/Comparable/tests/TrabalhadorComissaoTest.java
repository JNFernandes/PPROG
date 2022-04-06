package main.java.vencimentos;

import vencimentos.TrabalhadorComissao;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorComissaoTest {

    @org.junit.jupiter.api.Test
    void calcularVencimento() {
        TrabalhadorComissao t1 = new TrabalhadorComissao("André",567.0f, 4000.0f, 7f);
        TrabalhadorComissao t2 = new TrabalhadorComissao("Diogo",450.0f, 3000.0f, 15f);
        double actualVal = t1.calcularVencimento();
        double expectedVal = 847.0f;
        double error = 1e-5;
        assertEquals(expectedVal, actualVal, error);

        double actualVal2 = t2.calcularVencimento();
        double expectedVal2 = 900.0f;
        assertEquals(actualVal2, expectedVal2, error);
    }

}