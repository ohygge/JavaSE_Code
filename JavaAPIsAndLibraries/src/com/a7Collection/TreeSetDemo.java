package com.a7Collection;

import com.a4ArrayList.Student;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @className: TreeSetDemo01
 * @description: TreeSet集合类元素有序只是自然排序或指定排序无重复元素
 * @author: hotel
 * @date: 2026/4/2 09:44
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSetDemo treeSetDemo01 = new TreeSetDemo();
//        treeSetDemo01.testTreeSet();
//        treeSetDemo01.studentTreeSet();
        treeSetDemo01.studentTreeSetCompare();
    }

    public void testTreeSet() {
        TreeSet<Integer> treeSetInt = new TreeSet<>();
        treeSetInt.add(20);
        treeSetInt.add(10);
        treeSetInt.add(30);
        treeSetInt.add(3);
        treeSetInt.add(20);
        for (Integer i : treeSetInt) {
            System.out.println(i); // 按照自然排序且不重复3 10 20 30
        }
    }

    /**
     * 创建TreeSet集合使用无参构造方法实现学生年龄姓名排序
     */
    public void studentTreeSet() {
        TreeSet<Student> sts = new TreeSet<Student>();
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 30);
        Student s3 = new Student("wangwu", 10);
        Student s4 = new Student("hao",20);
        Student s5 = new Student("hao", 20);
        // 按照年龄从小到大排序
        // 自然排序就是让元素所属的类学生类实现Comparable接口重写compareTo方法
        sts.add(s1);
        sts.add(s2);
        sts.add(s3);
        sts.add(s4);
        sts.add(s5); // 重复元素TreeSet不允许重复
        for (Student s : sts) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }

    /**
     * 创建TreeSet集合使用带参构造方法实现学生年龄姓名排序
     * TreeSet(Comparator<? super E> comparator)使用比较器排序对元素进行排序
     * 使用匿名内部类的方式重写compare方法
     * 比较器排序就是让集合构造方法接收Comparator接口的实现子类对象，重写compare方法
     */
    public void studentTreeSetCompare() {
        TreeSet<Student> sts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num1 = s1.getAge() - s2.getAge();
                int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
                return num2;
            }
        });
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 30);
        Student s3 = new Student("wangwu", 10);
        Student s4 = new Student("hao",20);
        Student s5 = new Student("hao", 20);
        // s1-s2按照年龄从小到大排序，字母A-Z
        sts.add(s1);
        sts.add(s2);
        sts.add(s3);
        sts.add(s4);
        sts.add(s5); // 重复元素TreeSet不允许重复
        for (Student s : sts) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }

}
