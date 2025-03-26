package com.akaio.queue.service;

public interface QueueServiceInterface<T> {
    void enqueue(T value);

    void dequeue();

    T peek();

    void pop();

    boolean contains(T value);

    int find(T value);

    boolean isEmpty();
}
