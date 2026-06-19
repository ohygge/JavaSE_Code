package com.a12Recursive;

import java.io.File;

/**
 * @className: RecursiveDiGui
 * @description: IO流递归调用方法
 * @author: hotel
 * @date: 2026/5/17 21:46
 */
public class RecursiveDiGui {
    public static void main(String[] args) {
        /*
         * 递归调用方法
         * 计算第n个斐波那契数
         * f(n) 第n个月兔子对数1,1,2,3,5,8,13,21...
         */
        System.out.println("第5个斐波那契数:" + f(5));
        System.out.println("第20个斐波那契数:" + f(20));
        // 阶乘计算
        System.out.println("jieCheng(5):" + jieCheng(5));
        // 递归获取文件
        System.out.println("---递归获取文件");
        File file = new File("/Users/billion/hub/apps");
        long start = System.currentTimeMillis();
        int total = getFilePath(file);
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - start) + "ms " + "文件数量:" + total);

    }

    /**
     * 递归获取文件
     * @param f
     */
    public static int getFilePath(File f) {
        int count = 0;
        File[] fileList = f.listFiles();
        if (fileList != null) {
            for (File file : fileList) {
                if (file.isDirectory()) {
                    count += getFilePath(file);
                } else {
                    System.out.println(file.getAbsoluteFile());
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 阶乘计算
     * @param a
     * @return
     */
    public static int jieCheng(int a) {
        if (a == 1) {
            return 1;
        }else {
            return a*jieCheng(a-1);
        }
    }

    /**
     * 计算第n个斐波那契数
     * @param n
     * @return
     */
    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n-1) + f(n-2);
        }
    }
}
