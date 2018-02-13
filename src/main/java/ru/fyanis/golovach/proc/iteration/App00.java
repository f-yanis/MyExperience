package ru.fyanis.golovach.proc.iteration;

import java.util.Arrays;

/**
 * поменять местами элементы массива
 */
public class App00 {
    /**
     * от 0 до середины
     * @param args
     */
    public static void main(String[] args) {
        int aray[] = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(aray));
//        sort1(aray);
//        System.out.println(Arrays.toString(aray));
        sort2(aray);
        System.out.println(Arrays.toString(aray));

//        /**
//         * Обменять переменные значениями
//         */
//
//        int a = 2;
//        int b = 3;

//        // с временной переменной
//        int tmp = a;
//        a = b;
//        b = tmp;
//        // без временной переменной
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a " + a + ";" + "b " + b);
//        System.out.println(Arrays.toString(aray));
//        String arayStr[][] = {{"df", "dfd", "dfd"}, {"dsd", "sdf"}};
//        System.out.println(Arrays.deepToString(arayStr));

    }

    public static int[] sort1(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }

    public static int[] sort2(int[] arr) {
        for (int i = arr.length/2; i < -1; i--) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }
}
