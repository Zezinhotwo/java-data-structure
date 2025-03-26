package com.akaio.queue.app;

import com.akaio.queue.model.QueueNode;
import com.akaio.queue.service.QueueService;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello, intelliJ");
//
//        QueueNode<Integer> item = new QueueNode<>(10);
//        QueueNode<Integer> item2 = new QueueNode<>(11);
//
//        item.setNext(item2);
//
//        item.getNode();
//        item.getNext().getNode();
//        System.out.println(item.toString());
//
////        Services
//        System.out.println();
        System.out.println("services ");
        QueueService<Integer> content = new QueueService<>(12);
        content.enqueue(14);
        System.out.println(content.toString());
        System.out.println(content.isEmpty());
        System.out.println(content.peek());
    }

}
