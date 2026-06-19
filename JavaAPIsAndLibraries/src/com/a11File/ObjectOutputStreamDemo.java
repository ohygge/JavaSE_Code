package com.a11File;

import java.io.*;

/**
 * @className: ObjectOutputStreamDemo
 * @description: 对象序列化流类用一个字节序列表示一个对象
 * @author: hotel
 * @date: 2026/5/29 10:14
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaAPIsAndLibraries/fos2.txt"));
        Student s1 = new Student("s001", "张三", 20, "xa");
        oos.writeObject(s1);
        oos.close();
        // 对象序列化后进行反序列化输出到控制台
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("JavaAPIsAndLibraries/fos2.txt"));
        Object obj = ois.readObject();
        Student s2 = (Student) obj;
        System.out.println(s2.getSid() + ", "+ s2.getName() + ", " + s2.getAge() + ", " + s2.getAddress());
        ois.close();
        /**
         * 为保证串行版本号一致，使用Serializable接口作为标记接口即可
         * public class Student implements Serializable {}
         * 如果不显示某个属性时，可给对象类的指定属性添加transient关键字，该属性将不会被序列化
         */
    }
}
