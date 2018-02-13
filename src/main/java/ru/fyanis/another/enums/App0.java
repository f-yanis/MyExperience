package ru.fyanis.another.enums;

import java.util.Arrays;

public class App0 {
    public static void main(String[] args) {
        App1 season = App1.SPRING;
        if (season == App1.SPRING) {
            season = App1.SUMMER;
        }
        System.out.println(season);
        System.out.println(App1.class.getSuperclass());
        System.out.println(season.name() + " " + season.toString() + " " + season.ordinal());

        String name = "WINTER";
        App1 app1 = App1.valueOf(name);
        System.out.println(app1);

        System.out.println(Arrays.toString(App1.values()));
    }
}