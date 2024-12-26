package com.no3Abstract;

public class AnimalDemo {
    public static void main(String[] args) {
        // 抽象类有构造方法但是不能实例化，是用于子类访问父类数据的初始化
        // 创建对象按照多态的方式
        Animal cat = new Cat();
        cat.setName("Tom");
        cat.setAge(24);
        System.out.println(cat.getName()+","+cat.getAge());
        cat.eat();
        cat.jumping();
        System.out.println("-------");

        Animal dog = new Dog("Jack",11);
        System.out.println(dog.getName()+","+dog.getAge());
        dog.eat();
        dog.jumping();

    }
}
/*
    抽象类和抽象方法必须使用abstract关键字
    抽象类中不一定有抽象方法，但是有抽象方法的类一定是抽象类
    抽象类不能实例化，但是可以参照多态的方式，通过子类对象实例化（抽象类多态）
    抽象类的子类：要么重写抽象类中的所有抽象方法；要么子类也是抽象类
    抽象类有构造方法但是不能实例化，是用于子类访问父类数据的初始化
    是的，您的理解是正确的。在Java中，抽象类（abstract class）是一种特殊的类，
    它不能被直接实例化，但可以作为其他类的父类。
    抽象类的主要目的是提供一种模板，让子类能够继承并实现其抽象方法，同时共享一些通用的代码和数据。

    关于抽象类的构造方法，有几点需要注意：

    构造方法的存在：抽象类可以有构造方法。这些构造方法的主要目的是初始化抽象类中的成员变量。

    不能实例化：由于抽象类本身是不完整的（它可能包含未实现的抽象方法），因此不能直接通过new关键字来创建抽象类的实例。

    子类实例化时的调用：当子类实例化时，会隐式或显式地调用其父类（抽象类）的构造方法。
    这是因为在Java中，子类构造方法在执行自己的初始化代码之前，会先调用父类的构造方法来确保父类被正确初始化。

    代码共享和初始化：通过抽象类的构造方法，子类可以共享和初始化从父类继承的字段和方法。这对于实现代码重用和保持代码整洁非常有用。

    下面是一个简单的示例来说明这些概念：

    java
    // 抽象类
    abstract class Animal {
        String name;

        // 抽象类的构造方法
        Animal(String name) {
            this.name = name;
        }

        // 抽象方法，子类需要实现
        public abstract void makeSound();

        // 普通方法，可以被子类调用
        public void printName() {
            System.out.println("Animal name: " + name);
        }
    }

    // 子类
    class Dog extends Animal {

        // 子类的构造方法，隐式调用父类的构造方法
        Dog(String name) {
            super(name); // 调用父类Animal的构造方法
        }

        // 实现抽象方法
        @Override
        public void makeSound() {
            System.out.println("Woof woof!");
        }
    }

    public class Main {
        public static void main(String[] args) {
            // 不能直接实例化抽象类Animal
            // Animal animal = new Animal("Generic Animal"); // 编译错误

            // 可以实例化子类Dog
            Animal dog = new Dog("Buddy");

            // 调用从父类继承的方法
            dog.printName(); // 输出: Animal name: Buddy
            dog.makeSound(); // 输出: Woof woof!
        }
    }

    在这个示例中，Animal是一个抽象类，它有一个构造方法用于初始化name字段，以及一个抽象方法makeSound()需要子类来实现。
    Dog类继承自Animal，并通过其构造方法隐式调用父类的构造方法来初始化name字段。
    然后，Dog类实现了makeSound()方法。在Main类中，我们实例化了Dog对象，并调用了从父类继承的方法。
**/
