package ru.fyanis.another.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class App1 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[20];
        InputStream in = new FileInputStream("/home/yanis/Документы/IDEA Project/Practic/src/main/java/ru/fyanis/another/io/text.txt");
        System.out.println(in.read);
    }
}
