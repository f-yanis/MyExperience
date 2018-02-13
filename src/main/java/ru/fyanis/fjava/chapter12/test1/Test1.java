package ru.fyanis.fjava.chapter12.test1;


class UserExeption extends Exception {
    public UserExeption(String s) {
        super(s);
    }

    public UserExeption() {}
}

public class Test1 {
    public static void f1() throws UserExeption {
        System.out.println("Возбуждаем UserExeption из метода f1()");
        throw new UserExeption();
    }

    public static void f2() throws UserExeption {
        System.out.println("Возбуждаем UserExeption из метода f2()");
        throw new UserExeption("Создано в f2()");
    }

    public static void main(String[] args) {
        try {
            f1();
        } catch (UserExeption userExeption) {
            userExeption.printStackTrace(System.err);
        }

        try {
            f2();
        } catch (UserExeption userExeption) {
            userExeption.getMessage();
        }
    }
}
