package com.a1Scanner;

import java.util.Scanner;

/**
 * @className: ScannerDemo
 * @description: 用于获取键盘录入数据
 * @author: hotel
 * @date: 2025/12/23 17:42
 */
public class ScannerDemo {
    public static void main(String[] args) {
        String username = "rich";
        String password = "1234";
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pwd = sc.nextLine();
            if (username.equals(name) && password.equals(pwd)) {
                System.out.println("login success");
                break;
            } else {
                if (2-i == 0) {
                    System.out.println("login fail, your account has been locked");
                } else {
                    System.out.println("login fail, you have " + (2-i) + " times to try");
                }
            }

        }

    }
}
