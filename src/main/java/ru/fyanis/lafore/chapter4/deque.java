package ru.fyanis.lafore.chapter4;

public class deque {
    private int maxSize;
    private long[] dequeArray;
    private int front;
    private int rear;
    private int nItems;

    public deque(int maxSize) {
        this.maxSize = maxSize;
        this.dequeArray = new long[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insertLeft(long j) {
        if (front == 0) {
            front = maxSize - 1;
        }
        dequeArray[--front] = j;
        nItems++;
    }

    public void insertRight(long j) {
        if (rear == maxSize-1) {
            rear = -1;
        }
        dequeArray[++rear] = j;
        nItems++;
    }

    public long removeLeft() {
        long temp = dequeArray[front++];
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public long removeRight() {
        long tmp = dequeArray[rear--];
        if (rear == -1)
            rear = maxSize - 1;
        nItems--;
        return tmp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

}
