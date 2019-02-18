package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints[i] = null;
            }
            List<Integer> arrList = new ArrayList<>();

            for (Integer s : ints) {
                if (s != null) {
                    arrList.add(s);
                }
            }
            ints = arrList.toArray(new Integer[arrList.size()]);
        }
        return ints;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 1) {
                ints[i] = null;
            }
            List<Integer> arrList = new ArrayList<>();

            for (Integer s : ints) {
                if (s != null) {
                    arrList.add(s);
                }
            }
            ints = arrList.toArray(new Integer[arrList.size()]);
        }
        return ints;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer[] ints2 = new Integer[]{};
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0) {
                ints[i] = null;
            }
            List<Integer> arrList = new ArrayList<>();

            for (Integer s : ints) {
                if (s != null) {
                    arrList.add(s);
                }
            }
            ints2 = arrList.toArray(new Integer[arrList.size()]);
        }
        return ints2;
    }


    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
       Integer[] ints2 = new Integer[]{};

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple == 0) {
                ints[i] = null;
            }
            List<Integer> arrList = new ArrayList<>();

            for (Integer s : ints) {
                if (s != null) {
                    arrList.add(s);
                }
            }
            ints2 = arrList.toArray(new Integer[arrList.size()]);
        }
        return ints2;
    }
}
