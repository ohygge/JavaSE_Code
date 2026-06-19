package com.a2String;

import java.util.Scanner;

/**
 * @className: StringDemo
 * @description: String类的构造和使用
 * @author: hotel
 * @date: 2025/12/23 17:49
 */
public class StringDemo {
    public static void main(String[] args) {
        char[] arrChar0 = new char[]{'a','b','c'};
        for (char c : arrChar0) {
            System.out.println(c);
        }
        String s4 = new String(new char[]{'h', 'e', 'l', 'l', 'o'}, 1, 3);
        System.out.println(s4);
        String s11 = new String();
        s11 = "abc";
        System.out.println("s11:" + s11);
        char[] arrChar = {'a','b','c'};
        String s22 = new String(arrChar);
        String s21 = new String(arrChar);
        System.out.println("s22:" + s22);
        System.out.println(s22 == s21); // 栈内存里的地址不同
        byte[] arrByte = {97,98,99};
        String s33 = new String(arrByte); // String构造函数的参数可为字符字节字符串
        System.out.println("s33:" + s33);
        String s44 = "hello";
        String s41 = "hello";
        System.out.println("s44:" + s44);
        System.out.println(s44 == s41); // 栈内存里的地址相同，都在堆内存里的常量池
        System.out.println(s44.equals(s41)); // equals方法比较的是内容是否相同
        //StringArray(); // 遍历字符串数组
        //charCount(); // 统计字符串中每个不同类型字符出现的次数
        int[] arr = {1,2,3,4,5};
        String str = arrayToString(arr); // 数组转拼接字符串
        System.out.println("拼接后：" + str);
        String reverseStr = reverse("abc"); // 反转字符串
        System.out.println("反转后：" + reverseStr);
    }

    /**
     * 遍历字符串数组
     */
    public static void StringArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i)); // charAt方法用于获取字符串中的某个字符
        }
    }

    /**
     * 统计字符串中每个不同类型字符出现的次数
     */
    public static void charCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        int bigCcount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCcount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("大写字母个数：" + bigCcount);
        System.out.println("小写字母个数：" + smallCount);
        System.out.println("数字个数：" + numberCount);
        System.out.println("其他字符个数：" + otherCount);
    }

    /**
     * 数组转换拼接成字符串：{a,b,c} -> [a,b,c]
     * @param arr
     * @return String
     */
    public static String arrayToString(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i] + "]";
            } else {
                s += arr[i] + ",";
            }
        }
        return s;
    }

    /**
     * 字符串反转即反向拼接
     * @param str
     * @return String
     */
    public static String reverse(String str) {
        String ss = "";
        for (int i = str.length()-1; i >= 0; i--) {
            ss += str.charAt(i);
        }
        return ss;
    }
}
