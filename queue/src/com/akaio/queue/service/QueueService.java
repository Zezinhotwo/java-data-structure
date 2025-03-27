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
        if (this.head == null) {
            System.out.println("A fila esta vazia");
            return;
        }
        this.head = this.head.getNext();
        if (this.head == null) {
            this.tail = null;
        }
    }

    @Override
    public T peek() {
        return this.head.getNode();
    }

    @Override
    public void pop() {
        if (this.head == null) {
            this.head = null;
            this.tail = null;
            System.out.println("lista vazia");
        }

        QueueNode<T> current = this.head;
        while (current.getNext() != this.tail) {
            current = current.getNext();
        }
        this.tail = null;
        this.tail = current;
    }

    @Override
    public boolean contains(T value) {
        QueueNode<T> current = this.head;

        while (current != null) {
            if (current.getNode().equals(value)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public int find(T value) {
        int count = 0;
        QueueNode<T> current = this.head;

        while (current != null) {
            if (current.getNode().equals(value)) {
                return count;
            }
            current = current.getNext();
            count++;
        }
        return -1;
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

