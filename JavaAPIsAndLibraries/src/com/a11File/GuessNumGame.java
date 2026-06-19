package com.a11File;

import java.util.Random;
import java.util.Scanner;

/**
 * @className: GuessNumGame
 * @description: 猜数字游戏类
 * @author: hotel
 * @date: 2026/5/30 09:39
 */
public class GuessNumGame {
    public GuessNumGame() {}
    public static void start() {
        System.out.println("游戏开始");
        int num = new Random().nextInt(10) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个1-10之间的整数：");
            int guessNum = sc.nextInt();
            if (guessNum > num) {
                System.out.println("猜大了");
            } else if (guessNum < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
