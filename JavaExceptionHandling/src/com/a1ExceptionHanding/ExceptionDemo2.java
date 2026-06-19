package com.a1ExceptionHanding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @className: ExceptionDemo02
 * @description: 编译时异常和运行时异常
 * @author: hotel
 * @date: 2026/3/11 11:10
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("程序开始");
//        method1();
        try {
            method2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }
    // 编译时异常
    public static void method2() throws ParseException{
        String s = "2022-03-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
    // 运行时异常
    public static void method1() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }
}
