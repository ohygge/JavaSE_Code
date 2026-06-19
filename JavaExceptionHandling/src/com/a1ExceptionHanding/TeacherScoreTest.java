package com.a1ExceptionHanding;

import java.util.Scanner;

/**
 * @className: TeacherScoreTest
 * @description: 教师评测试类
 * @author: hotel
 * @date: 2026/3/11 12:14
 */
public class TeacherScoreTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的成绩：");
        int num = sc.nextInt();
        TeacherScore ts = new TeacherScore();
        try {
            ts.checkScore(num);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
