package org.example.echirkun;

import java.util.HashSet;
import java.util.Set;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        solution(10);
    }

    public static Integer solution(Integer number) {
        Set<Integer> set = new HashSet<Integer>();
        Integer sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                set.add(i);
            }
            sum = set.stream().mapToInt(Integer::intValue).sum();
        }
        return sum;
    }
}
