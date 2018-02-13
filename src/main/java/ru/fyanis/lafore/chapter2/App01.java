package ru.fyanis.lafore.chapter2;

import java.util.Arrays;

public class App01 {
    public static void main(String[] args) {
        int[] ar1 = {1, 3, 5, 6, 7, 8, 9, 56, 67, 78, 79, 780,};
        int[] ar2 = {2, 4, 5, 6, 78, 98, 100};
        int[] result = new int[ar1.length + ar2.length];

        int ar1Index = 0;
        int ar2Index = 0;

        while (ar1Index + ar2Index < result.length) {
            if (ar1Index == ar1.length) {
                System.arraycopy(ar2, ar2Index, result, ar1Index + ar2Index, ar2.length - ar2Index);
                ar1Index = ar1.length;
                ar2Index = ar2.length;
            } else if (ar2Index == ar2.length) {
                System.arraycopy(ar1, ar1Index, result, ar1Index + ar2Index, ar1.length - ar1Index);
                ar1Index = ar1.length;
                ar2Index = ar2.length;
            } else {
                if (ar1[ar1Index] < ar2[ar2Index]) {
                    result[ar1Index + ar2Index] = ar1[ar1Index++];
                } else {
                    result[ar1Index + ar2Index] = ar2[ar2Index++];
                }

            }
        }

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        System.out.println(Arrays.toString(result));

    }
}
