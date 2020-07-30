package com.heima._case;

import java.util.Random;
import java.util.Scanner;

/*
    目标:  Random练习-猜数字。

    业务需求:
        先随机生成一个数字（1-100），让玩家不断猜测，如果猜大了提示过大。
        如果猜小了提示过小，如果猜中：恭喜你，去买单吧。

    开发步骤:
        1、使用随机数类先生成一个1-100之间的数字交给变量存储起来，作为幸运号码!
        2、定义一个死循环让玩家不断猜测，直到猜中截止。
        3、在循环中让玩家输入一个猜测号码。
        4、拿着猜测号码与幸运号码比对，做出相应提示，如果猜中结束死循环！*/
public class Case302 {
    public static void main(String[] args) {
        Random s =  new Random();
        int luckyNumber = s.nextInt(100) + 1;
       while (true){
           Scanner sc = new Scanner(System.in);
           System.out.print("请输入您要猜的数字");
           int gussNumber = sc.nextInt();
           if (gussNumber < luckyNumber){
               System.out.println("您猜的数字小");
           }else if (gussNumber > luckyNumber){
               System.out.println("您猜的数字大");
           }else{
               System.out.println("您猜对了");
               break;
           }
       }

    }
}
