package com.no4Interface;

public class Dog extends Animal implements Jump {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }

    @Override
    public void jumping() {
        System.out.println("Dog is jumping");
    }

}
