package ru.fyanis.lafore.chapter5.App00;

public class PriorityQueueApp {
    public static void main(String[] args) {
        PriorityQueue pQueue = new PriorityQueue();

        pQueue.pushBack(1);
        pQueue.pushBack(2);
        pQueue.pushBack(3);

        System.out.println(pQueue.popBack().getdData());
        System.out.println(pQueue.popBack().getdData());
        System.out.println(pQueue.popBack().getdData());

        pQueue.pushBack(4);
        pQueue.pushBack(6);
        pQueue.pushBack(2);
        pQueue.pushBack(23);

        System.out.println(pQueue.popBack().getdData());
        System.out.println(pQueue.popBack().getdData());
        System.out.println(pQueue.popBack().getdData());
        System.out.println(pQueue.popBack().getdData());
    }
}
