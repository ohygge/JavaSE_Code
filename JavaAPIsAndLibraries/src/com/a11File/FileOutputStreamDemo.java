package com.a11File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @className: FileOutputStreamDemo
 * @description: 文件输出流用于将数据写入File
 * @author: hotel
 * @date: 2026/5/19 11:30
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String str = "JavaAPIsAndLibraries/fos1.txt";
        // 创建字节输出流对象
        FileOutputStream fos = new FileOutputStream(str);
        /*
         * 上一行做了三件事情：1调用系统功能创建了文件
         *                 2创建字节输出流对象
         *                 3让字节输出流对象指向创建好的对象
         */
        // 追加写入文件末尾的write方法
//        FileOutputStream fos = new FileOutputStream(str, true); // 第二个参数为true
        // 一次写一个字节数据
        fos.write(97); // 97是字符a的Unicode编码
        fos.write(57); // 57是字符9的Unicode编码
        fos.write(55); // 55是字符7的Unicode编码
        char a = 'A';
//        a = '\u2034'; //char类型的字符4的十六进制值
        fos.write(a);
        // 一次写一个字节数组数据
        byte[] b = {97, 98, 99, 100, 101, 102};
        fos.write(b);
        byte[] c = "321god".getBytes();
        fos.write(c);
        fos.write("\r\n".getBytes()); // 换行问题
        // 一次写一个字节数组的一部分
        fos.write(c, 1, 4);
        // 关闭流
        fos.close();

    }
}
