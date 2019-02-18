package com.zipcodewilmington.assessment1.part1;

import java.util.stream.IntStream;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for(int i:intArray) {
            sum +=i;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = 1;
        for(int i:intArray) {
            product *= i;
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
       double avg = 0;
       double count = intArray.length;
       for(int i :intArray){
           avg += i;
       }
       double avg2 = avg/count;
        return avg2;
    }
}
