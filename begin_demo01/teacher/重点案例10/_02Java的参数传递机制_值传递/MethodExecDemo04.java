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
public class MethodExecDemo04 {
    public static void main(String[] args) {
        //  1、定义数组
        int[] faceScores = {5, 15, 2000, 10000, 100, 4000};
        //  4、传入数组给方法。
        int max = getMax(faceScores);
        System.out.println("最大值是："+ max);
    }

    /**
     2、定义一个方法接收数组，方法最终需要返回数组的最大值回来。
     */
    public static int getMax(int[] array){
         //  3、在方法中遍历数组找出元素最大值，返回即可！
         if( array != null && array.length > 0 ){
             // 数组存在元素，需要找出最大值返回
             int max = array[0];
             for (int i = 1; i < array.length; i++) {
                  if(array[i] > max) max = array[i];
             }
             return max; // 返回最大值了！
         }else{
             System.err.println("该数组为null或者没有元素存在!");
             return -1; // 代表没有最大值!!
         }
    }

}
