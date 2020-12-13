package com.example.roman;

import java.util.HashMap;

public class RomanNumeral {

    private HashMap<String, Integer> table;

    public RomanNumeral() {

        table = new HashMap<>();

        table.put("I", 1);
        table.put("V", 5);
        table.put("X", 10);
        table.put("L", 50);
        table.put("C", 100);
        table.put("D", 500);
        table.put("M", 1000);
    }

    public int convert(String romanString) {

        int romanInteger = 0;
        int length = romanString.length();

        for (int i = 0; i < length; i++) {
            int current = getRomanInteger(romanString, i);
            int right = getRight(romanString, length, i);

            if (right > current) {
                current *= -1;
            }
            romanInteger += current;
        }
        return romanInteger;
    }

    private int getRight(String romanString, int length, int i) {
        int right = 0;
        if (i < length - 1) {
            right = getRomanInteger(romanString, i + 1);
        }
        return right;
    }

    private Integer getRomanInteger(String romanString, int index) {
        return table.get(Character.toString(romanString.charAt(index)));
    }
}

