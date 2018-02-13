package ru.fyanis.fjava.chapter9.process;


public class Downcase extends StringProcessor {

    @Override
    public String process(Object input) {
         return ((String)input).toLowerCase();
    }
}
