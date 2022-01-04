package test;

import main.MaximizeCapital;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximizeCapitalTest {
    @Test
    public void test1() {
        int result = MaximizeCapital.findMaximumCapital(new int[] {25, 20, 40, 30}, new int[] {47, 45, 55, 50}, 2, 27);
        assertEquals(129, result);
    }
    /*
       {
        capital: profit
       }

       availableCapital: initialCapital: 1
       minCapitalHeap: [0, 1, 2, 3]
       maxProfitHeap: [2, 1]
       availableCapital += maxProfitHeap.poll();

        [1, 0, 2, 3]
        [1, 2 , 3, 0] = initial 1

        02 11 = 2
        3
        2 23 30  = 2 & 3 = 3
        return 6
     */
    @Test
    public void test2() {
        int result = MaximizeCapital.findMaximumCapital(new int[] {25, 20, 40, 30}, new int[] {47, 45, 55, 50}, 2, 19);
        assertEquals(19, result);
    }

    @Test
    public void test3() {
        int result = MaximizeCapital.findMaximumCapital(new int[] {0, 1, 2}, new int[] {1, 2, 3}, 2, 1);
        assertEquals(6, result);
    }

    @Test
    public void test4() {
        int result = MaximizeCapital.findMaximumCapital(new int[] {0, 1, 2, 3}, new int[] {1, 2, 3, 5}, 3, 0);
        assertEquals(8, result);
    }
    //Input: Project Capitals=[0,1,2], Project Profits=[1,2,3], Initial Capital=1, Number of Projects=2

    //Input: Project Capitals=[0,1,2,3], Project Profits=[1,2,3,5], Initial Capital=0, Number of Projects=3
}
