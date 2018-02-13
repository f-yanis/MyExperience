package ru.fyanis.lafore.chapter5.App00;

public class PriorityQueue {
    private Link front;
    private Link back;
    LinkedList linkedList;

    public PriorityQueue() {
        this.linkedList = new LinkedList();
        this.front = null;
        this.back = null;
    }

    public void pushBack(int key) {
        linkedList.insert(key);
    }

    public Link popBack() {
        return linkedList.remove();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
