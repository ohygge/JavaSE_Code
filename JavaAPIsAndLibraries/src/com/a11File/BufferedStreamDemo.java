package com.a11File;

import java.io.*;
import java.util.*;

/**
 * @className: BufferedStreamDemo
 * @description: 字节与字符缓冲流类
 * @author: hotel
 * @date: 2026/5/20 16:49
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        String str1 = "JavaAPIsAndLibraries/fos1.txt";
        FileInputStream fis = new FileInputStream(str1);
        BufferedInputStream bis = new BufferedInputStream(fis); // 创建字节缓冲输入流对象读文件
        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        bis.close();

        String str2 = "JavaAPIsAndLibraries/fos2.txt";
        FileOutputStream fos = new FileOutputStream(str2);
        BufferedOutputStream bos = new BufferedOutputStream(fos); // 创建字节缓冲输出流对象写文件
        bos.write("better\r\n".getBytes());
        bos.write("man\r\n".getBytes());
        bos.close();
        System.out.println("---字符缓冲流");
        BufferedWriter bw = new BufferedWriter(new FileWriter(str2)); // 创建字符缓冲输出流对象写文件
        bw.write("right\r\n");
        bw.write("ok\r\n");
        for (int i = 0; i < 5; i++) {
            bw.write("hotel" + i);
            bw.newLine(); // 输出流的换行方法
            bw.flush();
        }
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader(str1));
//        char[] chs = new char[1024];
//        int lenth = 0;
//        while ((lenth = br.read(chs)) != -1) {
//            System.out.println(new String(chs, 0, lenth));
//        }
        String line = null; // 输入流的readLine()方法读取一行数据，返回值是String类型
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        /**
         * 此处添加一知识点打印流PrintStream和PrintWriter
         * PrintStream和PrintWriter是字节流和字符流输出流
         * 常用PrintWriter代替BufferedWriter
         * PrintWriter pw = new PrintWriter(new FileWriter(str2));
         * String line = null;
         * while ((line = br.readLine()) != null) {
         *    pw.println(line); // 一行简化write，newline，flush三行代码
         * }
         * pw.close();
         */
        br.close();
        arrayListToTxt(str2); // ArrayList集合数据写入txt文件
        txtToArray(str2); // txt文件数据存入ArrayList集合打印控制台
        callName(str2); // 读取文件内容名词用来随机点名
        arrayListToFile(str2); // 学生信息集合写到文件
        fileToArrayList(str2); // 文件数据存入ArrayList集合按照规则打印控制台
//        scoreToFile(str2); // 学生成绩集合按照规则写入文件

    }

    public static void scoreToFile(String destPath) throws IOException {
        TreeSet<Score> scoreSet = new TreeSet<>(new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num == 0 ? s2.getChinese() - s1.getChinese() : num;
                int num3 = num2 == 0 ? s2.getMath() - s1.getMath() : num2;
                int num4 = num3 == 0 ? s1.getStuName().compareTo(s2.getStuName()) : num3;
                return num4;
            }
        });
        for (int i = 0; i < 4; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("第" + (i + 1) + "个学生姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            Score s = new Score(name, chinese, math);
            scoreSet.add(s);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(destPath));
        for (Score s : scoreSet) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getStuName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }


    /**
     * 读取文件数据按照指定规则打印学生信息集合
     *
     * @param path
     * @throws IOException
     */
    public static void fileToArrayList(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        ArrayList<Student> stuArr = new ArrayList<>();
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] strArr = line.split(",");
            Student s = new Student();
            s.setSid(strArr[0]);
            s.setName(strArr[1]);
            s.setAge(Integer.parseInt(strArr[2]));
            s.setAddress(strArr[3]);
            stuArr.add(s);
        }
        br.close();
        for (Student s : stuArr) {
            System.out.println(s.getSid() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
        }
    }

    /**
     * 学生信息集合写到指定文件
     *
     * @param destPath
     * @throws IOException
     */
    public static void arrayListToFile(String destPath) throws IOException {
        ArrayList<Student> stuArr = new ArrayList<>();
        Student s1 = new Student("s01", "张三", 18, "xa");
        Student s2 = new Student("s02", "李四", 19, "wh");
        Student s3 = new Student("s03", "王五", 20, "sz");
        stuArr.add(s1);
        stuArr.add(s2);
        stuArr.add(s3);
        BufferedWriter bw = new BufferedWriter(new FileWriter(destPath));
        for (Student s : stuArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

    /**
     * 点名器
     *
     * @param path
     * @throws IOException
     */
    public static void callName(String path) throws IOException {
        BufferedReader bw = new BufferedReader(new FileReader(path));
        ArrayList<String> arrayName = new ArrayList<>();
        String line = null;
        while ((line = bw.readLine()) != null) {
            arrayName.add(line);
        }
        bw.close();
//        int index = (int) (Math.random()*arrayName.size());
        Random r = new Random();
        int index = r.nextInt(arrayName.size());
        System.out.println("callName is:" + arrayName.get(index));

    }

    /**
     * txt文件数据存入ArrayList集合打印控制台
     *
     * @param path
     * @throws IOException
     */
    public static void txtToArray(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        ArrayList<String> arrayStr = new ArrayList<>();
        String line = null;
        while ((line = br.readLine()) != null) {
            arrayStr.add(line);
        }
        br.close();
        for (String str : arrayStr) {
            System.out.println(str);
        }
    }

    /**
     * 集合数据写入txt文件
     *
     * @param destPath
     * @throws IOException
     */
    public static void arrayListToTxt(String destPath) throws IOException {
        ArrayList<String> arrayStr = new ArrayList<>();
        arrayStr.add("hotel");
        arrayStr.add("orange");
        arrayStr.add("free");
        arrayStr.add("class");
        BufferedWriter bw = new BufferedWriter((new FileWriter(destPath)));
        for (String s : arrayStr) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
