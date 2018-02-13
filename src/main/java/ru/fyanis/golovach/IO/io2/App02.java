package ru.fyanis.golovach.IO.io2;


import java.io.*;

public class App02 {
    public static void main(String[] args) throws IOException {
        try(InputStream in = new FileInputStream("/home/yanis/Документы/java/file_src.txt");
            OutputStream out = new FileOutputStream("/home/yanis/Документы/java/file_dst.txt")) {

            copy(in, out);
        }
    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        int elem;
        while ((elem = in.read()) != -1) {
            out.write(elem);
        }
    }
}
