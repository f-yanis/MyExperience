package ru.fyanis.another.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class App4_1 {
    public static void main(String[] args) throws IOException {
        byte[] buf = {1, 2, 3, 4, 52, 2, 1, 4};
        byte[] bufCoppy = new byte[buf.length];
        InputStream in = new ByteArrayInputStream(buf);
        bufCoppy = in.readAllBytes();
        System.out.println(Arrays.toString(bufCoppy));
        in.close();
    }
}
