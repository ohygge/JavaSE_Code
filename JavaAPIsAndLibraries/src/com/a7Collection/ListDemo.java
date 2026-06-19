package com.a7Collection;

import com.a4ArrayList.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @className: ListDemo01
 * @description: List集合的特点：有序和可重复
 * @author: hotel
 * @date: 2026/3/16 11:37
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");
        System.out.println("list:" + list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println("Iterator s:" + s);
        }
        // list集合的特有方法add,get,remove,set
        list.add(1, "javaee"); // 在指定位置插入元素
        System.out.println("list add 1:" + list);
        System.out.println("list get 1:" + list.get(1)); // 获取指定位置的元素
        System.out.println("list remove 1:" + list.remove(1)); // 删除指定位置的元素
        System.out.println("list set 1:" + list.set(1, "yy")); // 修改指定位置的元素
        System.out.println("list:" + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list get " + i + ":" + list.get(i));
        }
        System.out.println("---");
        List<Student> stuList = new ArrayList<>();
        Student s1 = new Student("zs", 18);
        Student s2 = new Student("ls", 19);
        stuList.add(s1);
        stuList.add(s2);
        Iterator<Student> stuIt = stuList.iterator();
        while (stuIt.hasNext()) {
            Student s = stuIt.next();
            System.out.println("iterator student:" + s.getName());
        }
        System.out.println("---");
        for (int i = 0; i < stuList.size(); i++) {
            Student s = stuList.get(i);
            System.out.println("for student:" + s.getName());
        }
        System.out.println("---");
        // 为解决并发修改异常ConcurrentModificationException，可使用ListIterator列表迭代器
        ListIterator<String> strListItr = list.listIterator();
        // 正向遍历
        while (strListItr.hasNext()) {
            String ns = strListItr.next();
            System.out.println("listIterator hasNext:" + ns);
        }
        System.out.println("---");
        // 反向遍历
        while (strListItr.hasPrevious()) {
            String ps = strListItr.previous();
            System.out.println("listIterator hasPrevious:" + ps);
        }
        // 使用ListIterator列表迭代器add添加元素
        while (strListItr.hasNext()) {
            String ns = strListItr.next();
            if (ns.equals("java")) {
                strListItr.add("python");
            }
        }
        System.out.println("ListIterator add python:" + list);
    }
}
