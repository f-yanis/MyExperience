package ru.fyanis.golovach.proc.iteration;

import java.util.Arrays;

/**
 * сортировка
 */
public class App3 {
    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            for (int j = 3; j >= 4 - 1 - i; j--) {
//                System.out.print(" " + j);
//            }
//            System.out.println();
//        }

        int arr[] = {10, 4, 50, 9, 7, 3};
        System.out.println(Arrays.toString(arr));
//        System.out.println("старт сортировки____________вверх___________старт сортировки");
//        int resArrAp[] = sortApp(arr);
//        System.out.println("старт сортировки____________вниз___________старт сортировки");
//        int resArrDown[] = sortDown(arr);
        System.out.println("старт сортировки____________шейкер___________старт сортировки");
        int resShaker[] = shaker(arr);
    }

    private static int[] shaker(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1 - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            System.out.println("=> " + Arrays.toString(arr));
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                }
            }
            System.out.println("<=" + Arrays.toString(arr));
        }
        return arr;
    }

    private static int[] sortDown(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] > arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    private static int[] sortApp(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1 - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
