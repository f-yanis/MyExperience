package ru.fyanis.another.io;

import java.io.*;
import java.util.Arrays;

public class App4_2 {
    public static void main(String[] args) throws IOException {
        byte[] array0 = {1, 2, 3, 4, 52, 2, 1, 4};

        byte[] buffer = new byte[array0.length];

        byte[] array0Coppy = new byte[buffer.length];


        InputStream in = new ByteArrayInputStream(array0);
        OutputStream out = new ByteArrayOutputStream();

        buffer = in.readAllBytes();

        out.write(buffer, 1, 2);

        out.close();
        in.close();


        System.out.println(Arrays.toString(array0Coppy));
        System.out.println(Arrays.toString(buffer));
    }
}
