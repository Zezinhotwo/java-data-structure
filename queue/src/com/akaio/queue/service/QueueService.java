package com.akaio.queue.service;


import com.akaio.queue.model.QueueNode;

public class QueueService<T> implements QueueServiceInterface<T> {
    private QueueNode<T> head;
    private QueueNode<T> tail;

    public QueueService() {
        this.head = null;
        this.tail = null;
    }

    public QueueService(T item) {
        QueueNode<T> newNode = new QueueNode<>(item);
        this.head = newNode;
        this.tail = newNode;
    }

    @Override
    public void enqueue(T value) {
        QueueNode<T> newNode = new QueueNode<>(value);
        if (this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public void dequeue() {
    }

    @Override
    public T peek() {
        return this.head.getNode();
    }

    @Override
    public void pop() {

    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public int find(T value) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String toString() {
        QueueNode<T> current = this.head;
        StringBuilder queue = new StringBuilder();
        while (current != null) {
            queue.append(current.getNode()).append(" -> ");
            current = current.getNext();

        }
        queue.append("null;");
        return queue.toString();
    }

}

