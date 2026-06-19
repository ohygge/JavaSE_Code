package com.a8Generic;

/**
 * @className: GenericDemo
 * @description: 泛型接口
 * @author: hotel
 * @date: 2026/4/9 09:43
 */
public interface GenericI<T> {
    public void show(T t);
}

// 泛型接口 实现方法参考API 的List接口文档说明
// 泛型接口格式 public interface GenericI<T>{}
