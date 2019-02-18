package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int result = 0;

        for (int x = 1; x <= n; x++)
            result += x;

        return result;

    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int product = 1;

        for (int i =1; i <= n; i++)
            product *= i;

        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
            long reversedNum = 0;
            long input_long = val;

            while (input_long != 0) {
                reversedNum = reversedNum * 10 + input_long % 10;
                input_long = input_long / 10;
            }

            if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
                throw new IllegalArgumentException();
            }
            return (int) reversedNum;
    }
}
