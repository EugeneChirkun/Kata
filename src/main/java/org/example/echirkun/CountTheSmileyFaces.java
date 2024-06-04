package org.example.echirkun;

import java.util.Arrays;
import java.util.List;

public class CountTheSmileyFaces {
    public static void main(String[] args) {
        solution(Arrays.asList(":)", ";(", ";}", ":-D", ":D"));
    }

    public static Integer solution(List<String> arr) {
        List<String> smileys = Arrays.asList(":)", ":D", ";D", ":~)");
        
        long smilesCount = arr.stream()
                .filter(smileys::contains)
                .count();

        return (int) smilesCount;
    }
}
