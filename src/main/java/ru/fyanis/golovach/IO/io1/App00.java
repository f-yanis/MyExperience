package ru.fyanis.golovach.IO.io1;

import java.io.UnsupportedEncodingException;

public class App00 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("A".getBytes("UTF-16").length);
        System.out.println("AA".getBytes("UTF-16").length);
        System.out.println();
        System.out.println("A".getBytes("UTF-16LE").length);
        System.out.println("AA".getBytes("UTF-16LE").length);
        System.out.println();
        System.out.println("A".getBytes("UTF-16BE").length);
        System.out.println("AA".getBytes("UTF-16BE").length);
    }
}
