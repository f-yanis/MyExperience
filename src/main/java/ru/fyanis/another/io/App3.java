package ru.fyanis.another.io;

import javax.sound.sampled.AudioInputStream;
import java.io.*;

public class App3 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("/home/yanis/Рабочий стол/skato_ft_psih__4e_-_oni_prod_by_psih_(zf.fm).mp3");
        OutputStream out = new FileOutputStream("/home/yanis/Рабочий стол/new_track.mp3");

        int b;

        while ((b = in.read()) != -1) {
            out.write(b);
        }

        in.close();
        out.close();

    }
}
