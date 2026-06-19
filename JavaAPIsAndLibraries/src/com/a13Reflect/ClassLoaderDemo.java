package com.a13Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @className: ClassLoaderDemo
 * @description: 类加载器类中的两个方法getSystemClassLoader()和getParent()
 * @author: hotel
 * @date: 2026/6/4 10:30
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader c1 = ClassLoader.getSystemClassLoader();
        System.out.println(c1); // AppClassLoader
        ClassLoader c2 = c1.getParent();
        System.out.println(c2); // PlatformClassLoader
        /**
         * ExtClassLoader是 JDK8 及更早的扩展加载器，JDK9 引入 JPMS 模块化后彻底废弃，由PlatformClassLoader全盘替代
         */
        ClassLoader c3 = c2.getParent();
        System.out.println(c3); // null因为BootstrapClassLoader是用C++写的，不存在java.lang.ClassLoader子类实例,所以无法获取,通常表示为null




    }
}
