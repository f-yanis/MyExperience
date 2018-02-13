package ru.fyanis.golovach.proc.date;

public class App03 {
    public static void main(String[] args) {
        Node tail = list(10);
        showNode(tail);
    }

    private static void showNode(Node tail) {
        while (tail != null) {
            System.out.print("->" + tail.value);
            tail = tail.next;
        }
    }

    private static Node list(int lenght) {
        Node tail = null;
        for (int i = 0; i < lenght; i++) {
            tail = new Node(i, tail);
        }
        return tail;
    }
}
