package ru.fyanis.fjava.chapter9.process;

public abstract class StringProcessor implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static String s =
            "Disagriment with beliefs is by definition incorrect";

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
    }
}
