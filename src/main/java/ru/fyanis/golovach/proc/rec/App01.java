package ru.fyanis.golovach.proc.rec;

import java.util.Stack;

public class App01 {
    public static void main(String[] args) {
        Stack<Integer> from = new Stack<Integer>();
        Stack<Integer> help = new Stack<Integer>();
        Stack<Integer> to = new Stack<Integer>();

        from.push(3);
        from.push(2);
        from.push(1);
        System.out.println("from  " + from.size());
        System.out.println("to    " + to.size());
        System.out.println("help  " + help.size());
        exchange(from, help, to, from.size());
        System.out.println();
        System.out.println("from  " + from.size());
        System.out.println("to    " + to.size());
        System.out.println("help  " + help.size());
    }

    private static void exchange(Stack<Integer> from,
                                 Stack<Integer> help,
                                 Stack<Integer> to,
                                 int count) {
        if (count > 0) {
            exchange(from, to, help, --count);
            int biggest = from.pop();
            to.push(biggest);
            exchange(help, from, to, --count);
        }
    }
}
