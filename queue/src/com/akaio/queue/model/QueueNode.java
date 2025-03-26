package com.akaio.queue.model;

public class QueueNode<T> implements QueueNodeInterface<T> {
    private T node;
    private QueueNode<T> next;

    public QueueNode() {
    }

    public QueueNode(T node) {
        this.node = node;
        this.next = null;
    }

    public T getNode() {
        return this.node;
    }

    @Override
    public void setNext(QueueNode<T> next) {
        this.next = next;
    }

    @Override
    public QueueNode<T> getNext() {
        return next;
    }


}