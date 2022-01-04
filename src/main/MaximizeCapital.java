package main;

import java.util.Map;
import java.util.TreeMap;

/*
Given a set of investment projects with their respective profits, we need to find the most profitable projects.
We are given an initial capital and are allowed to invest only in a fixed number of projects.
Our goal is to choose projects that give us the maximum profit.
Write a function that returns the maximum total capital after selecting the most profitable projects.

We can start an investment project only when we have the required capital. Once a project is selected, we can assume that its profit has become our capital.
 */
//1    2    3
//[20,25, 30, 40]
//[45,47, 50, 55]
//2
//19
//edge case : initial capital not enough for any of the capital.
//brute force, filter out all capitals and profits with less than or equal to current capital.
//filter out the maximum profit then add it to tue current capital.
// repeat above until numberofprojects times.
public class MaximizeCapital {
    public static int findMaximumCapital(int[] capital, int[] profits, int numberOfProjects, int initialCapital) {
        int currentCapital = initialCapital;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < capital.length; i++) { //o(n)
            map.put(capital[i], profits[i]);
        } // log n

        //n log n

        for (int i = 0; i < numberOfProjects; i++) { //1 //o(1)
            try {
                Map.Entry<Integer, Integer> num = map.floorEntry(currentCapital);//74  //o(1)
                currentCapital += num.getValue();//55 + 74 = 129
            } catch (Exception e) {
                return initialCapital;
            }
        }

        return currentCapital; //129
    }
}
