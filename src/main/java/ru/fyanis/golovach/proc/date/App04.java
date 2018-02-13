package ru.fyanis.golovach.proc.date;

public class App04 {
    public static void main(String[] args) {
        Node tail = create(1, 2, 3, 4, 5);
        System.out.println(toString(tail));
        System.out.println(toStringRecurs(tail));
    }

    /**
     * рекурсия
     * @param tail
     * @return
     */
    private static String toStringRecurs(Node tail) {
        if (tail == null) {
            return "*";
        } else {
            return tail.value + "->" + toString(tail.next);
        }
    }

    /**
     * итерация
     * @param tail
     * @return
     */
    private static String toString(Node tail) {
        String result = "";
        while (tail != null) {
            result += tail.value + "->";
            tail = tail.next;
        }
        return result + "*";
    }

    /**
     * создание односвязного списка
     * @param value
     * @return
     */
    private static Node create(int... value) {
        Node tail = null;
        for (int i = 0; i < value.length; i++) {
            tail = new Node(value[i], tail);
        }
        return tail;
    }
}
