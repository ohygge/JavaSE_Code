package com.a5Anonymous;

/**
 * @className: Outer
 * @description: 内部类与外部类-类A中定义一个类B
 * @author: hotel
 * @date: 2026/1/7 22:33
 */
public class Outer {
    private int num = 10;
    private class Inner { // 成员内部类-定义在外部类的成员位置
        public void show() {
            System.out.println("成员内部类可访问外部类成员变量：" + num);
        }
    }
    public void method1() {
        Inner i = new Inner(); // 使用成员内部类的方法需在方法中创建内部类对象
        i.show();
    }
    public void method2() {
        int age = 20;
        class PartInner { // 局部内部类-定义在方法中的类,外接无法直接使用
            public void show() {
                System.out.println("局部内部类可直接访问外部类的成员：" + num);
                System.out.println("局部内部类可访问方法内的局部变量：" + age);
            }
        }
        PartInner partInner = new PartInner(); // 使用局部内部类方法需在方法中创建内部类对象
        partInner.show();
    }
    public void method3() {
        /*new Inner() {
            @Override
            public void show() {
                System.out.println("匿名内部类的调用");
            }
        }.show();*/
        // 本质是继承了该类或实现了该接口的子类匿名对象
        Inner inner = new Inner() { // 接口的实现类对象
            @Override
            public void show() {
                System.out.println("匿名内部类的调用");
            }
        };
        // 多次调用
        inner.show();
        inner.show();
    }

}
