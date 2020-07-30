package com.itheima._02Java的参数传递机制_值传递;

/**
 目标：随便给你一个整型数组，可以返回他的最大值回来。

 独立功能独立成方法：基本常识。

 分析：
 1、定义数组
 2、定义一个方法接收数组，方法最终需要返回数组的最大值回来。
 3、在方法中遍历数组找出元素最大值，返回即可！
 4、传入数组给方法。

 */
public class MethodExecDemo03 {
    public static void main(String[] args) {
        //  1、定义数组
        int[] ages = {10, 20, 30, 40, 50, 60};
        //  3、把数组传入给方法。
        printArr(ages);
    }

    /**
     2、定义一个方法接收数组。输出： [10, 20, 30, 40, 50, 60]
     */
    public static void printArr(int[] array){
        System.out.print("["); // 没有ln不换行
        // 判断数组是否存在元素
        if(array != null && array.length > 0){
            // 快捷键遍历：array.fori
            // 遍历每个元素！
            for (int i = 0; i < array.length; i++) {
                // 判断是否到了最后一个元素
//                if(i == array.length - 1){
//                    System.out.print(array[i]);
//                }else{
//                    System.out.print(array[i] + ", ");
//                }
                // 简化方案：
                System.out.print(i == array.length - 1 ? array[i] : array[i]+", ");
            }
        }
        System.out.println("]");
    }
}
