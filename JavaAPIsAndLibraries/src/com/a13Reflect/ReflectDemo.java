package com.a13Reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @className: ReflectDemo
 * @description: 反射类机制三种获取Class对象的方式
 * @author: hotel
 * @date: 2026/6/4 11:03
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, IOException {
        Class<Student> c = Student.class; // 1.通过类名.class属性获取该类的CLass对象
        Class<Student> c1 = Student.class;
        System.out.println(c == c1);
        Student s = new Student();
        Class<? extends Student> c2 = s.getClass(); // 2.通过对象.getClass()方法获取该对象的Class对象
        System.out.println(c2 == c1);
        Class<?> c3 = Class.forName("com.a13Reflect.Student");// 3.通过Class.forName()方法获取该类的Class对象
        System.out.println(c3 == c1);
        System.out.println("---反射的方式创建学生类对象");
        Class<?> c4 = Class.forName("com.a13Reflect.Student");
        Constructor<?>[] cons = c4.getDeclaredConstructors(); // 获取所有构造方法的方法getDeclaredConstructors()或者getConstructors()返回所有构造方法对象的数组
        for (Constructor con : cons) {
            System.out.println(con);
        }
        System.out.println("---反射获取构造方法并使用");
        Constructor<?> con1 = c4.getConstructor(String.class, String.class, int.class, String.class); // 获取指定参数的构造方法
        Object obj1 = con1.newInstance("001", "张三", 18, "北京"); // 创建对象
        System.out.println("公共构造方法创建学生类对象---" + obj1); // 基本数据类型也可以通过.class获取到对应的Class类型对象
        System.out.println("---反射获取私有构造方法并使用");
        Constructor<?> con2 = c4.getDeclaredConstructor(String.class, String.class);
        con2.setAccessible(true); // 设置访问权限表示绕过访问权限检查
        Object obj2 = con2.newInstance("002", "李四");
        System.out.println("私有构造方法setAccessible绕过访问权限检查创建学生类对象---" + obj2);
        System.out.println("---反射获取成员变量并使用");
        Field[] fields = c4.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Field field = c4.getDeclaredField("address"); // 获取指定名称的成员变量
        Constructor<?> con3 = c4.getConstructor();
        Object obj3 = con3.newInstance();
        field.setAccessible(true); // 设置访问权限表示绕过访问权限检查
        field.set(obj3, "上海"); // 设置成员变量的值
        System.out.println("成员变量赋值---" + obj3);
        System.out.println("---反射获取成员方法并使用");
        Constructor<?> con4 = c4.getConstructor();
        Object obj4 = con4.newInstance();
        Method m1 = c4.getMethod("study");
        m1.invoke(obj4); // 调用无参方法无返回值
        Method m2 = c4.getMethod("sayHello", String.class);
        m2.invoke(obj4, "张三"); // 调用带参方法无返回值
        Method m3 = c4.getMethod("getInfo", String.class, int.class);
        Object o1 = m3.invoke(obj4, "张三", 20);// 调用有参方法有返回值
        System.out.println("带参方法有返回值---" + o1);
        Method m4 = c4.getDeclaredMethod("sayGoodbye");
        m4.setAccessible(true); // 设置访问权限表示绕过访问权限检查
        m4.invoke(obj4); // 调用私有方法无返回值
        System.out.println("---反射练习之越过泛型检查");
        ArrayList<Integer> array = new ArrayList<Integer>();
//        array.add(1);
        Class<? extends ArrayList> aClass = array.getClass();
        Method addMethod = aClass.getMethod("add", Object.class);
        addMethod.invoke(array, "张三");
        addMethod.invoke(array, "李四");
        System.out.println("反射越过泛型检查---" + array);
        System.out.println("---反射练习之动态代理---通过配置文件运行类中方法");
        Properties prop = new Properties();
        FileReader fr = new FileReader("JavaAPIsAndLibraries/class.txt");
        prop.load(fr);
        fr.close();
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");
        Class<?> c5 = Class.forName(className);
        Constructor<?> con5 = c5.getConstructor();
        Object obj5 = con5.newInstance();
        Method m5 = c5.getMethod(methodName);
        m5.invoke(obj5); // 调用方法


    }
}
