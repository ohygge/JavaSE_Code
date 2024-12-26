package com.no1Extends;

public class Student extends Person {
    public Student() {}

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println(this.getName() + " likes to study");
    }

    /*@Override
    public void show() {
        // 方法体可以是空的，也可以包含特定的实现代码
    }*/

}

/*
* 子类可以有父类的内容
* 子类也可以有自己特有的内容
*
* @Override注解：这个注解是可选的，但非常推荐使用。
* 它告诉编译器show方法是故意重写父类中的方法。
* 如果父类中没有名为show的、参数列表完全匹配的方法，
* 或者show方法在父类中的访问权限不允许在子类中重写（例如，如果父类中的方法是private的），
* 编译器将报错。这有助于避免拼写错误和意外的行为。
* 访问修饰符：在重写方法时，子类方法的访问修饰符不能比父类方法的访问修饰符更严格。
* 例如，如果父类中的方法是protected的，那么子类中的重写方法也必须是protected或更公开的（如public），但不能是private。
* 在你的例子中，因为父类Person的show方法没有显式指定访问修饰符（默认为包级私有），
* 所以子类Student中的重写方法可以是任何合法的访问修饰符，但通常也会选择public以保持一致性。
**/
