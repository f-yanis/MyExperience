package ru.fyanis.golovach.IO.io3;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class App03 {
    public static void main(String[] args) throws IOException {
        int lenght = 1000;
        DataOutputStream dob = new DataOutputStream(
                                     new GZIPOutputStream(
                                             new LogOutputStream(
                                                    new BufferedOutputStream(
                                                            new FileOutputStream(
                                                                    new File("/home/yanis/Документы/java/file_dst.txt"))))));

        for (int i = 0; i < lenght; i++) {
            dob.writeDouble(123.212);
        }

        dob.flush();
        dob.close();

        DataInputStream dis = new DataInputStream(
                                  new GZIPInputStream(
                                      new BufferedInputStream(
                                            new FileInputStream(
                                                new File("/home/yanis/Документы/java/file_dst.txt")))));
        for (int i = 0; i < lenght; i++) {
            System.out.println(dis.readDouble());
        }
    }
}

class LogOutputStream extends OutputStream {
    OutputStream out;

    public LogOutputStream(OutputStream out) {
        this.out = out;
    }

    @Override
    public void write(int i) throws IOException {
        System.out.println("log: 1");
        out.write(i);
    }

    @Override
    public void write(byte[] bytes) throws IOException {
        System.out.println("log: " + bytes.length);
        out.write(bytes);
    }

    @Override
    public void write(byte[] bytes, int i, int i1) throws IOException {
        System.out.println("log: " + bytes.length);
        out.write(bytes, i, i1);
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }
}

