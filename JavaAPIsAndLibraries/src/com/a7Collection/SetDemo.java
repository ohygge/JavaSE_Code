package com.a7Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @className: SetDemo01
 * @description: Set接口集合类无索引不可普通for循环遍历HashSet,LinkedHashSet,TreeSet
 * @author: hotel
 * @date: 2026/3/31 11:40
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> setStr = new HashSet<>();
        setStr.add("hello");
        setStr.add("world");
        setStr.add("java");
        for (String s : setStr) {
            System.out.println(s);
        }
        System.out.println("---");
        // 1-20随机数长度小于10不重复
//        Set<Integer> setInt = new HashSet<>();
        Set<Integer> setInt = new TreeSet<>();
        Random r = new Random();
        while (setInt.size() < 10) {
            int num = r.nextInt(20) + 1;
            setInt.add(num);
        }
        for (Integer i : setInt) {
            System.out.println(i);
        }
    }
}
