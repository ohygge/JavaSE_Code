package com.a7Collection;

import java.util.LinkedList;

/**
 * @className: LinkedListDemo0
 * @description: LinkedList集合的特有功能
 * @author: hotel
 * @date: 2026/3/28 09:44
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        System.out.println(linkedList);
        System.out.println("---");
//        linkedList.addFirst("javaee");
//        linkedList.addLast("javaee");
        System.out.println("liinkedList.getFirst():" + linkedList.getFirst());
        System.out.println("linkedList.removeFirst():" + linkedList.removeFirst());
        System.out.println(linkedList);
    }
}
