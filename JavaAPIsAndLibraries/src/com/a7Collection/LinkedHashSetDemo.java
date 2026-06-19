package com.a7Collection;

import java.util.LinkedHashSet;

/**
 * @className: LinkedHashSetDemo01
 * @description: LinkedHashSet集合类哈希表保证元素唯一链表保证元素有序
 * @author: hotel
 * @date: 2026/4/1 21:23
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSetStr = new LinkedHashSet<>();
        linkedHashSetStr.add("hello");
        linkedHashSetStr.add("world");
        linkedHashSetStr.add("java");
        linkedHashSetStr.add("hello");
        for (String str : linkedHashSetStr) {
            System.out.println(str);
        }
    }
}
