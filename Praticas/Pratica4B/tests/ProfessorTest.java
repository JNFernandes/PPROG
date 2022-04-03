import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @org.junit.jupiter.api.Test
    void auferirValores() {
        Professor p1 = new Professor(1454751, "Antonio", CategoriaProfessor.ASSISTENTE);
        Professor p2 = new Professor(1254524, "Nuno", CategoriaProfessor.COORDENADOR);
        Professor p3 = new Professor(4787854, "Bruno", CategoriaProfessor.ADJUNTO);

        double salario1 = p1.auferirValores();
        double salario2 = p2.auferirValores();
        double salario3 = p3.auferirValores();

        double expectedVal1 = 1800;
        double expectedVal2 = 2250;
        double expectedVal3 = 1500;

        double error = 1e-5;

        assertEquals(expectedVal1, salario1, error);
        assertEquals(expectedVal2, salario2, error);
        assertEquals(expectedVal3, salario3, error);
    }
}