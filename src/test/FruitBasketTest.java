package test;

import main.FruitBasket;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FruitBasketTest {
    @Test
    public void test1() {
        char[] fruits = new char[] {'A', 'B', 'C', 'A', 'C'};
        int result = FruitBasket.findLength(fruits);
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        char[] fruits = new char[] {'A', 'B', 'C', 'B', 'B', 'C'};
        int result = FruitBasket.findLength(fruits);
        assertEquals(5, result);
    }
}
