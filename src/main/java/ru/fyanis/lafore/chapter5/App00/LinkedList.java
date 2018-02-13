package ru.fyanis.lafore.chapter5.App00;

public class LinkedList {
    private Link first;

    public LinkedList() {
        this.first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(int key) {
        Link newLink = new Link(key);
        Link priority = null;
        Link curent = first;

        while (curent!=null && key > curent.getdData()) {
            priority = curent;
            curent = curent.getNext();
        }

        if (priority == null) {
            first = newLink;
        } else {
            priority.setNext(newLink);
        }

        newLink.setNext(curent);
    }

    public Link remove() {
        Link tmp = first;
        first = first.getNext();
        return tmp;
    }

    public void display() {
        Link link = first;
        while (link.getNext() != null) {
            System.out.println(link);
            link = link.getNext();
        }
    }
}
