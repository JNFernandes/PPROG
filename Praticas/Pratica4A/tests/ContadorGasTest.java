import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContadorGasTest {

    @Test
    void calcularConsumo() {
       ContadorGas c1 = new ContadorGas(100,"António");
       double actualVal = c1.calcularConsumo();
       double expectedVal = 80;
       double error = 1e-5;
       assertEquals(expectedVal, actualVal, error);
    }

}