package main;

import java.util.HashMap;
import java.util.Map;

public class FruitBasket {
    /*
    Given an array of characters where each character represents a fruit tree, you are given two baskets,
    and your goal is to put maximum number of fruits in each basket.
    The only restriction is that each basket can have only one type of fruit.
    You can start with any tree, but you can’t skip a tree once you have started.
    You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.
    Write a function to return the maximum number of fruits in both baskets.

        @Test
    public void test1() {
        char[] fruits = new char[] {'A', 'B', 'C', 'A', 'C'};
        int result = FruitBasket.findLength(fruits);
        assertEquals(3, result);
    }

    basketA : C C
    basketB : A

    @Test
    public void test2() {
        char[] fruits = new char[] {'A', 'B', 'C', 'B', 'B', 'C'};
        int result = FruitBasket.findLength(fruits);
        assertEquals(5, result);
    }

{'a'}
    a-z trees
     */
    public static int findLength(char[] arr) {
        //traverse the array with left and right pointer
        //Hashmap <Character, Integer>

        if (arr.length == 1)
            return 1;

        int leftPointer = 0, rightPointer = 1,  result = 0;
        HashMap<Character, Integer> fruitBasket = new HashMap();

        fruitBasket.put(arr[leftPointer], fruitBasket.getOrDefault(arr[leftPointer], 0) + 1);
        fruitBasket.put(arr[rightPointer], fruitBasket.getOrDefault(arr[rightPointer], 0) + 1);
        rightPointer++;
        result = 2;

        //{'A', 'B', 'C', 'B', 'B', 'C'};
        while (leftPointer < rightPointer && rightPointer < arr.length) {
            char currentFruit = arr[rightPointer]; //b

            if (fruitBasket.containsKey(currentFruit)) {
                fruitBasket.put(currentFruit, fruitBasket.get(currentFruit) + 1);
                result++;//3
            } else if (!fruitBasket.containsKey(currentFruit) && fruitBasket.size() == 2) {
                result -= fruitBasket.get(arr[leftPointer]);//1
                fruitBasket.remove(arr[leftPointer]);//b:1

                leftPointer++;//1
                fruitBasket.put(arr[rightPointer], 1);//c:1, b:1
                result++;
            }
            rightPointer++;
        }
        return result;
    }
}
