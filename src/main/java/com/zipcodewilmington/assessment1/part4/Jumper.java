package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jCount= 0;
        int oneCount = 0;
        int jumpMan = 0;

       while (j <= k) {
            jCount++;
            k = k - j;
        }
        while (j > k) {
            oneCount = k;
            break;
        }

        jumpMan = jCount + oneCount;
        return jumpMan;
    }
}
