package ru.fyanis.golovach.proc.iteration;


import java.util.Arrays;

/**
 * слияние двух отсортированных массивов
 */
public class App1 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 10};
        int arr2[] = {3, 6, 7, 8, 9};
        int arr3[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < arr2[arr2.length - (arr2.length - 1)]) {
                arr3[i] = arr1[i];
            } else {
                if (arr1[i] > arr2[arr2.length - (arr2.length - 1)]) {
                    arr3[i] = arr2[i];
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
