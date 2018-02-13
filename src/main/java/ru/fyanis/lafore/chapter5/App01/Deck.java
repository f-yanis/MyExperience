package ru.fyanis.lafore.chapter5.App01;

public class Deck {
    private LinkedList linkedList;

    public Deck() {
        this.linkedList = new LinkedList();
    }

    public void insertFirst(long key) {
        linkedList.insertFirst(key);
    }

    public void insertLast(long key) {
        linkedList.insertLast(key);
    }

    public Link removeFirst() {
        return linkedList.removeFirst();
    }

    public Link removeLast() {
        return linkedList.removeLast();
    }

    public boolean isEmpty() {
        return isEmpty();
    }
}
