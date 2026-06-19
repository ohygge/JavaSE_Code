package com.a4Interface;

/**
 * @className: PersonsDemo
 * @description: 不同人类的测试类
 * @author: hotel
 * @date: 2026/1/7 16:59
 */
public class PersonsDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("张继科");
        ppp.setAge(28);
        System.out.println(ppp.getName() + "---" + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("---");
        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(40);
        System.out.println(bp.getName() + "---" + bp.getAge());
        bp.eat();
        bp.study();

    }
}
