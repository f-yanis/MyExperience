package ru.fyanis.fjava.chapter12.test1;

class USException extends Exception {
    public USException(String s) {
        super(s);
    }
}

public class Test3 {
    static void f() throws USException {
        throw new USException("Супец");
    }
    static void g() throws USException {
        f();
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (USException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
