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
    @Test
    public void testSubtract() {
        assertEquals(6, sm.Subtract(12, 6));
    }

    @Test
    public void testSubtractSecondNumIsGreater() {
        assertEquals(-18, sm.Subtract(2, 20));
    }

    @Test
    public void testSubtractNegativeNum() {
        assertEquals(4, sm.Subtract(2, -2));
    }

    @Test
    public void testSubtractZero() {
        assertEquals(2, sm.Subtract(2, 0));
    }

    @Test
    public void testSubtractFromZero() {
        assertEquals(-10, sm.Subtract(0, 10));
    }

    @Test
    public void testSubtractFirstParamNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            sm.Subtract(null, 5);
        });
    }

    @Test
    public void testSubtractSecondParamNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            sm.Subtract(3, null);
        });
    }

    @Test
    public void testMultiply() {
        assertEquals(6, sm.Multiply(2, 3));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, sm.Multiply(4, 0));
    }

    @Test
    public void testMultiplyZeroByZero() {
        assertEquals(0, sm.Multiply(0, 0));
    }

    @Test
    public void testMultiplyTwoNegativeNums() {
        assertEquals(6, sm.Multiply(-2, -3));
    }

    @Test
    public void testMultipleNegativeNumByPositiveNum() {
        assertEquals(-8, sm.Multiply(-2, 4));
    }

    @Test
    public void testMultiplyFirstParamNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            sm.Subtract(null, 2);
        });
    }

    @Test
    public void testMultiplySecondParamNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            sm.Subtract(3, null);
        });
    }

    @Test
    public void Divide() {
        assertEquals(2, sm.Divide(4, 2));
    }

    @Test
    public void DivideByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            assertEquals(2, sm.Divide(4, 0));
        });
    }

    @Test
    public void DivideZeroByNumber() {
        assertEquals(0, sm.Divide(0, 2));
    }

    @Test
    public void DivideSecondNumberIsGreater() {
        assertEquals(0, sm.Divide(2, 4));
    }

    @Test
    public void DivideTwoNegativeNumbers() {
        assertEquals(2, sm.Divide(-4, -2));
    }

    @Test
    public void DivideFirstNumberIsNegative() {
        assertEquals(-2, sm.Divide(-4, 2));
    }

    @Test
    public void DivideSecondNumberIsNegative() {
        assertEquals(-2, sm.Divide(4, -2));
    }

    @Test
    public void DivideHandleDecimalResult() {
        assertEquals(4, sm.Divide(9, 2));
    }

    @Test
    public void testDivideFirstParamNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            sm.Subtract(null, 2);
        });
    }

    @Test
    public void testDivideSecondParamNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            sm.Subtract(3, null);
        });
    }
}