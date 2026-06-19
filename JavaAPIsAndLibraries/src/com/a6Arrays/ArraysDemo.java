package com.a6Arrays;

import java.util.Arrays;

/**
 * @className: ArraysDemo
 * @description: Array类的冒泡排序原理以及操作数组的方法
 * @author: hotel
 * @date: 2026/1/9 09:26
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("手搓排序前：" + arraysToString(arr));
        System.out.println("使用Arrays类的toString方法：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("使用Arrays类的sort方法排序后：" + Arrays.toString(arr));
        /*//第一次比较
        for (int i = 0; i < arr.length - 1 - 0; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第一次比较后：" + arraysToString(arr));
        //第二次比较
        for (int i = 0; i < arr.length - 1 - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第二次比较后：" + arraysToString(arr));
        //第三次比较
        for (int i = 0; i < arr.length - 1 -2; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第三次比较后：" + arraysToString(arr));
        //第四次比较
        for (int i = 0; i < arr.length - 1 -3; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第四次比较后：" + arraysToString(arr));*/
        for (int x = 0; x < arr.length - 1; x++) { //外层循环控制比较的轮数
            for (int i = 0; i < arr.length - 1 - x; i++) { //内层循环控制每一轮比较的次数
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("手搓排序后：" + arraysToString(arr));
    }
    public static String arraysToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }
}
