package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for(Object word: objectArray) {
            if(word.equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }



    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {

        for(int i=0; i < objectArray.length; i++){
            if(objectArray[i] == objectToRemove){
                objectArray[i] = null;
            }
            List<Integer> arrList = new ArrayList<>();

            for(Integer s : objectArray) {
                if(s != null) {
                    arrList.add(s);
                }
            }
            objectArray = arrList.toArray(new Integer[arrList.size()]);
        }
        return objectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        Arrays.sort(objectArray);

        int maxCount = 1;
        int currentCount = 1;
        Object result = objectArray[0];
        int n = objectArray.length;


        for (int i = 1; i < n; i++)
        {
            if (objectArray[i] == objectArray[i - 1])
                currentCount++;
            else
            {
                if (currentCount > maxCount)
                {
                    maxCount = currentCount;
                    result = objectArray[i - 1];
                }
                currentCount = 1;
            }
        }

        if (currentCount > maxCount)
        {
            maxCount = currentCount;
            result = objectArray[n - 1];
        }

        return result;
    }



    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        Arrays.sort(objectArray);

        int n = objectArray.length;
        int minCount = n+1;
        int currentCount = 1;
        Object result = -1;



        for (int i = 1; i < n; i++)
        {
            if (objectArray[i] == objectArray[i - 1])
                currentCount++;
            else
            {
                if (currentCount < minCount)
                {
                    minCount = currentCount;
                    result = objectArray[i - 1];
                }
                currentCount = 1;
            }
        }


        if (currentCount < minCount)
        {
            minCount = currentCount;
            result = objectArray[n - 1];
        }

        return result;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {

        Integer[] ob = new Integer[objectArray.length + objectArrayToAdd.length];

        System.arraycopy(objectArray, 0, ob, 0, objectArrayToAdd.length);

        // copy second array to object array
        System.arraycopy(objectArrayToAdd, 0, ob, objectArray.length, objectArrayToAdd.length);

        return ob;
    }
}
