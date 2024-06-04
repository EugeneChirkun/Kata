package org.example.echirkun;

import java.util.ArrayList;
import java.util.List;

public class Snail {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] result1 = solution(array1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        int n = array.length;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(array[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(array[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(array[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(array[i][left]);
                }
                left++;
            }
        }

        int[] snailResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            snailResult[i] = result.get(i);
        }
        return snailResult;
    }
}
