package com.a11File;

import java.io.*;

/**
 * @className: CopyVideoDemo
 * @description: 四种方式复制视频计算耗时
 * @author: hotel
 * @date: 2026/5/21 18:02
 */
public class CopyVideoDemo {
    public static void main(String[] args) throws IOException {
        String srcPath = "/Users/billion/hub/right_pillar.mp4";
        String destPath = "JavaAPIsAndLibraries/right_pillar1.mp4";
        long start = System.currentTimeMillis();
//        copyVideo1(srcPath, destPath); // 耗时：15713ms
//        copyVideo2(srcPath, destPath); // 耗时：29ms
//        copyVideo3(srcPath, destPath); // 耗时：792ms
        copyVideo4(srcPath, destPath); // 耗时：9ms
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
    }

    /**
     * 字节缓冲流一次读写一个字节数组
     * @param sp
     * @param dp
     * @throws IOException
     */
    public static void copyVideo4(String sp, String dp) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sp));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dp));
        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();
    }

    /**
     * 字节缓冲流一次读写一个字节
     * @param sp
     * @param dp
     * @throws IOException
     */
    public static void copyVideo3(String sp, String dp) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sp));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dp));
        int by = 0;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bos.close();
        bis.close();
    }

    /**
     * 基本字节流一次读写一个字节数组
     * @param sp
     * @param dp
     * @throws IOException
     */
    public static void copyVideo2(String sp, String dp) throws IOException {
        FileInputStream fis = new FileInputStream(sp);
        FileOutputStream fos = new FileOutputStream(dp);
        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }

    /**
     * 基本字节流一次读写一个字节
     * @param sp
     * @param dp
     * @throws IOException
     */
    public static void copyVideo1(String sp, String dp) throws IOException {
        FileInputStream fis = new FileInputStream(sp);
        FileOutputStream fos = new FileOutputStream(dp);
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
