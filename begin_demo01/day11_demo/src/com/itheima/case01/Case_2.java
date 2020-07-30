package com.itheima.case01;
/**
 目标：已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换，
 ​        交换后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出交换后的数组元素。

 交换的最好方案：在同一个数组内部进行交换！
 数组反转的核心思想：前后位置对应交换！

 分析步骤：
 1、定义一个数组。
 2、定义一个循环，定义2个计数器，一个占第一索引位置，一个占最后元素索引
 一个往前走，一个往后退，同步交换，直到相遇截止。
 3、输出数组元素就是反转后的。
 */
public class Case_2 {
    public static void main(String[] args) {
        int[] arr = {50, 46, 37, 28, 55};
        reverse(arr);
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr){
        //定义两个计数器,一个占第一个索引位置,一个占最后一个索引位置
        for (int i = 0, j = arr.length - 1; i < j; i ++, j --) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
