package com.a8Generic;

/**
 * @className: GenericC
 * @description: 泛型类即通用类
 * @author: hotel
 * @date: 2026/4/9 09:59
 */
public class GenericC <T> {
    private T t;
    public void setT(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
}
