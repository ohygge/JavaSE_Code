package com.no2Polymorphism;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal an = new Cat();
        an.setName("Jerry");
        an.setAge(12);
        System.out.println(an.getName()+","+an.getAge());
        an.eat();
        System.out.println("=========");

        an = new Dog("Tom",11);
        System.out.println(an.getName()+","+an.getAge());
        an.eat();
        System.out.println("=========");

    }
}

/*
* 成员变量：编译看左边，执行看左边
* 成员方法：编译看左边，执行看右边；因为成员方法有重写
* 多态：
* “多态性”这一术语就是“polymorphism”。它指的是变量、函数或对象能够具有多种形式的能力。
* 在Java中，多态性是通过方法重写（子类提供其超类中已经定义的方法的具体实现）
* 和接口实现（不同的类以不同的方式实现相同的接口）来实现的。
* 这使得一个接口可以用于一类通用的操作，而具体的操作则根据具体情况的确切性质来确定。
**/
