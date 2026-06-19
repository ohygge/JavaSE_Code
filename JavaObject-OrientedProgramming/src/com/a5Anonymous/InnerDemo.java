package com.a5Anonymous;

/**
 * @className: InnerDemo
 * @description: 类的功能描述
 * @author: hotel
 * @date: 2026/1/7 22:39
 */
public class InnerDemo {
    public static void main(String[] args) {
        // 创建内部类并调用方法
//        Outer.Inner inner = new Outer().new Inner();
//        inner.show();
        Outer outer = new Outer();
        outer.method1(); // 成员内部类的使用
        outer.method2(); // 局部内部类的使用
        outer.method3(); // 匿名内部类的调用
    }
}
