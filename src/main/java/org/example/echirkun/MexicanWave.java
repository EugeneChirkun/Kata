package org.example.echirkun;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static void main(String[] args) {
        String[] result = solution("hello world");
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] solution(String str) {
        str = str.toLowerCase();
        List<String> outputList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
                outputList.add(sb.toString());
            }
        }
        return outputList.toArray(new String[0]);
    }
}
