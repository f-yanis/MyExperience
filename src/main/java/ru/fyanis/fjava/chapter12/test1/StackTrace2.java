package ru.fyanis.fjava.chapter12.test1;


public class StackTrace2 {
    public static void f() throws Exception {
        System.out.println("Создание исключения в f()");
        throw new Exception("возбуждено из f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("В методе g() e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h()throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("В методе h() e.printStackTrace");
            e.printStackTrace();
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main printStackTrace()");
            e.printStackTrace(System.out);
        }

        System.out.println("--------------------------");

        try {
            h();
        } catch (Exception e) {
            System.out.println("main printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
