package com.a9Args;

import java.util.Arrays;
import java.util.List;

/**
 * @className: ArgsDemo
 * @description: 可变参数求和类
 * @author: hotel
 * @date: 2026/4/10 16:03
 */
public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5));
        // 可变参数的使用 List.of方法是Java9引入
        // <T> List<T> asList(T... a) 返回有指定数组支持的固定大小的列表 返回集合不能增删，可修改
        // <E> List<E> of(E... elements) 返回包含任意数量元素的不可变列表 返回集合不能增删改
        // <E> Set<E> of(E... e) 返回一个包含任意数量元素的不可变集合 元素不能重复，不能增删且无修改 set无索引
        List<Integer> list = Arrays.asList(1, 2, 4);
//        list.add(9); // java.lang.UnsupportedOperationException
//        list.remove(2); // java.lang.UnsupportedOperationException
        list.set(0,9);
        System.out.println("asList方法返回的数组只可修改操作:" + list);

    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}

/**
 * 多参数情况下，要将可变参数置于末尾(int b, int... a)
 */