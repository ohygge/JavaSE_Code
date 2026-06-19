package com.a7Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @className: PokerCollectionsDemo
 * @description: Poker纸牌斗地主随机发牌看牌类
 * @author: hotel
 * @date: 2026/5/15 10:44
 */
public class PokerCollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> pokerList = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) { // 遍历颜色
            for (String number : numbers) { // 遍历数字
                pokerList.add(color + number);
            }
        }
        pokerList.add("大王");
        pokerList.add("小王");
        System.out.println("原始：" + pokerList);
        System.out.println("pokerList.size(): " + pokerList.size());
        Collections.shuffle(pokerList);
        System.out.println("洗牌：" + pokerList);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();
        for (int i = 0; i < pokerList.size(); i++) {
            String s = pokerList.get(i);
            if (i >= pokerList.size() - 3) {
                last.add(s);
            } else if (i % 3 == 0) {
                player1.add(s);
            } else if (i % 3 == 1) {
                player2.add(s);
            } else if (i % 3 == 2) {
                player3.add(s);
            }
        }
        System.out.println(last.size() + "-" + player1.size() + "-" + player2.size() + "-" + player3.size());
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
        lookPoker("底牌", last);
        System.out.println("---poker2,使用HashMap集合创建纸牌k-v代表为每张牌添加索引");
        HashMap<Integer, String> pokerMap = new HashMap<>();
        ArrayList<Integer> arrayIndex = new ArrayList<>();
        int index = 0;
        for (String num : numbers) {
            for (String color : colors) {
                pokerMap.put(index, color + num);
                arrayIndex.add(index);
                index++;
            }
        }
        pokerMap.put(index, "小王");
        arrayIndex.add(index);
        index++;
        pokerMap.put(index, "大王");
        arrayIndex.add(index);
        Collections.shuffle(arrayIndex);
        TreeSet<Integer> p1Set = new TreeSet<>();
        TreeSet<Integer> p2Set = new TreeSet<>();
        TreeSet<Integer> p3Set = new TreeSet<>();
        TreeSet<Integer> lastThreeSet = new TreeSet<>();
        for (int i = 0; i < arrayIndex.size(); i++) {
            int pokerIndex = arrayIndex.get(i);
            if (i >= arrayIndex.size() - 3) {
                lastThreeSet.add(pokerIndex);
            } else if (i % 3 == 0) {
                p1Set.add(pokerIndex);
            } else if (i % 3 == 1) {
                p2Set.add(pokerIndex);
            } else if (i % 3 == 2) {
                p3Set.add(pokerIndex);
            }
        }
        lookTreePoker("底牌", lastThreeSet, pokerMap);
        lookTreePoker("玩家1", p1Set, pokerMap);
        lookTreePoker("玩家2", p2Set, pokerMap);
        lookTreePoker("玩家3", p3Set, pokerMap);

    }

    /**
     * 按照纸牌的索引自然排序看牌方法二
     * @param name
     * @param treeNum
     * @param pokerMap
     */
    public static void lookTreePoker(String name, TreeSet<Integer> treeNum, HashMap<Integer, String> pokerMap) {
        System.out.print(name + ": ");
        for (Integer i : treeNum) {
            String poker = pokerMap.get(i);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
    /**
     * 看牌方法一
     * @param name
     * @param arrayNum
     */
    public static void lookPoker(String name, ArrayList<String> arrayNum) {
        System.out.print(name + ": ");
        for (String s : arrayNum) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
