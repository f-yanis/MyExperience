package ru.fyanis.lafore.chapter3;

import java.util.Arrays;

public class App00 {
    public static void main(String[] args) {
        int[] ar1 = {334, 1, 4, 2, 434, 0, 3, 453, 256};
        int index;

        System.out.println(Arrays.toString(ar1));

        for (int i = 0; i < ar1.length; i++) {
            index = i;
            for (int j = i; j < ar1.length; j++) {
                if (ar1[index] > ar1[j]) {
                    index = j;
                }
            }
            int tmp = ar1[i];
            ar1[i] = ar1[index];
            ar1[index] = tmp;
        }
        System.out.println(Arrays.toString(ar1));
    }
}
