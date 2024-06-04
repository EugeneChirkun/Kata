package org.example.echirkun;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(solution("7tT1sa9ds7fS65465464"));
    }

    public static Integer solution(String input) {
        Map<Character, Long> map = input.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long repeatingSymbols = map.values().stream()
                .filter(count -> count > 1)
                .count();

        return (int) repeatingSymbols;
    }
}
