package ru.fyanis.golovach.IO.io4;

public class App00 {
    public static void main(String[] args) {
        int i = 0b00000001_00000011_00000111_00001111;
        byte b0 = (byte) i;
        System.out.println(b0);
        System.out.println(Integer.toBinaryString(b0));
    }
}
