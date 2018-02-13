package ru.fyanis.golovach.IO.io1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class App07 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        char c = 55;
        System.out.println(c);
        System.out.println(Arrays.toString("55".getBytes("UTF-16")));
        char cc = 53;
        System.out.println(cc);
    }
}
