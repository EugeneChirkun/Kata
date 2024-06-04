package org.example.echirkun;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {
    public static void main(String[] args) {
        scramble("cedewaraaossoqqyt", "codewars");
    }

    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> count1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            count1.put(c, count1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> count2 = new HashMap<>();
        for (char c : str2.toCharArray()) {
            count2.put(c, count2.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : count2.entrySet()) {
            char charInStr2 = entry.getKey();
            int neededCount = entry.getValue();
            if (count1.getOrDefault(charInStr2, 0) < neededCount) {
                return false;
            }
        }
        return true;
    }
}
