package com.a11File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @className: FileInputStreamDemo
 * @description: 字节输出流读取字节类
 * @author: hotel
 * @date: 2026/5/20 10:37
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String str = "JavaAPIsAndLibraries/fos2.txt";
        FileInputStream fis = new FileInputStream(str);
        int by = 0;
        while ((by = fis.read()) != -1) {
//            System.out.println(by);
            System.out.print((char)by);
        }
        fis.close();
        System.out.println("---复制文件");
        copyFile();
        readFileByArray();
        copyPicture();
    }

    /**
     * 复制文件
     * @throws IOException
     */
    public static void copyFile() throws IOException {
        String infile = "JavaAPIsAndLibraries/fos1.txt";
        String outfile = "JavaAPIsAndLibraries/fos2.txt";
        FileInputStream fis = new FileInputStream(infile);
        FileOutputStream fos = new FileOutputStream(outfile);
        long start = System.currentTimeMillis();
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("复制完成，耗时：" + (end - start) + "ms");

    }

    /**
     * 按一个字节数组读取文件
     * @throws IOException
     */
    public static void readFileByArray() throws IOException {
        String inFile = "JavaAPIsAndLibraries/fos1.txt";
        FileInputStream fis = new FileInputStream(inFile);
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        fis.close();
        byte[] bys1 = {99, 100, 101};
        System.out.println(new String(bys1) + "---按字节数组读取完成");
    }

    public static void copyPicture() throws IOException {
        String inFile = "img.JPG";
        String outFile = "JavaAPIsAndLibraries/img1.JPG";
        FileInputStream fis = new FileInputStream(inFile);
        FileOutputStream fos = new FileOutputStream(outFile);
        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
        System.out.println("图片复制完成");
    }
}
