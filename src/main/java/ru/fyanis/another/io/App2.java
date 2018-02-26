package ru.fyanis.another.io;

import java.io.*;
import java.util.Arrays;

public class App2 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("/home/yanis/Документы/IDEA Project/MyExperience/src/main/java/ru/fyanis/another/io/text.txt");
        OutputStream out = new FileOutputStream("/home/yanis/Документы/IDEA Project/MyExperience/src/main/java/ru/fyanis/another/io/text_write.txt");
        System.out.println(in.transferTo(out));
        in.close();
        out.close();
    }
}
