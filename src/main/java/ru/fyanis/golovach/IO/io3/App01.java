package ru.fyanis.golovach.IO.io3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

public class App01 {
    public static void main(String[] args) throws IOException {
        char[] c = {'a', 'r', 'b', 'u', 'z'};
        StringWriter sw = new StringWriter();
        sw.write(c);
        String str = sw.toString();
        System.out.println(str);
    }
}
