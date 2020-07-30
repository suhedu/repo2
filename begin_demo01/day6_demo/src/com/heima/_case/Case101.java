package com.heima._case;
/**
        目标:嵌套循环做一个练习题.

        输出如下形状:  3*5
        *****    0
        *****    1
        *****    2
        */
public class Case101 {
    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
