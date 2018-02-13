package ru.fyanis.lafore.chapter5.App03;

public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("верхний элемент: "+stack.top());

        System.out.println();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
