package com.a4Interface;

public class AnimalDemo {
    public static void main(String[] args) {
        Jump j = new Cat();
        j.jumping();
        System.out.println("-------");

        Animal an = new Cat("Tom",22);
        an.eat();
        System.out.println(an.getAge()+"+"+an.getName());
        System.out.println("-----");

        Cat cat = new Cat("Rose",12);
        cat.eat();
        cat.jumping();

        CatOperator co = new CatOperator();
        Cat c1 = new Cat();
        co.useCat(c1);
        System.out.println("---");
        Cat c2 = co.getCat();
        c2.eat();
        System.out.println("----");
        AnimalOperator ao = new AnimalOperator();
        Animal ca1 = new Cat();
        ao.useAnimal(ca1);
        System.out.println("---");
        Animal ca2 = ao.getAnimal();
        ca2.eat();
        System.out.println("----");
        JumpOperator jo = new JumpOperator();
        Jump j1 = new Cat();
        jo.useJump(j1);
        System.out.println("---");
        Jump j2 = jo.getJump();
        j2.jumping();

    }
}

/*
* interface -- implements
* 接口多态，实现类对象实例化；多态前提是有继承或实现关系，有方法重写
* 有父（类/接口）引用指向（子/实现）类对象
* 接口实现类必须重写接口中的所有抽象方法，或者是抽象类
*
* 抽象类和接口区别
*
* 1、成员区别
*       抽象类：变量，常量；有构造方法；有抽象方法也有非抽象方法
*       接口：  常量；抽象方法
*
* 2、关系区别
*       类与类：继承；单继承
*       类与接口：实现，单/多实现
*       接口与接口：继承，单/多继承
* 3、设计理念
*      抽象类：描述的是，这个类是啥，定义的是共性
*      接口：  描述的是，这个类能干啥，定义的是规范
*      抽象类是对事物的抽象，接口是对行为的抽象
**/
