package ru.fyanis.golovach.IO.io2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class App00 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://lifehacker.ru/");

        try (InputStream inet = url.openStream();
             ByteArrayOutputStream buf = new ByteArrayOutputStream()){

            coppy(inet, buf);

            byte[] rawData = buf.toByteArray();
            String html = new String(rawData, "ascii");
            System.out.println(html);
        }
    }

    private static void coppy(InputStream src, ByteArrayOutputStream dst) throws IOException {
        int elem;
        while ((elem = src.read()) != -1) {
            dst.write(elem);
        }
    }
}
