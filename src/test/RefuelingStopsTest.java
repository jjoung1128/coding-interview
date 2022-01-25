package test;

import main.RefuelingStops;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RefuelingStopsTest {
    RefuelingStops refuelingStops = new RefuelingStops();

    @Test
    public void test1() {
        int target = 1;
        int startFuel = 1;
        int[][] stations = new int[][]{};
        int minStops = refuelingStops.minRefuelStops(target, startFuel, stations);
        assertEquals(0, minStops);
    }

    @Test
    public void test2() {
        int target = 100;
        int startFuel = 1;
        int[][] stations = new int[][]{new int[]{10, 100}};
        int minStops = refuelingStops.minRefuelStops(target, startFuel, stations);
        assertEquals(-1, minStops);
    }

    @Test
    public void test3() {
        int target = 100;
        int startFuel = 10;
        int[][] stations = new int[][]{
                new int[]{10, 60},
                new int[]{20, 30},
                new int[]{30, 30},
                new int[]{60, 40}
        };
        int minStops = refuelingStops.minRefuelStops(target, startFuel, stations);
        assertEquals(2, minStops);
    }
}
