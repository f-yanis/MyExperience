package ru.fyanis.lafore.chapter4;

public class stackDeque {
    private int maxSize;
    private long[] dequeArray;
    private int rear;
    private int nItems;

    public stackDeque(int maxSize) {
        this.maxSize = maxSize;
        this.dequeArray = new long[maxSize];
        this.rear = -1;
        this.nItems = 0;
    }

    public void insertRight(long j) {
        if (rear == maxSize-1) {
            rear = -1;
        }
        dequeArray[++rear] = j;
        nItems++;
    }

    public long removeRight() {
        long tmp = dequeArray[rear--];
        if (rear == -1)
            rear = maxSize - 1;
        nItems--;
        return tmp;
    }

    public long peek() {
        return dequeArray[rear];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }
}

class stackDequeApp {
    public static void main(String[] args) {
        int size = 5;
        stackDeque deque = new stackDeque(size);

        for (int i = 0; i < size; i++) {
            deque.insertRight(i);
        }

        while (!deque.isEmpty()) {
            System.out.print(deque.removeRight() + " ");
        }
    }
}

