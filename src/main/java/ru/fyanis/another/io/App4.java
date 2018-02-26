package ru.fyanis.another.io;

import java.io.*;

public class App4 {
    public static void main(String[] args) throws IOException {
        byte[] buf = {1, 2, 3, 4, 52, 2, 1, 4};
        InputStream in = new ByteArrayInputStream(buf);
        int i;
        while ((i = in.read()) != -1) {
            System.out.println(i);
        }
        in.close();
    }
}
