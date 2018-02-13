package ru.fyanis.lafore.chapter5.App02;

import ru.fyanis.lafore.chapter5.App00.Link;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list.display();

        System.out.println(list.remove().getdData());
        System.out.println(list.remove().getdData());
        System.out.println(list.remove().getdData());
        System.out.println(list.remove().getdData());
        System.out.println(list.remove().getdData());
        System.out.println(list.remove().getdData());

        list.display();

        find(list.find(3));
        find(list.find(100));
    }

    private static void find(Link link) {
        if (link == null) {
            System.out.println("not found");
        } else {
            System.out.println("found: " + link.getdData());
        }
    }
}
