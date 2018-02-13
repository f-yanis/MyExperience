package ru.fyanis.fjava.chapter12.test1;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Test2 {
    public static void main(String[] args) {
        try {
            throw new LogExeptions();
        } catch (LogExeptions e) {
            System.err.println("Перехвачено " + e);
        }

        try {
            throw new LogExeptions();
        } catch (LogExeptions e) {
            System.err.println("Перехвачено " + e);
        }
    }
}


class LogExeptions extends Exception {
    private Logger logger = Logger.getLogger("LogExeption");

    public LogExeptions() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}