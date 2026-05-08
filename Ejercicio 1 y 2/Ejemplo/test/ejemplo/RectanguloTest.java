package ejemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectanguloTest {

	// Valores positivos
    @Test
    public void testAreaPositiva() {
        Rectangulo r = new Rectangulo(5, 3);
        assertEquals(15, r.area());
    }

    @Test
    public void testPerimetroPositivo() {
        Rectangulo r = new Rectangulo(5, 3);
        assertEquals(16, r.perimetro());
    }

    // Valores negativos
    @Test
    public void testAreaNegativa() {
        Rectangulo r = new Rectangulo(-5, 3);
        assertEquals(-1, r.area());
    }

    @Test
    public void testPerimetroNegativo() {
        Rectangulo r = new Rectangulo(5, -3);
        assertEquals(-1, r.perimetro());
    }

    // Valores cero
    @Test
    public void testAreaCero() {
        Rectangulo r = new Rectangulo(0, 3);
        assertEquals(0, r.area());
    }

    @Test
    public void testPerimetroCero() {
        Rectangulo r = new Rectangulo(0, 3);
        assertEquals(0, r.perimetro());
    }
    
    
    // Incorrectos
    @Test
    public void testAreaIncorrecta() {
        Rectangulo r = new Rectangulo(5, 3);
        assertEquals(20, r.area()); 
    }

    @Test
    public void testPerimetroIncorrecto() {
        Rectangulo r = new Rectangulo(5, 3);
        assertEquals(10, r.perimetro()); 
    }

}
