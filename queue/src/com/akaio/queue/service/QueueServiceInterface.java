package com.akaio.queue.service;

public interface QueueServiceInterface {
    void enqueue(int value);

    int dequeue();

    int peek();

    boolean isEmpty();
}
