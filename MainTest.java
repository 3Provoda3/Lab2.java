package Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void positive() {
        assertEquals(30, Main.calculateEvenSum(new int[]{2, 4, 6, 8, 10}));
    }

    @Test
    void negative() {
        assertEquals(-30, Main.calculateEvenSum(new int[]{-2, -4, -6, -8, -10}));
    }

    @Test
    void mixed() {
        assertEquals(8, Main.calculateEvenSum(new int[]{-2, 3, 4, -5, 6}));
    }

    @Test
    void noEvens() {
        assertEquals(0, Main.calculateEvenSum(new int[]{1, 3, 5, 7, 9}));
    }

    @Test
    void empty() {
        assertEquals(0, Main.calculateEvenSum(new int[]{}));
    }

    @Test
    void nullArray() {
        assertThrows(IllegalArgumentException.class, () -> Main.calculateEvenSum(null));
    }
}
