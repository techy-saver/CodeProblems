package com.varaprasadps.dsa.domain;

/**
 * @author by Vara Prasad.
 */
public class LinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    public void add(Node<T> item) {
        if (item == null) {
            throw new IllegalArgumentException("node cannot be null");
        }
        if (head == null && tail == null) {
            head = item;
            tail = item;
        } else {
            tail.next(item);
            tail = item;
        }
    }

    public Node<T> head() {
        return head;
    }

    public Node<T> tail() {
        return tail;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }
}
