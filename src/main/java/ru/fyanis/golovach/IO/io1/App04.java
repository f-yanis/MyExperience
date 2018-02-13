package ru.fyanis.golovach.IO.io1;

public class App04 {
    public static void main(String[] args) {
        char c0 = 0;
        char c1 = (char) (c0 + 1);
        c0++;

        for (char i = 'А'; i < 'я'; i++) {
            System.out.print(i);
        }
    }
}
