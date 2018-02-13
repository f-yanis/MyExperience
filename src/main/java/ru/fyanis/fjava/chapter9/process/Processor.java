package ru.fyanis.fjava.chapter9.process;


public interface Processor {

    public String name();

    Object process(Object input);
}
