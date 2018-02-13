package ru.fyanis.lafore.chapter2;

import java.util.Arrays;

public class App00 {
    public static void main(String[] args) {
        System.out.println((int)(Math.log10(1024)*3.322));
        System.out.println(rec(2, 10));

        int size = 10;
        int search = 8;
        int[] array = new int[size];

        int lowerBound = 0;
        int upperBound = array.length - 1;
        int curIn;

        boolean bool = true;

        for (int i = 0; i < array.length; i++) {
            array[i] = i+7;
        }

        System.out.println(Arrays.toString(array));

        while (bool) {
            curIn = (upperBound + lowerBound) / 2;
            if (array[curIn] == search) {
                System.out.println("Found! " + search);
                bool = false;
            } else if (lowerBound > upperBound) {
                System.out.println("No Found");
                bool = false;
            } else {
                if (array[curIn] < search) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    private static int rec(int i, int i1) {
        return i1 != 0 ? i * rec(2, i1 - 1) : 1;
    }
}
