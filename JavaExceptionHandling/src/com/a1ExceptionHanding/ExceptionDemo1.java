package com.a1ExceptionHanding;

/**
 * @className: ExceptionDemo01
 * @description: 基本异常处理
 * @author: hotel
 * @date: 2026/3/11 09:04
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        method();
        System.out.println("程序结束");
    }

    public static void method() {
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常");
            e.printStackTrace(); // 打印完整堆栈信息
            System.out.println("e.getMessage():" + e.getMessage()); // 返回此Throwable的详细消息字符串
            System.out.println("e.toString():" + e.toString()); // 返回此Throwable的简短描述
        } finally {
            System.out.println("一定会执行的代码");
        }
    }
}

/*
    public class Throwable {
        private String detailMessage; // 异常信息
        public Throwable(String message) {
            detailMessage = message;
        }
        public String getMessage() {
            return detailMessage;
        }
    }
*/
