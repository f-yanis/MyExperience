package ru.fyanis.another.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class App1 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[20];
        InputStream in = new FileInputStream("/home/yanis/Документы/IDEA Project/MyExperience/src/main/java/ru/fyanis/another/io/text.txt");
        bytes = in.readAllBytes();
        System.out.println(Arrays.toString(bytes));
        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char) bytes[i]);
        }
    }
}
