package ru.fyanis.golovach.proc.date;

public class App06 {
    public static void main(String[] args) {
        Node tail = create(1, 2, 3, 4, 5, 6);
        System.out.println(sum(tail));
        System.out.println(mul(tail));
        System.out.println(max(tail));
//        System.out.println(min(tail));
    }

    private static int max(Node tail) {
        return (tail == null) ? 0 : Math.max(tail.value, max(tail.next));
    }


    /**
     * умножение значений списка
     * @param tail
     * @return
     */
    private static int mul(Node tail) {
        return (tail == null) ? 1 : tail.value * mul(tail.next);
    }

    /**
     * сложение значений списка
     * @param tail
     * @return
     */
    private static int sum(Node tail) {
        return (tail == null) ? 0 : tail.value + sum(tail.next);
    }

    private static Node create(int... arr) {
        Node tail = null;
        for (int i = 0; i < arr.length; i++) {
            tail = new Node(arr[i], tail);
        }
        return tail;
    }
}
