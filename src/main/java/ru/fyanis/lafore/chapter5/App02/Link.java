package ru.fyanis.lafore.chapter5.App02;

public class Link {
    private long dData;
    private Link next;

    public Link(long dd) {
        dData = dd;
    }

    public long getdData() {
        return dData;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
