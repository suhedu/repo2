package com.itheima._05Random随机数类详细讲解;

import java.util.Random;

/**
    目标：扩展随机生成指定区间的随机数。

    引入：
        Java的官方默认只能生成 0 - （n-1）之间的随机数。

    生成(减加法)
        1-100之间的随机数：
        3-19之间的随机数:
        100-999之间的随机数：
    小结：
        关于任意区间随机数生成的拓展说明:减加法

 */
public class RandomDemo02 {
    public static void main(String[] args) {
        // (1 - 100) => -1 => (0 - 99) + 1
        Random r = new Random();
        int data1 = r.nextInt(100) + 1;
        System.out.println(data1);

        // (3 - 19) =>  -3 => (0 - 16) + 3
        int data2 = r.nextInt(17) + 3;
        System.out.println(data2);

        // (100 - 999) => -100 => (0 - 899) + 100
        int data3 = r.nextInt(900) + 100;
        System.out.println(data3);
    }
}
