package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String camel = str.substring(0,1).toUpperCase() + str.substring(1);
        return camel;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();
        String str3 = str2.toString();
        return str3;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();
        String str3 = str2.toString();
        String camel = str3.substring(0,1).toUpperCase() + str3.substring(1);
        return camel;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuffer str2 = new StringBuffer();
        str2.append(str);
        int x = str2.length();

        for (int i = 0; i < x; i++) {
            Character c = str2.charAt(i);
            if(Character.isLowerCase(c)) {
                str2.replace(i, i+1, Character.toUpperCase(c)+"");
            } else {
                str2.replace(i, i+1, Character.toLowerCase(c)+"");
            }
        }
        String str3 = str2.toString();

        return str3;
    }
}
