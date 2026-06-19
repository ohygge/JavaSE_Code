package com.a11File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @className: GuessNumDemo
 * @description: 猜数字游戏测试类对于Properties集合对象的使用
 * @author: hotel
 * @date: 2026/5/30 09:20
 */
public class GuessNumDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties(); // 创建属性propterties集合文件对象
        FileReader fr = new FileReader("JavaAPIsAndLibraries/guessNum.property"); // 创建文件输入流对象
        prop.load(fr); // 把文件数据读取到prop集合中
        fr.close();
        String countVal = prop.getProperty("count");
        int num = Integer.parseInt(countVal);
        if (num >= 3) {
            System.out.println("游戏次数已用完，game over");
        } else {
            GuessNumGame.start();
            num++;
            prop.setProperty("count", String.valueOf(num));
            FileWriter fw = new FileWriter("JavaAPIsAndLibraries/guessNum.property"); // 创建文件输出流对象
            prop.store(fw, null); // 把属性集合数据写入到文件中
            fw.close();
        }


    }
}
