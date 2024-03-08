package Week4.Step2;

import Week4.Step2.Rekenmachine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RekenmachineTest {
    Rekenmachine calc = new Rekenmachine();
    //voor elke functie 2 test methodes aangemaakt om zowel double als int te testen
    @Test
    void optellen() {
        assertEquals(3, calc.optellen(1,2));
    }

    @Test
    void testOptellen() {
        assertEquals(4.0, calc.optellen(2.0, 2.0));
    }

    @Test
    void aftrekken() { // freaky rekenmachine
        assertEquals(2, calc.aftrekken(4, 2));
    }

    @Test
    void testAftrekken() {
        assertEquals(2.0, calc.aftrekken(4.0, 2.0));
    }

    @Test
    void vermenigvuldigen() {
        assertEquals(9, calc.vermenigvuldigen(3, 3));
    }

    @Test
    void testVermenigvuldigen() {
        assertEquals(9.0, calc.vermenigvuldigen(3.0, 3.0));
    }

    @Test
    void delen() {
        assertEquals(3, calc.delen(9,3));
    }

    @Test
    void testDelen() {
        assertEquals(3.0, calc.delen(9.0, 3.0));
    }
}