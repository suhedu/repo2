package com.heima._case;

import java.util.Random;

/*
    目标：扩展随机生成指定区间的随机数。

    引入：
        Java的官方默认只能生成 0 - （n-1）之间的随机数。

    生成(减加法)
        1-100之间的随机数：
        3-19之间的随机数:
        100-999之间的随机数：
    小结：
        关于任意区间随机数生成的拓展说明:减加法*/
public class Case203 {
    public static void main(String[] args) {
        Random s = new Random();
        int data1 = s.nextInt(100) + 1;
        System.out.println(data1);
        int data2 = s.nextInt(17) + 3;
        System.out.println(data2);
        int data3 = s.nextInt(900) + 100;
        System.out.println(data3);
    }
}
