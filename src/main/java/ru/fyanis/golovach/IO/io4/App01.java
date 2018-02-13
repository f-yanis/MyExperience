package ru.fyanis.golovach.IO.io4;


public class App01 {
    public static void main(String[] args) {
        int position = 0;
        int[] arr = {0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length - 1; i++) {

            if (position == 0) {
                position = 0;
            } else if (position == 1) {
                position = 1;
                System.out.print(1);
            }
        }
    }
}
