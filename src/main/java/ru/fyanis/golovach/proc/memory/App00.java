package ru.fyanis.golovach.proc.memory;

public class App00 {
    public static void main(String[] args) {
        IntHolder holder = new IntHolder(0);
        f(holder);
        System.out.println(holder.value);
    }

    private static void f(IntHolder holder) {
        holder.value = 1;
    }
}
