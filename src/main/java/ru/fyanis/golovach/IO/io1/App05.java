package ru.fyanis.golovach.IO.io1;

public class App05 {
    public static void main(String[] args) {
        char[] c = Character.toChars(150000);
        char chr1 = c[0];
        char chr2 = c[1];
        System.out.println((int) chr1);
        System.out.println((int) chr2);
        String str = new String(c);
        System.out.println(new char[]{chr1, chr2});
    }
}
