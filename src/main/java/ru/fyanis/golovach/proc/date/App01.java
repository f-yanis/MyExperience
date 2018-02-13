package ru.fyanis.golovach.proc.date;

public class App01 {
    public static void main(String[] args) {
        Node tail;
        tail = new Node(0, null);
        tail = new Node(1, tail);
        tail = new Node(2, tail);
        tail = new Node(3, tail);
        tail = new Node(4, tail);
        tail = new Node(5, tail);
        tail = new Node(6, tail);

        System.out.println(tail.value);
        System.out.println(tail.next.value);
        System.out.println(tail.next.next.value);
        System.out.println(tail.next.next.next.value);
        System.out.println(tail.next.next.next.next.value);
        System.out.println(tail.next.next.next.next.next.value);
    }
}
