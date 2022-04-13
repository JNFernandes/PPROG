
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ContribuinteTest {

    @org.junit.jupiter.api.Test
    void impostoTotal() {
        Desempregado d1 = new Desempregado("Lito Vidal", "Lisboa", 510, 1);
        Reformado r1 = new Reformado("Valter Cubilhas", "Olival", 400, 800);
        Desempregado d2 = new Desempregado("Paulo Santos", "Braga", 200, 4);
        TrabalhadorOutrem to1 = new TrabalhadorOutrem("Ana", "Ovar", 1000, 150, "CMM");
        Reformado r2 = new Reformado("Jaime Magalhães", "Porto", 2000, 150);
        TrabalhadorOutrem to2 = new TrabalhadorOutrem("Salvio", "Seixal", 10000, 2000, "SSB");
        TrabalhadorProprio tp1 = new TrabalhadorProprio("Mário", "Guarda", 3000, 100, "Eletricista");
        Reformado r3 = new Reformado("Aníbal Silva", "Coimbra", 500, 100);
        TrabalhadorOutrem to3 = new TrabalhadorOutrem("João", "Lisboa", 700, 200, "CML");
        TrabalhadorProprio tp2 = new TrabalhadorProprio("Carla", "Porto", 20000, 500, "Advogado");
        Desempregado d3 = new Desempregado("Maria Sá", "Afife", 300, 8);

        Contribuinte[] contribuintes = new Contribuinte[11];

        contribuintes[0] = d1;
        contribuintes[1] = r1;
        contribuintes[2] = d2;
        contribuintes[3] = to1;
        contribuintes[4] = r2;
        contribuintes[5] = to2;
        contribuintes[6] = tp1;
        contribuintes[7] = r3;
        contribuintes[8] = to3;
        contribuintes[9] = tp2;
        contribuintes[10] = d3;

        double[] actualValD = new double[11];

        for (int i = 0; i<actualValD.length; i++) {
            actualValD[i] = contribuintes[i].impostoTotal();
        }

        double[] expectedValD = {10.2, 20, 4, 21.5, 61.5, 220, 63, 16, 16 ,415, 6};
        double error = 1e-5;

        assertArrayEquals(expectedValD, actualValD, error);
    }
}