package ru.fyanis.golovach.IO.io3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class App00 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        for (int i = 0; i < 10; i++) {
            buf.write(new byte[]{0, 1, 2});
        }
        byte[] bytes = buf.toByteArray();
        System.out.println(Arrays.toString(bytes));
    }
}
