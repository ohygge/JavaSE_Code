package com.no1Extends;

public class PersonDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Tom");
        student1.setAge(12);
        System.out.println(student1.getName() + "\t" + student1.getAge());
        student1.show();
        student1.study();
        System.out.println("===");

        Student student2 = new Student("May", 22);
        System.out.println(student2.getName() + "\t" + student2.getAge());
        student2.study();

    }
}
