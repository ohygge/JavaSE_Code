package com.a10Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/**
 * @className: ArrayListIncHashMap
 * @description: ArrayList集合中包含hashMap集合元素类
 * @author: hotel
 * @date: 2026/4/18 09:54
 */
public class ArrayListIncHashMap {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> alhm = new ArrayList<>();
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("a", "1");
        hm1.put("b", "2");
        alhm.add(hm1);
        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("c", "3");
        hm2.put("d", "4");
        alhm.add(hm2);
        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("e", "5");
        hm3.put("f", "6");
        alhm.add(hm3);
        System.out.println(alhm);
        for (HashMap<String, String> hm : alhm) {
            Set<String> keySet = hm.keySet();
            for (String s : keySet) {
                String value = hm.get(s);
                System.out.println(s + ":" + value);
            }
        }
        System.out.println("---输出字符串中字符出现的次数");
        String str = "integer";
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            Integer val = tm.get(key);
            if (val == null) {
                tm.put(key, 1);
            } else {
                tm.put(key, val + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> charac = tm.keySet();
        for (Character key : charac) {
            sb.append(key).append("(").append(tm.get(key)).append(")");
        }
        String strNum = sb.toString();
        System.out.println("TreeMap自然排序strNum = " + strNum);
        System.out.println("---");
        
    }
}

