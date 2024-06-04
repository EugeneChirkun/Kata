package org.example.echirkun;

import java.util.HashMap;
import java.util.Map;

public class OddNumberOfInts {
    public static void main(String[] args) {
findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});
    }
    public static int findIt(int[] a) {
        int result = 0;

        for (int num : a) {
            result ^= num;
        }

        System.out.println("RESULT " + result);
        return result;
    }
}
