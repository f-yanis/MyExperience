package ru.fyanis.lafore.chapter5.App01;

public class Link {
    private long data;
    private Link next;
    private Link prev;

    public Link(long data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public long getData() {
        return data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getPrev() {
        return prev;
    }

    public void setPrev(Link prev) {
        this.prev = prev;
    }

    public void display() {
        System.out.print(data + " ");
    }
}
