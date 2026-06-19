package com.a2String;

import java.util.Scanner;

/**
 * @className: StringBuilderDemo
 * @description: StringBuilder是可变字符串类即一个容器内容可变
 * @author: hotel
 * @date: 2026/1/1 12:06
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());
        StringBuilder sbHello = new StringBuilder("hello");
        System.out.println("sbHello:" + sbHello);
        System.out.println("sbHello.length():" + sbHello.length());
        StringBuilder sbWorld = sb.append("world"); // 添加字符串并返回对象本身
        System.out.println("sb:" + sb); // hello
        System.out.println("sbWorld:" + sbWorld); // hello
        System.out.println("sb == sbWorld:" + (sb == sbWorld)); // true对象本身不变
        sb.append("javaee");
        sb.append(100);
        sb.append(true);
        //sb.append("javaee").append("100").append(true); // 链式调用，可append任何基本类型
        System.out.println("sb append:" + sb);
        sb.reverse(); // 反转方法
        System.out.println("sb reverse:" + sb);
        // StringBuilder与String相互转换
        String sbToString = sb.toString(); // StringBuilder -> String
        System.out.println("sbToString:" + sbToString);
        StringBuilder strToSb = new StringBuilder(sbToString); // String -> StringBuilder
        System.out.println("strToSb:" + strToSb);
        // 将数组按照指定格式StringBuilder拼接再转换成String字符串返回
        int[] arr = {1, 2, 3, 4, 5};
        String arrToS = arrayToString(arr);
        System.out.println("arrToS:" + arrToS);
        System.out.println("请输入一个字符串：");
        String sc = new Scanner(System.in).nextLine();
        String reverseStr = reverseString(sc); // 输入字符串用StringBuilder反转字符串
        System.out.println("reverseStr:" + reverseStr);
    }

    /**
     * 将数组按照指定格式拼接成字符串
     * @param arr
     * @return toString
     */
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        String s = sb.toString();
        return s;
    }

    /**
     * 反转字符串
     * @param s
     * @return reverseString
     */
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
