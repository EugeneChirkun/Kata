package org.example.echirkun;

public class Main {
    public static void main(String[] args) {
        int num = 564122;


        String numStr = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        // Loop through each character (digit) in the string representation of the number
        for (int i = 0; i < numStr.length(); i++) {
            // Get the current digit as a character and convert it to an integer
            char digitChar = numStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            // Square the digit
            int squaredDigit = digit * digit;

            // Append the squared digit to the result StringBuilder
            result.append(squaredDigit);
        }

        // Convert the result StringBuilder to a string and then parse it as an integer
//        return Integer.parseInt(result.toString());

    }
}