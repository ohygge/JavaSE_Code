package com.a11File;

import java.io.*;

/**
 * @className: CopyFolderDemo
 * @description: 复制单级文件和多级文件
 * @author: hotel
 * @date: 2026/5/25 10:34
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        // 复制单级文件夹
        copyFolder();
        // 复制多级文件夹
        copyFolders();

    }

    public static void copyFolders() throws IOException {
        /**
         * 复制多级文件夹
         * 1.创建源文件目录File对象
         * 2.获取源文件目录File对象名称copyFolder
         * 3.创建目标文件目录File对象（模块名+目录对象名
         * 4.判断目标File对象是否存在，不存在则创建
         * 5.获取源文件目录File对象下的所有文件File数组
         * 6.遍历File数组，获取每个文件File对象
         * 7.判断文件File对象是否为目录，是则递归调用copyFolders方法，否则调用copyFile方法
         * 8.调用copyFile方法复制文件，字节流复制
         */
        String srcPath = "/Users/billion/hub/temp/uum";
        File srcFile = new File(srcPath);
        File destFile = new File("/Users/billion/hub");
        copyFolders(srcFile, destFile);
        System.out.println("多级文件夹复制完成！");

    }

    public static void copyFolders(File srcFile, File destFile) throws IOException {
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
            File[] filesArr = srcFile.listFiles();
            for (File f : filesArr) {
                copyFolders(f, newFolder);
            }
        } else {
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    public static void copyFolder() throws IOException {
        /**
         * 复制单级文件
         * 1.创建源文件目录File对象
         * 2.获取源文件目录File对象名称copyFolder
         * 3.创建目标文件目录File对象（模块名+目录对象名
         * 4.判断目标File对象是否存在，不存在则创建
         * 5.获取源文件File对象下的所有File数组
         * 6.遍历File数组，获取每个File对象
         * 7.获取源文件File对象名称
         * 8.创建目标文件File对象（模块名+目录对象名+文件名
         * 9.复制文件copyFile()关闭流
         *
         */
        String srcPath = "/Users/billion/hub/temp/rcd";
        File srcFolder = new File(srcPath);
        String srcFolderName = srcFolder.getName();
        File destFoder = new File("JavaAPIsAndLibraries", srcFolderName);
        if (!destFoder.exists()) {
            destFoder.mkdir();
        }
        File[] filesList = srcFolder.listFiles();
        for (File srcFile : filesList) {
            String srcFileName = srcFile.getName();
            File destFile = new File(destFoder, srcFileName);
            copyFile(srcFile, destFile);
        }
    }

    /**
     * 复制单级文件
     * @param srcFile
     * @param destFile
     * @throws IOException
     */
    public static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();
    }
}
