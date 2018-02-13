package ru.fyanis.fjava.chapter9.process;


public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Используем Processor " + p.name());
        System.out.println(p.process(s));
    }
}
