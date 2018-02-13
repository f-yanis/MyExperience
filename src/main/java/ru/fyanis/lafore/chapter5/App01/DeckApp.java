package ru.fyanis.lafore.chapter5.App01;

public class DeckApp {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.insertFirst(1);
        deck.insertFirst(2);
        deck.insertFirst(3);

        deck.insertLast(11);
        deck.insertLast(22);
        deck.insertLast(33);

        System.out.println(deck.removeLast().getData());
        System.out.println(deck.removeLast().getData());
        System.out.println(deck.removeLast().getData());
        System.out.println(deck.removeLast().getData());
        System.out.println(deck.removeLast().getData());
        System.out.println(deck.removeLast().getData());
    }
}
