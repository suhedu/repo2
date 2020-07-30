package com.itheima._04循环的嵌套;

/**
    目标：嵌套循环做一个练习题。（了解）

    输出如下形状：  3*5
            *****    0
            *****    1
            *****    2
 */
public class ForForExecDemo02 {
    public static void main(String[] args) {
        // 1.定义一个循环控制打印三行。
        for (int i = 0; i < 3; i++) {
            // i = 0 1 2
            // 2.内部循环控制每行打印多少个星星 
            for (int j = 0; j < 5; j++) {
                System.out.print("*");  // print后面没有ln输出不换行
            }
            // 3.打印完一行星星需要换行
            System.out.println(); // println换行
        }
    }
}
