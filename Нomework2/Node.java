package Lesson9Нomework.Нomework2;

public class Node<E> {
    E item;
    Node<E> next;


    Node( E item) {
        this.item = item;
        this.next = null;

    }

    public E getItem() {
        return item;
    }
}
