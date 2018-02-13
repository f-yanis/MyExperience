package ru.fyanis.lafore.chapter5.App02;

import ru.fyanis.lafore.chapter5.App00.Link;

public class LinkedList {
    private Link curent;

    public LinkedList() {
        this.curent = null;
    }

    public Link getCurent() {
        return curent;
    }

    public boolean isEmpty() {
        return (curent == null);
    }

    public void insert(int key) {
        Link newLink = new Link(key);

        if (isEmpty()) {
            curent = newLink;
            newLink.setNext(newLink);
        } else {
            newLink.setNext(curent.getNext());
            curent.setNext(newLink);
        }
    }

    public Link remove() {
        Link tmp = curent.getNext();

        if (curent.getNext() == curent) {
            curent.setNext(null);
            curent = null;
        } else {
            curent.setNext(curent.getNext().getNext());
        }

        return tmp;
    }

    public Link find(long key) {
        if (isEmpty()) {
            System.out.println("FindError: link list is empty");
        } else {
            Link tmp = curent;

            while (key != curent.getdData()) {
                step();
                if (curent == tmp && key != curent.getdData()) {
                    return null;
                }
            }
        }
        return curent;
    }

    public void step() {
        curent = curent.getNext();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("DisplayError: link list is empty");
        } else {
            Link tmp = curent;
            System.out.print(curent.getdData() + " ");
            step();
            while (curent != tmp) {
                System.out.print(curent.getdData() + " ");
                step();
            }
            System.out.println();
        }
    }
}
