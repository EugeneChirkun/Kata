package org.example.echirkun;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class MeanSquareError {
    public static void main(String[] args) {
        int[] arr1 = {10,20,10,2};
        int[] arr2 = {10,25,5,-2};
        System.out.println("Answer is " + solution(arr1, arr2));
    }

    public static double solution(int[] arr1, int[] arr2) {
        double answer = 0.0;
        for (int i = 0; i < arr1.length; i++) {
            answer += pow((abs(arr1[i]-arr2[i])),2);
        }
        return answer/arr1.length;
    }
}
