// import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        String romanNum = "XIIIV";
        int integerNum = romanToInt(romanNum);
        System.out.println(integerNum);
    }

    public static int romanToInt(String roman) {
        int res = 0;

        for (int i = 0; i < roman.length(); i++) {
            int currentNum = getValue(roman.charAt(i));
            if (i + 1 < roman.length() && getValue(roman.charAt(i + 1)) > currentNum)
                res = res - currentNum;
            else
                res = res + currentNum;
        }
        return res;
    }

    public static int getValue(char num) {
        switch (num) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
