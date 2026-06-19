package com.a11File;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @className: FileOutputStreamExcepDemo
 * @description: 字节流写入数据加异常处理类
 * @author: hotel
 * @date: 2026/5/20 10:18
 */
public class FileOutputStreamExcepDemo {
    public static void main(String[] args) {
        String str = "JavaAPIsAndLibraries/fos2.txt";
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(str);
            fos.write("hello".getBytes(), 1, 4);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           if (fos != null) {
               try {
                   fos.close();
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           }
        }

    }

}
