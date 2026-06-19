package com.a4Interface;

/**
 * @className: PingPangCoach
 * @description: 乒乓球教练类继承抽象教练类
 * @author: hotel
 * @date: 2026/1/7 16:43
 */
public class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
