package ru.fyanis.another;

import java.util.Arrays;

public class Another2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 7, 5, 8, 6, 10, 4, 5, 6, 7, 8, 8, 4};
        System.out.println(Arrays.toString(m(arr)));
    }

    public static int[] m(int[] arr) {
        int[] tmp = new int[arr.length - 2];
        for (int i = 0; i < arr.length - 2; i++) {
            int min = Math.min(arr[i], arr[i + 1]);
            tmp[i] = Math.min(min, arr[i + 2]);
        }
        return tmp;
    }
}
