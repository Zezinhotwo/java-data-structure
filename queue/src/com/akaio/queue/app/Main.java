package com.akaio.queue.app;

import com.akaio.queue.model.QueueNode;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello, intelliJ");

        QueueNode<Integer> item =  new QueueNode<>(10);
        QueueNode<Integer> item2 =  new QueueNode<>(11);

        item.setNext(item2);

        item.getNode();
        item.getNext().getNode();
        System.out.println(item.toString());

    }

}
