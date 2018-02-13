package ru.fyanis.golovach.IO.io1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class App06 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] b = "AA".getBytes("UTF-16");
        System.out.println(Arrays.toString(b));
        String str = new String(b, "UTF-8");
        System.out.println(str);

        byte[] b2 = "AA".getBytes("UTF-8");
        System.out.println(Arrays.toString(b2));
        String str2 = new String(b2, "UTF-8");
        System.out.println(str2);


        byte[] b3 = "AA".getBytes("UTF-8");
        System.out.println(Arrays.toString(b3));

        byte[] b4 = "AA".getBytes("UTF-16");
        System.out.println(Arrays.toString(b4));

        byte[] b5 = "AA".getBytes("UTF-32");
        System.out.println(Arrays.toString(b5));
    }
}
