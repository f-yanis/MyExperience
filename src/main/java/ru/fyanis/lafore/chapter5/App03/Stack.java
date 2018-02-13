package ru.fyanis.lafore.chapter5.App03;

public class Stack {
    LinkedList list;

    public Stack() {
        this.list = new LinkedList();
    }

    public void push(long key) {
        list.insert(key);
    }

    public long top() {
        return list.getCurent().getNext().getdData();
    }

    public long pop() {
        return list.remove().getdData();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
