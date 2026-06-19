package com.a1ExceptionHanding;

/**
 * @className: TeacherScore
 * @description: 教师评分类
 * @author: hotel
 * @date: 2026/3/11 12:10
 */
public class TeacherScore {
    public void checkScore(int score) throws ScoreException {
        if (score<0 || score>100) {
            throw new ScoreException("输入的分数不合法");
        } else {
            System.out.println("输入的分数合法");
        }
    }
}
