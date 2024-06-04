package org.example.echirkun;

public class Main {
    public static void main(String[] args) {
        int num = 564122;


        String numStr = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            char digitChar = numStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            int squaredDigit = digit * digit;

            result.append(squaredDigit);
        }
    }
}