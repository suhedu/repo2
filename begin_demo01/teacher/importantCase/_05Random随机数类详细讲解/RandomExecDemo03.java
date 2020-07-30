package com.itheima._05Random随机数类详细讲解;
import java.util.Random;
import java.util.Scanner;
/**
    目标:  Random练习-猜数字。

    业务需求:
        先随机生成一个数字（1-100），让玩家不断猜测，如果猜大了提示过大。
        如果猜小了提示过小，如果猜中：恭喜你，去买单吧。

    开发步骤:
        1、使用随机数类先生成一个1-100之间的数字交给变量存储起来，作为幸运号码!
        2、定义一个死循环让玩家不断猜测，直到猜中截止。
        3、在循环中让玩家输入一个猜测号码。
        4、拿着猜测号码与幸运号码比对，做出相应提示，如果猜中结束死循环！
 */
public class RandomExecDemo03 {
    public static void main(String[] args) {
        // 1、使用随机数类先生成一个1-100之间的数字交给变量存储起来，作为幸运号码!
        Random r = new Random();
        int luckyNumber = r.nextInt(100) + 1;

        // 2、定义一个死循环让玩家不断猜测，直到猜中截止。
        while(true){
            // 3、在循环中让玩家输入一个猜测号码。
            Scanner sc = new Scanner(System.in);
            System.out.print("请您输入1-100之间的猜测号码:");
            int guessNumber = sc.nextInt();

            // 4、拿着猜测号码与幸运号码比对，做出相应提示，如果猜中结束死循环！
            if(guessNumber > luckyNumber){
                System.out.println("对不起，您猜测过大！");
            }else if(guessNumber < luckyNumber){
                System.out.println("对不起，您猜测过小！");
            }else{
                System.out.println("恭喜您，猜测成功，去买单吧！");
                break; // 结束当前死循环，结束游戏！
            }
        }
    }
}
