package tester;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class SimpleMathTest {
    final SimpleMath sm = new SimpleMath();

    @Test
    public void testAddOneNegative() {
        assertEquals(-1, sm.Add(2, -3));
    }

    @Test
    public void testAddPassZero() {
        assertEquals(3, sm.Add(0, 3));
    }

    @Test ()
    public void testAddFirstParamNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            sm.Add(null, 2);
        });
    }

    @Test ()
    public void testAddSecondParamNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            sm.Add(2, null);
        });
    }
}