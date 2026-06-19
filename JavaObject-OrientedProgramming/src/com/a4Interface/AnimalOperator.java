package com.a4Interface;

/**
 * @className: AnimalOperator
 * @description: 抽象动物类名作为形参和返回值-该抽象类的子类对象
 * @author: hotel
 * @date: 2026/1/7 17:18
 */
public class AnimalOperator {
    public void useAnimal(Animal animal) { // Animal ca = new Cat();
        animal.eat();
    }
    public Animal getAnimal() {
        Animal ca = new Cat();
        return ca;
    }
}
