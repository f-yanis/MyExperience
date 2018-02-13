package ru.fyanis.golovach.IO.io1;

public class App03 {
    public static void main(String[] args) {
        char c0 = 65535;
        char c1 = 656;
        char c2 = 0x0000;   //шеснадцатиричный код
        char c3 = 0x0F0F;   //шеснадцатиричный код
        char c4 = '\u0F0F';
        char c5 = 's';
        String str = "\u0F0Frer\u0F0Fss\u0F0F\u0F0F";

        System.out.println(c0);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(str);
    }
}
