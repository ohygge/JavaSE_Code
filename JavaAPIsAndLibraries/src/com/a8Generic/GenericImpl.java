package com.a8Generic;

/**
 * @className: GenericImpl
 * @description: 泛型接口的实现
 * @author: hotel
 * @date: 2026/4/9 10:25
 */
public class GenericImpl<T> implements GenericI<T> {
    @Override
    public void show(T t) {
        System.out.println("GenericImpl show:" + t);
    }
}
