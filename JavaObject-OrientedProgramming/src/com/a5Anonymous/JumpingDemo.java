package com.a5Anonymous;

public class JumpingDemo {
    public static void main(String[] args) {
        JumpingOperator jo = new JumpingOperator();
        Jumping j = new Cat(); // 多态该接口的实现类对象
        jo.method(j);
        System.out.println("------");
        jo.method(
                // 匿名内部类的使用
                new Jumping() {
                    @Override
                    public void jump() {
                        System.out.println("Anonymous is jumping");
                    }
                }
        );
        jo.method(
                // 匿名内部类的使用
                new Jumping() {
                    @Override
                    public void jump() {
                        System.out.println("Dog is jumping");
                    }
                }
        );
        // 这样写可省略新建多个具体类，即可以不用新建Cat类和Dog类，直接在method方法里重写接口的实现类对象的接口方法即可
        // 将接口的实现类对象（相当于实参）作为参数传给method方法，其方法里有主动调用jump()方法

    }
}
