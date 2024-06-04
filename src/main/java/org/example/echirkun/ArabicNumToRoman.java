package org.example.echirkun;

public class ArabicNumToRoman {
    public static void main(String[] args) {
        ArabicNumToRoman o = new ArabicNumToRoman();
        System.out.println(o.numberToRoman(1));
    }

    public String numberToRoman(Integer number) {
        String out = "";
        int tempNum = 0;
        int digit = (int) Math.ceil(Math.log10(number)+0.5);
        if (number < 1 || number > 3999) {
            throw new NumberFormatException("Number not in range [1:3999]!");
        }

        System.out.println("Digit: " + digit);

        for (int i = digit; i > 0; i--) {
            System.out.println("i= " + i);
            switch (i) {
                case 4:
                    tempNum = Character.getNumericValue(String.valueOf(number/1000).charAt(String.valueOf(number/1000).length() - 1));
                    out += "M".repeat(tempNum);
                    break;
                case 3:
                    tempNum = Character.getNumericValue(String.valueOf(number/100).charAt(String.valueOf(number/100).length() - 1));
                    if (tempNum<5) {
                        out += "C".repeat(tempNum);
                    }
                    else if (tempNum==5) {
                        out += "D";
                    }
                    else if (tempNum>5) {
                        out += "D";
                        out += "C".repeat(tempNum-5);
                    }
                    break;
                case 2:
                    tempNum = Character.getNumericValue(String.valueOf(number/10).charAt(String.valueOf(number/10).length() - 1));
                    if (tempNum<5&tempNum>0) {
                        out += "X".repeat(tempNum);
                    }
                    else if (tempNum==5) {
                        out += "L";
                    }
                    else if (tempNum>5) {
                        out += "L";
                        out += "X".repeat(tempNum-5);
                    }
                    break;
                case 1:
                    tempNum = Character.getNumericValue(String.valueOf(number).charAt(String.valueOf(number).length() - 1));
                    if (tempNum<4&tempNum>0) {
                        out += "I".repeat(tempNum);
                    }
                    else if (tempNum==4) {
                        out += "IV";
                    }
                    else if (tempNum==5) {
                        out += "V";
                    }
                    else if (tempNum>5) {
                        out += "V";
                        out += "I".repeat(tempNum-5);
                    }
                    break;
                default:
                    break;
            }
        }
        return out;
    }
}
