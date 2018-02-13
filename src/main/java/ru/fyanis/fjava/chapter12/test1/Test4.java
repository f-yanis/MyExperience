package ru.fyanis.fjava.chapter12.test1;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    private static int f() {
        try {
            System.out.println(0);
            return 42;
        } catch (NullPointerException e) {
            System.out.println(1);
        }finally {
            System.out.println(2);
        }
        System.out.println(3);
        return 22;
    }
}
