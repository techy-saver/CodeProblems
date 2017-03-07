package com.varaprasadps.dsa.domain;

/**
 * @author by Vara Prasad.
 */
public class Node<T> {

    private Node<T> next;
    private T data;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> next() {
        return next;
    }

    void next(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
