package ejemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

    // =========================
    // VALORES POSITIVOS
    // =========================

    @Test
    public void testSuperficiePositiva() {

        Rectangle r = new Rectangle(5, 3);

        assertEquals(15, r.surface());
    }

    @Test
    public void testPerimetroPositivo() {

        Rectangle r = new Rectangle(5, 3);

        assertEquals(16, r.perimeter());
    }

    // =========================
    // VALORES NEGATIVOS
    // =========================

    @Test
    public void testSuperficieNegativa() {

        Rectangle r = new Rectangle(-5, 3);

        assertEquals(-1, r.surface());
    }

    @Test
    public void testPerimetroNegativo() {

        Rectangle r = new Rectangle(5, -3);

        assertEquals(-1, r.perimeter());
    }

    // =========================
    // VALORES CERO
    // =========================

    @Test
    public void testSuperficieCero() {

        Rectangle r = new Rectangle(0, 3);

        assertEquals(0, r.surface());
    }

    @Test
    public void testPerimetroCero() {

        Rectangle r = new Rectangle(0, 3);

        assertEquals(0, r.perimeter());
    }

    // =========================
    // PARA EL 100%
    // =========================

    @Test
    public void testSuperficieAlturaCero() {

        Rectangle r = new Rectangle(5, 0);

        assertEquals(0, r.surface());
    }

    @Test
    public void testPerimetroBaseNegativa() {

        Rectangle r = new Rectangle(-2, 4);

        assertEquals(-1, r.perimeter());
    }

    // =========================
    // TESTS INCORRECTOS
    // =========================

    /*
    @Test
    public void testSuperficieIncorrecta() {

        Rectangle r = new Rectangle(5, 3);

        assertEquals(20, r.surface());
    }

    @Test
    public void testPerimetroIncorrecto() {

        Rectangle r = new Rectangle(5, 3);

        assertEquals(10, r.perimeter());
    }
    */
}