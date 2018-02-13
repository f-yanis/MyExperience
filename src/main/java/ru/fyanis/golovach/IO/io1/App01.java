package ru.fyanis.golovach.IO.io1;

import java.io.UnsupportedEncodingException;

public class App01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("ЭЮЯ".getBytes("UTF-8").length);
        System.out.println("ЭЮЯ".getBytes("latin1").length);
    }
}
