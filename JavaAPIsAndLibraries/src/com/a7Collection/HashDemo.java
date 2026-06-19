package com.a7Collection;

import com.a4ArrayList.Student;

import java.util.HashSet;

/**
 * @className: HashDemo01
 * @description: 哈希值类是JDK根据对象的地址或者字符串数字算出来的int类型的数值
 * @author: hotel
 * @date: 2026/3/31 11:45
 */
public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        System.out.println(s1.hashCode()); // 914424520
        System.out.println(s1.hashCode()); // 914424520
        System.out.println("---");
        Student s2 = new Student("李四", 19); // 110718392
        // 默认情况下从object类中的方法里，不同对象的哈希值是不相同的
        // 可通过student类中的方法重写，实现不同对象设置相同的哈希值
        System.out.println(s2.hashCode());
        System.out.println("---");
        System.out.println("java".hashCode()); // 3254818
        System.out.println("world".hashCode()); // 113318802
        System.out.println("student---");
        Student s3 = new Student("张三", 18);
        HashSet<Student> stuSet = new HashSet<>();
        stuSet.add(s1);
        stuSet.add(s2);
        stuSet.add(s3);
        for (Student s : stuSet) {
            System.out.println(s.getName() + "，" + s.getAge());
        }

    }
}
