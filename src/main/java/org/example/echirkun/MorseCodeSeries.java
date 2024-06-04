package org.example.echirkun;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeSeries {
    public static void main(String[] args) {
        System.out.println(decode(" .... . -.--   .--- ..- -.. . "));
    }

    public static String decode(String morseCode) {
        String result = "";
        String[] words = morseCode.trim().split("   ");
        for (int i = 0; i < words.length; i++) {
            String[] letters = words[i].split(" ");
          for (int j = 0; j < letters.length; j++) {
              result += getWordFromLibrary(letters[j]);
          }
          result += " ";
        }
        return result;
    }

    private static String getWordFromLibrary(String key) {
        Map<String, String> library = new HashMap<String, String>();
        library.put(".-", "A");
        library.put("-...", "B");
        library.put("-.-.", "C");
        library.put("-..", "D");
        library.put(".", "E");
        library.put("..-.", "F");
        library.put("--.", "G");
        library.put("....", "H");
        library.put("..", "I");
        library.put(".---", "J");
        library.put("-.-", "K");
        library.put(".-..", "L");
        library.put("--", "M");
        library.put("-.", "N");
        library.put("---", "O");
        library.put(".--.", "P");
        library.put("--.-", "Q");
        library.put(".-.", "R");
        library.put("...", "S");
        library.put("-", "T");
        library.put("..-", "U");
        library.put("...-", "V");
        library.put(".--", "W");
        library.put("-..-", "X");
        library.put("-.--", "Y");
        library.put("--..", "Z");

        library.put(".----", "1");
        library.put("..---", "2");
        library.put("...--", "3");
        library.put("....-", "4");
        library.put(".....", "5");
        library.put("-....", "6");
        library.put("--...", "7");
        library.put("---..", "8");
        library.put("----.", "9");
        library.put("-----", "0");

        return library.get(key);
    }
}
