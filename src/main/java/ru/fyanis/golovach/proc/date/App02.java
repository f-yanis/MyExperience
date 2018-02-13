package ru.fyanis.golovach.proc.date;

public class App02 {
    public static void main(String[] args) {
        Node tail = new Node(4, new Node(3,
                                      new Node(2,
                                      new Node(1,
                                      new Node(0, null)))));

        Node r = tail;
        while (r != null) {
            System.out.println(r.value);
            r = r.next;
        }
    }
}
