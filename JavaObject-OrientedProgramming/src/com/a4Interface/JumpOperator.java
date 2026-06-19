package com.a4Interface;

/**
 * @className: JumpOperator
 * @description: 接口名作为形参和返回值-该接口的实现类对象
 * @author: hotel
 * @date: 2026/1/7 17:28
 */
public class JumpOperator {
    public void useJump(Jump j) {
        j.jumping();
    }

    public Jump getJump() {
        Jump j = new Cat();
        return j;
    }
}
