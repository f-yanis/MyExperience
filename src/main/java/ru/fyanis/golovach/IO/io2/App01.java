package ru.fyanis.golovach.IO.io2;

import java.io.*;
import java.net.URL;

public class App01 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://ru.wikipedia.org/wiki/POP3");
        try (InputStream inet = url.openStream();
             OutputStream out = new FileOutputStream("/home/yanis/Документы/google.html")){

            coppy(inet, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void coppy(InputStream src, OutputStream dst) throws IOException {
        while (true) {
            int elem = src.read();
            if (elem != -1) {
                dst.write(elem);
            } else {
                break;
            }
        }
    }
}
