package org.example.echirkun;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {
    public static void main(String[] args) {
        System.out.println(josephusSurvivor(7,3));
    }
    public static int josephusSurvivor(final int n, final int k) {
        int index = 0;
        List<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        while (circle.size()>1) {
            index = (index + k - 1) % circle.size();
            circle.remove(index);
        }
        return circle.get(0);
    }
}
