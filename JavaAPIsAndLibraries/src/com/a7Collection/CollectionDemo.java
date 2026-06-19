package com.a7Collection;

import com.a4ArrayList.Student;

import java.util.*;

/**
 * @className: CollectionDemo
 * @description: 创建collection集合对象和常用方法和迭代器的使用
 * @author: hotel
 * @date: 2026/3/14 12:33
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);
        // add, remove, contains, size, isEmpty, clear方法
        c.add("number-one");
        System.out.println(c);
        c.remove("java"); // 删除指定元素返回true，否则返回false
        System.out.println(c);
        System.out.println("c.contains(\"hello\"):" + c.contains("hello"));
        System.out.println("c.size():" + c.size());
        System.out.println("c.isEmpty():" + c.isEmpty());
//        c.clear();
//        System.out.println("when clear c.isEmpty():" + c.isEmpty());
        // 迭代器遍历,collection集合通过iterator()方法获取迭代器对象,用来遍历集合
        Iterator<String> it = c.iterator();
        System.out.println("it.next():" + it.next());
        while (it.hasNext()) {
            String s = it.next();
            System.out.println("next():" + s);
        }
        // for-each遍历
        for (String s : c) {
            System.out.println("for-each:" + s);
        }
        // Lambda表达式遍历
        c.forEach(s -> System.out.println("Lambda:" + s));
        // 遍历学生类集合
        ArrayList<Student> stList = new ArrayList<>();
        Student s1 = new Student("zs", 28);
        Student s2 = new Student("ls", 19);
        Student s3 = new Student("ww", 25);
        Student s4 = new Student("ws", 19);
        stList.add(s1);
        stList.add(s2);
        stList.add(s3);
        stList.add(s4);
        Iterator<Student> itSt = stList.iterator();
        while (itSt.hasNext()) {
            Student s = itSt.next();
            System.out.println("studentList next():" + s.getName() + "," + s.getAge());
        }
        // 使用Collections的Sort方法对学生集合进行排序属于list的手动排序与treeSet集合的自动排序不同
        Collections.sort(stList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num1 = s1.getAge() - s2.getAge();
                int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
                return num2;
            }
        });
        for (Student s : stList) {
            System.out.println("studentList sort:" + s.getName() + "," + s.getAge());
        }
        System.out.println("---Collections类的常用方法");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(30);
        al.add(20);
        al.add(50);
        al.add(10);
        al.add(40);
        System.out.println("原始al:" + al);
        Collections.sort(al); // 默认升序
        Collections.reverse(al); // 反转
        Collections.shuffle(al); // 随机排序
        System.out.println("调整al:" + al);



    }

    /*
        public Iterator<E> iterator() {
            return new Itr();
        }
        privator class Itr implements Iterator<E> {
            ...
        }
    */
}
