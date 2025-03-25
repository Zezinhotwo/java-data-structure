package com.akaio.queue.model;

public interface QueueNodeInterface<T> {
    void setNext(QueueNode<T> next);

    QueueNode<T> getNext();
}
