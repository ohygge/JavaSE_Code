package com.a11File;

/**
 * @className: Score
 * @description: 成绩数据类
 * @author: hotel
 * @date: 2026/5/24 12:07
 */
public class Score {
    private String stuName;
    private int chinese;
    private int math;

    public Score() {}
    public Score(String stuName, int chinese, int math) {
        this.stuName = stuName;
        this.chinese = chinese;
        this.math = math;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum() {
        return chinese + math;
    }
    @Override
    public String toString() {
        return "Score{" +
                "stuName='" + stuName + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                '}';
    }
}
