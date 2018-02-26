package ru.fyanis.another.io;

import java.io.*;

public class App2_1 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("/home/yanis/Рабочий стол/Карта 8-й редакции переведенная.jpg");
        OutputStream out = new FileOutputStream("/home/yanis/Рабочий стол/Карта 8-й редакции переведенная_coppy.jpg");
        System.out.println(in.transferTo(out));
        in.close();
        out.close();
    }
}
