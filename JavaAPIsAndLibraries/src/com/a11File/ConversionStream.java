package com.a11File;

import java.io.*;

/**
 * @className: ConversionStream
 * @description: 字符IO流的编码与解码类OutputStreamWriter和InputStreamReader
 * @author: hotel
 * @date: 2026/5/22 11:18
 */
public class ConversionStream {
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
        // 字符流的两种读取方式：一次读取一个字符；一次按一个字符数组读取
        InputStreamReader isr = new InputStreamReader(new FileInputStream(str), "UTF-8");
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char)ch); // 20320, 22909十进制编码值用int接收的，打印需要转char
        }
        isr.close();

        String srcPath = "JavaAPIsAndLibraries/src/com/a11File/BufferedStreamDemo.java";
        String destPath = "JavaAPIsAndLibraries/CopyBufferedStreamDemo.java";
//        copyJavaFile(srcPath, destPath); // 使用字符转换流复制文件
//        copyFileWithFileReader(srcPath, destPath); // 使用转换流的子类复制文件简化书写
//        copyFileWithBufferedReader(srcPath, destPath); // 使用字符缓冲流复制文件改进版
        copyFileWithReadLine(srcPath, destPath); // 使用字符缓冲流特有方法复制文件精进版

    }

    /**
     * 使用字符缓冲流特有方法复制文件
     * @param sp
     * @param dp
     * @throws IOException
     */
    public static void copyFileWithReadLine(String sp, String dp) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(sp));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dp));
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();

    }

    /**
     * 使用字符缓冲流复制文件
     * @param sp
     * @param dp
     * @throws IOException
     */
    public static void copyFileWithBufferedReader(String sp, String dp) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(sp));
        BufferedWriter bw = new BufferedWriter(new FileWriter(dp));
        char[] chs = new char[1024];
        int len = 0;
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }
        br.close();
        bw.close();
    }

    /**
     * 使用转换流的子类FileReader和FileWriter复制文件改进版
     * @param sp
     * @param dp
     * @throws IOException
     */
    public static void copyFileWithFileReader(String sp, String dp) throws IOException {
        FileReader fr = new FileReader(sp);
        FileWriter fw = new FileWriter(dp);
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0 ,len);
        }
        fw.close();
        fr.close();
    }

    /**
     * 使用转换流复制文件
     * @throws IOException
     */
    public static void copyJavaFile(String sp, String dp) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(sp), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(dp), "UTF-8");
//        int ch = 0; // 一次读取一个字符
//        while ((ch = isr.read()) != -1) {
//            osw.write(ch);
//        }
        char[] chs = new char[1024]; // 一次读取一个字符数组
        int len = 0;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }
        isr.close();
        osw.close();
    }


}
