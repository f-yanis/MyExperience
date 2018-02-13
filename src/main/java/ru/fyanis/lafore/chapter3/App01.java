package ru.fyanis.lafore.chapter3;

import java.util.Arrays;

public class App01 {
    public static void main(String[] args) {
        int maxSize = 100000;
        int[] ar = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            ar[i] = (int) (Math.random() * maxSize);
        }
        System.out.println(Arrays.toString(ar));
        int count = 0;
        int tmp;
        boolean bool = true;
        long start = System.currentTimeMillis();
        while (bool) {
            int t = count;
            for (int i = 1; i < ar.length - 1; i += 2) {
                if (i % 2 != 0) {
                    if (ar[i] > ar[i + 1]) {
                        tmp = ar[i];
                        ar[i] = ar[i + 1];
                        ar[i + 1] = tmp;
                        count++;
                    }
                }
            }
            for (int i = 0; i < ar.length - 1; i += 2) {
                if (i % 2 == 0) {
                    if (ar[i] > ar[i + 1]) {
                        tmp = ar[i];
                        ar[i] = ar[i + 1];
                        ar[i + 1] = tmp;
                        count++;
                    }
                }
            }
            if (t == count) {
                bool = false;
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
        System.out.println(Arrays.toString(ar));
    }
}
