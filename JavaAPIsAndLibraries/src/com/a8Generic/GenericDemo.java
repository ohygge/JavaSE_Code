package com.a8Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @className: GenericDemo
 * @description: 泛型的本质是参数化类型必须是引用数据类型
 * @author: hotel
 * @date: 2026/4/9 09:43
 */
public class GenericDemo {
    public static void main(String[] args) {
        // 泛型demo
        Collection<String> cstr = new ArrayList<>();
        cstr.add("hello");
        cstr.add("world");
        for (String s : cstr) {
            System.out.println(s);
        }
        Iterator<String> it = cstr.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("---教师学生类各自模版处理");
        Teacher t = new Teacher();
        t.setAge(31);
        System.out.println("teacher age:" + t.getAge());
        Student s = new Student();
        s.setName("张三");
        System.out.println("student name:" + s.getName());
        System.out.println("---泛型类处理");
        GenericC<String> stringG = new GenericC<>();
        stringG.setT("hello");
        System.out.println("GenericC stringG t:" + stringG.getT());
        GenericC<Integer> integerG = new GenericC<>();
        integerG.setT(100);
        System.out.println("GenericC integerG t:" + integerG.getT());
        System.out.println("---泛型方法处理");
        GenericM gm = new GenericM();
        gm.show("GenericM show:" + "hello");
        gm.show("GenericM show:" + 100);
        gm.show("GenericM show:" + true);
        System.out.println("---泛型接口处理");
        GenericI<String> gis = new GenericImpl<>();
        gis.show("GenericI hello");
        System.out.println("---------类型通配符<?>的上下限");
        // Object Number Integer
        List<?> list1 = new ArrayList<Object>();
        List<? extends Number> list2 = new ArrayList<Integer>();
        List<? super Number> list3 = new ArrayList<Object>();
    }
}

/**
 * 泛型类
 * public class GenericC <T> {
 *     private T t;
 *     public void setT(T t) {
 *         this.t = t;
 *     }
 *     public T getT() {
 *         return t;
 *     }
 * }
 * 泛型方法
 * public class GenericM {
 *     public <T> void show(T t) {
 *         System.out.println(t);
 *     }
 * }
 * 泛型接口
 * public interface GenericI<T> {
 *     public void show(T t);
 * }
 * public class GenericImpl<T> implements GenericI<T> {
 *     @Override
 *     public void show(T t) {
 *         System.out.println("GenericImpl show:" + t);
 *     }
 * }
 */