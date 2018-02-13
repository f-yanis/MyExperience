package ru.fyanis.another.io;

import java.io.*;
import java.util.Arrays;

public class App0 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[20];
        int i;
        InputStream in = new FileInputStream("/home/yanis/Документы/IDEA Project/Practic/src/main/java/ru/fyanis/another/io/text.txt");
        System.out.println(in.read(bytes,5,3));
        System.out.println(Arrays.toString(bytes));
    }
}
