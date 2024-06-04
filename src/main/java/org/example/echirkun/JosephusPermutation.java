package org.example.echirkun;

import java.util.ArrayList;
import java.util.List;

public class JosephusPermutation {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            array.add(i);
        }
        int k = 3;
        List<Integer> result = josephusPermutation(array, k);
        System.out.println(result);
    }

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        List<T> copy = new ArrayList<>(items);
        int index = 0;

        while (!copy.isEmpty()) {
            index = (index + k - 1) % copy.size();
            result.add(copy.remove(index));
        }

        return result;
    }
}
