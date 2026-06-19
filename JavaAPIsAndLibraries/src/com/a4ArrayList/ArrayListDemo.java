package com.a4ArrayList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @className: ArrayListDemo
 * @description: ArrayList构造和添加等常用方法和日期转换
 * @author: hotel
 * @date: 2025/12/22 16:59
 */
public class ArrayListDemo {
    public static void main(String[] args) throws ParseException {
        /**
         * 集合类的特点：提供一种存储空间可变的存储模型，存储的数据容量可变
         * ArrayList<E>: 可调整大小的数组实现，E是泛型，使用引用类型替换即可
         * ArrayList<String>, ArrayList<Student>
         */
        boolean[] a = {true,false};
        System.out.println(Arrays.toString(a));
        for (boolean b : a) {
            System.out.println(b ? "真" : "假");
        }
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("javaee");
        array.add("world");

        array.add(1,"beijing"); // 指定位置添加
        //System.out.println(array.remove("world")); // 删除指定元素
        //System.out.println(array.remove(1)); // 删除指定位置元素
        System.out.println(array.set(1,"shanghai")); // 修改指定位置元素,返回beijing
        System.out.println("array.get(3):" + array.get(3)); // 获取指定位置元素
        System.out.println(array.indexOf("shanghai")); // 获取指定元素位置下标
        System.out.println("size:" + array.size());
        System.out.println("array:" + array);
        for (int i = 0; i < array.size(); i++) { // 遍历字符串集合
            String str = array.get(i);
            System.out.println("str[" + i + "]:" + str);
        }

        ArrayList<Student> stList = new ArrayList<>();
        stList.add(new Student("张三", 18));
        stList.add(new Student("李四", 19));
        for (int i = 0; i < stList.size(); i++) {
            Student s = stList.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        ArrayList<Student> studentsList = new ArrayList<>();
        /*addStudent(studentsList);
        addStudent(studentsList);
        for (int i = 0; i < studentsList.size(); i++) {
            Student s = studentsList.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }*/
        // System类的常用方法
        long start= System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms"); // 38ms
        /*日期转换工具类*/
        // SimpleDateFormat类的常用方法
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatDate = sdf.format(new Date());
        System.out.println("formatDate: " + formatDate); // 2022-01-07 23:11:11
        String dateStr = "2022-01-07 23:11:11";
        Date parseDate = sdf.parse(dateStr);
        System.out.println("parseDate: " + parseDate); // Fri Jan 07 23:11:11 CST 2022
        // 日历Calendar类的常用方法
        Calendar insCal = Calendar.getInstance();
        int year = insCal.get(Calendar.YEAR);
        int month = insCal.get(Calendar.MONTH) + 1;
        int day = insCal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Calendar类获取时间：" + year + "-" + month + "-" + day); // 2026-3-10
        // Calendar类的add方法:将指定的时间量添加或减去给定的日历字段
        insCal.add(Calendar.YEAR, 1);
        year = insCal.get(Calendar.YEAR);
        System.out.println("Calendar类add方法设置年份：" + year); // 2027
        insCal.add(Calendar.MONTH, 2);
        month = insCal.get(Calendar.MONTH) + 1;
        System.out.println("Calendar类add方法设置月份：" + month); // 5
        // Calendar类的set方法:将给定的日历字段设置为给定值
        insCal.set(2088,8,8);
        year = insCal.get(Calendar.YEAR);
        month = insCal.get(Calendar.MONTH) + 1;
        day = insCal.get(Calendar.DATE);
        System.out.println("Calendar类set方法设置时间：" + year + "-" + month + "-" + day); // 2088-9-8
        // 获取任意年份里2月份的天数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int y = sc.nextInt();
        Calendar insCa = Calendar.getInstance();
        insCa.set(y,2,1);
        insCa.add(Calendar.DATE,-1);
        System.out.println(y + "年2月份有" + insCa.get(Calendar.DATE) + "天"); // 2026年2月份有28天

    }

    /**
     * 添加学生集合
     * @param stList
     */
    public static void addStudent(ArrayList<Student> stList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄：");
        int age = scanner.nextInt();
        Student st = new Student();
        st.setName(name);
        st.setAge(age);
        stList.add(st);
    }

}
