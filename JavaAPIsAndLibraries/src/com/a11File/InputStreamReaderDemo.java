package com.a11File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @className: InptuStreamReaderDemo
 * @description: 字符输入流类
 * @author: hotel
 * @date: 2026/5/22 16:48
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        String str1 =  "JavaAPIsAndLibraries/src/com/a11File/BufferedStreamDemo.java";
        InputStreamReader isr1 = new InputStreamReader(new FileInputStream(str1));
        int ch = 0;
        while ((ch = isr1.read()) != -1) {
            System.out.print((char)ch);
        }
//        int len = 0;
//        char[] chs1 = new char[1024];
//        while ((len = isr1.read(chs1)) != -1) {
//            System.out.print(new String(chs1, 0, len));
//        }
        isr1.close();
    }
}
