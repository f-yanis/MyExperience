package ru.fyanis.golovach.proc.date;

public class App00 {
    public static void main(String[] args) {
        Node tail;
        Node node1 = new Node(20, null);
        Node node2 = new Node(30, null);
        Node node3 = new Node(40, null);
        Node node4 = new Node(50, null);
        Node node5 = new Node(60, null);
        Node node6 = new Node(70, null);

        node6.next = node5;
        node5.next = node4;
        node4.next = node3;
        node3.next = node2;
        node2.next = node1;

        tail = node6;

        System.out.println(tail.value);
        System.out.println(tail.next.value);
        System.out.println(tail.next.next.value);
        System.out.println(tail.next.next.next.value);
        System.out.println(tail.next.next.next.next.value);
        System.out.println(tail.next.next.next.next.next.value);
    }
}
