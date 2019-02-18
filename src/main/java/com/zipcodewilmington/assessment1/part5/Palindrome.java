package com.zipcodewilmington.assessment1.part5;

import java.util.*;


public class Palindrome {
    public Integer countPalindromes(String input) {
        String temp = "";
        StringBuffer stf;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {

                temp = input.substring(i, j);

                if (temp.length() >= 1) {

                    stf = new StringBuffer(temp);
                    stf.reverse();

                    if (stf.toString().compareTo(temp) == 0)
                        count++;
                }
            }
        }

        return count;
    }
}
