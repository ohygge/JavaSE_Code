package com.a11File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @className: OutputStreamWriterDemo
 * @description: 字符输出流类
 * @author: hotel
 * @date: 2026/5/22 16:54
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        String str =  "JavaAPIsAndLibraries/fos2.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(str),"UTF-8");
        osw.write("你好");
//        osw.write(95); // 一次写一个字符
//        osw.flush(); // 刷新流
//        char[] chs = {'a','b','c','d','e'};
//        osw.write(chs); // 一次写一个字符数组
//        osw.write(chs,1,chs.length); // 一次写一个字符数组的一部分
        osw.write("hello"); // 一次写一个字符串
        osw.write("hello",1,3); // 一次写一个字符串的一部分
        osw.close(); // 关闭流，先刷新流
    }
}
