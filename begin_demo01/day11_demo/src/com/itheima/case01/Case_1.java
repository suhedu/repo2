package com.itheima.case01;

import java.util.Random;

/**
 目标：生成一个5位数的验证码
 验证码由 4个 （A-Z a-z） 和1个 （0-9）的字符组成
 数字固定在最后一位即可
 例如：gAgZ6

 提炼主干：生成5个字符的验证码，前4个全部是英文，最后一个必须是数字。

 分析步骤：
 1、定义一个字符串类型String的变量用于存储最终的5个字符。
 2、定义一个随机数对象，用于后面生成随机数。
 3、得到一个4位数的英文随机字符串
 4、得到一个1位数的数字随机字符。
 5、拼接给字符串变量result输出即可！
 */
public class Case_1 {
    public static void main(String[] args) {
        //定义一个字符串类型的变量,用于存储后面的五个字符
        String result = "";
        //定义一个随机数对象,用于生成后面的随机数
        Random s = new Random();
        for (int i = 0; i < 4; i++) {//得到一个四位数英文随机字符串
            int data = s.nextInt(2);
            switch (data){
                case 0 :
                    char lowerCase = (char) (s.nextInt(26) + 97);
                    result += lowerCase;
                    break;
                case 1 :
                    char upperCase = (char)(s.nextInt(26) + 65);
                    result += upperCase;
                    break;
            }
        }
        System.out.println(result + s.nextInt(10));
    }
}
