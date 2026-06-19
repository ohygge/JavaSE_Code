package com.a4Interface;

/**
 * @className: CatOperator
 * @description: 猫类名作为形参和返回值-该类的对象
 * @author: hotel
 * @date: 2026/1/7 17:12
 */
public class CatOperator {
    public void useCat(Cat cat) {
        cat.eat();
    }
    public Cat getCat() {
        Cat cat = new Cat();
        return cat;
    }
}
