package ru.fyanis.lafore.chapter5.App01;

public class LinkedList {
    private Link first;
    private Link last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public Link getFirst() {
        return first;
    }
    public void setFirst(Link first) {
        this.first = first;
    }
    public Link getLast() {
        return last;
    }
    public void setLast(Link last) {
        this.last = last;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long key) {
        Link newLink = new Link(key);

        if (isEmpty()) {
            first = newLink;
            last = newLink;
        }

        first.setPrev(newLink);
        newLink.setNext(first);
        first = newLink;
    }

    public void insertLast(long key) {
        Link newLink = new Link(key);

        if (isEmpty()) {
            first = newLink;
            last = newLink;
        }

        last.setNext(newLink);
        newLink.setPrev(last);
        last = newLink;
    }

    public Link removeFirst() {
        Link result = first;
        first = first.getNext();
        return result;
    }

    public Link removeLast() {
        Link result = last;
        last = last.getPrev();
        return result;
    }

    public void display() {
        Link link = first;
        while (link.getNext() != null) {
            System.out.println(link);
            link = link.getNext();
        }
    }
}
