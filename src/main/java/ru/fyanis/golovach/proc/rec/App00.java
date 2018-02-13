package ru.fyanis.golovach.proc.rec;

/**
 * Числа фибоначи
 */
public class App00 {
    public static void main(String[] args) {
        System.out.println("    " + f1(5));
        System.out.println();
        System.out.println("    " + f2(5));
        System.out.println();
        System.out.println("    " + f3(5));
    }

    private static int f3(int i) {
        int result;
        if (i == 0) {
            result = 1;
        } else if (i == 1) {
            result = 1;
        } else {
            int tmp0 = f3(i - 2);
            int tmp1 = f3(i - 1);
            result = tmp0 + tmp1;
        }
        System.out.print(" " + i);
        return result;
    }

    private static int f2(int i) {
        int result;
        if (i == 0) {
            result = 1;
        } else if (i == 1) {
            result = 1;
        } else {
            int tmp0 = f2(i - 2);
            System.out.print(" " + i);
            int tmp1 = f2(i - 1);
            result = tmp0 + tmp1;
        }

        return result;
    }

    private static int f1(int i) {
        int result;
        System.out.print(" " + i);
        if (i == 0) {
            result = 1;
        } else if (i == 1) {
            result = 1;
        } else {
            int tmp0 = f1(i - 2);
            int tmp1 = f1(i - 1);
            result = tmp0 + tmp1;
        }

        return result;
    }
}
