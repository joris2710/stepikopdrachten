import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankrekeningTest {
    Bankrekening bankacc = new Bankrekening(500.40);
    @Test
    void getSaldo() {
        assertEquals(500.40, bankacc.getSaldo());
    }

    @Test
    void geldStorten() {
        bankacc.geldStorten(50);
        assertEquals(550.40, bankacc.getSaldo());
    }

    @Test
    void geldOpnemen() {
        bankacc.geldOpnemen(50);
        assertEquals(450.40, bankacc.getSaldo());
    }
}