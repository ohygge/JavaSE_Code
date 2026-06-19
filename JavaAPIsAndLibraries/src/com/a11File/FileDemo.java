package com.a11File;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @className: FileDemo
 * @description: IO流File类的使用
 * @author: hotel
 * @date: 2026/5/17 09:43
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\Java\\JavaAPIsAndLibraries\\src\\com\\a11File\\FileDemo.java");
//        System.out.println(file.exists());
        String pathName = "/Users/billion/hub/";
        File f1 = new File(pathName + "file.txt");
        System.out.println("f1:" + f1);
        File f2 = new File(pathName, "file.txt");
        System.out.println("f2:" + f2);
        File f3 = new File(pathName); // 构造此抽象路径名的File实例，它表示当前目录
        File f4 = new File(f3, "file.txt");
        System.out.println("f4:" + f4);
        System.out.println(f1 == f2); // false内存地址不同，内容相同用equals
        System.out.println("---File类的目录和文件创建方法");
        System.out.println(f1.createNewFile()); // hub目录下创建文件,同名目录返回false
//        System.out.println(f3.mkdir()); // hub目录下创建文件夹
        File f5 = new File(pathName + "test");
//        System.out.println(f5.mkdirs()); // hub目录下创建多级目录
        System.out.println("---File类的判断获取方法");
        System.out.println("f1.isDirectory():" + f1.isDirectory());
        System.out.println("f1.isFile():" + f1.isFile());
        System.out.println("f1.exists():" + f1.exists());
        System.out.println("f1.getAbsoluteFile():" + f1.getAbsoluteFile());
        System.out.println("f1.getPath():" + f1.getPath());
        System.out.println("f1.getName():" + f1.getName());
        System.out.println("f1.length():" + f1.length());
        System.out.println("---获取目录下的所有文件目录字符串数组");
        String[] strArray = f3.list();
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("---获取目录下的所有文件目录对象数组");
        File[] fArray = f3.listFiles(); // 获取File对象数组可以后续使用File类的功能
        for (File f : fArray) {
            if (f.isFile()) {
                System.out.println("文件名：" + f.getName());
            } else {
                System.out.println("目录名：" + f.getName());
            }
        }
        System.out.println("---项目的当前模块下创建文件或目录");
        File f6 = new File("JavaAPIsAndLibraries/test.txt");
//        if (!f6.getParentFile().exists()) {
//            parentDir.mkdirs(); // 一次性创建多级目录
//        }
        System.out.println("f6.createNewFile():" + f6.createNewFile());
        System.out.println("f6.delete():" + f6.delete());
        File f7 = new File("JavaAPIsAndLibraries/testDir");
        System.out.println("f7.mkdir():" + f7.mkdir());
        System.out.println("f7.delete():" + f7.delete());
        File f8 = new File("JavaAPIsAndLibraries/testDir/test.txt"); // 父级目录testDir不存在时
        if (!f8.getParentFile().exists()) {
            f8.getParentFile().mkdirs(); // 一次性创建多级目录
        }
        System.out.println("f8.createNewFile():" + f8.createNewFile());
        System.out.println("f8.delete():" + f8.delete()); // 只删除测试目录下的文件

        // 字符流的汉字存储使用字符集编码与解码
//        String str = "abc"; // [97, 98, 99]
        String str = "中国"; // idea默认[-28, -72, -83, -27, -101, -67]
        byte[] bytes = str.getBytes(); // 字符串转成字节数组
//        byte[] bytes = str.getBytes("UTF-8");// [-28, -72, -83, -27, -101, -67]
//        byte[] bytes = str.getBytes("GBK"); // [-42, -48, -71, -6]
        System.out.println(Arrays.toString(bytes));
        String s = new String(bytes); // 字节数组转成字符串使用平台默认字符集解码
//        String s = new String(bytes, "GBK"); // 字节数组转成字符串使用GBK字符集解码


    }
}
