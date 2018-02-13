package ru.fyanis.golovach.IO.io2;


import java.io.*;

public class App03 {
    public static void main(String[] args) throws IOException {
        try(InputStream in = new FileInputStream("/home/yanis/Документы/java/file_src.txt");
            OutputStream out = new FileOutputStream("/home/yanis/Документы/java/file_dst.txt")) {

            copy(in, out);
        }
    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buff = new byte[1024];
        int count;
        while ((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
    }
}
