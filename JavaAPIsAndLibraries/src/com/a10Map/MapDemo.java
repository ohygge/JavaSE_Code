package com.a10Map;

import com.a4ArrayList.Student;

import java.util.*;

/**
 * @className: MapDemo
 * @description: 集合Map接口和HashMap类
 * @author: hotel
 * @date: 2026/4/10 18:49
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");
        System.out.println(map1); // {1=a, 2=b, 3=c}
        System.out.println("map1.get(2):" + map1.get(2));
        System.out.println("map1.size():" + map1.size() + "---" + map1.isEmpty());
        System.out.println("map1.containsKey(1):" + map1.containsKey(1));
        System.out.println("map1.containsValue(\"b\"):" + map1.containsValue("b"));
        System.out.println("map1.remove(2):" + map1.remove(2));
        System.out.println("map1.remove(9):" + map1.remove(9));
        System.out.println("keySet()---values()");
        map1.put(2, "u");
        Set<Integer> keySet = map1.keySet(); // key自动排序
        for (Integer i : keySet) {
            System.out.println("key:" + i);
        }
        Collection<String> values = map1.values();
        for (String s : values) {
            System.out.println("value:" + s);
        }
        // map集合遍历1使用keySet()
        Set<Integer> ks = map1.keySet();
        for (Integer i : ks) {
            String value = map1.get(i);
            System.out.println("map集合遍历key:" + i + "---" + "value:" + value);
        }
        // map集合遍历2使用entrySet()
        Set<Map.Entry<Integer, String>> entries1 = map1.entrySet();
        for (Map.Entry<Integer, String> entry : entries1) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("map集合遍历key:" + key + "---" + "value:" + value);
        }
        System.out.println("HashMap集合存储key,student键值对---");
        HashMap<String, Student> mapStu = new HashMap<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        mapStu.put("001", s1);
        mapStu.put("002", s2);
        Set<Map.Entry<String, Student>> entries2 = mapStu.entrySet();
        for (Map.Entry<String, Student> entry : entries2) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println("Map.Entry<>:" + key + ":" + value.getName() + "," + value.getAge());
        }
        Set<String> keyStr = mapStu.keySet();
        for (String key : keyStr) {
            Student value = mapStu.get(key);
            System.out.println("Map.keySet():" + key + ":" + value.getName() + "," + value.getAge());
        }
        // Lamda表达式遍历
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三", 18));
        stuList.add(new Student("李四", 33));
        stuList.add(new Student("王五", 2));
        Collections.sort(stuList, Comparator.comparingInt(Student::getAge));
        Collections.sort(stuList, (s3, s4) -> s3.getAge() - s4.getAge());
        for (Student student : stuList) {
            System.out.println(student.getName() + ":" + student.getAge());
        }
    }
}
