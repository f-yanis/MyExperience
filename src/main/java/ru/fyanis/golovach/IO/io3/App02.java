package ru.fyanis.golovach.IO.io3;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;

public class App02 {
    public static void main(String[] args) throws IOException {
        char[] c = {'a', 'r', 'b', 'u', 'z'};
        f(new CharArrayReader(c));
    }

    private static void f(Reader reader) throws IOException {
        int i;
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
