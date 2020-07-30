package com.itheima.exam;

import java.util.Random;

/*
随机生成六个1-10（包含10）之间的数存入数组中,然后计算出去掉最大值与最小值的平均数，输出格式如下：
*/
public class SecondExam {
    public static void main(String[] args) {
        int[] arr = new int[6];
        giveValue(arr);
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (sum - max - min) * 1.0 / 4;
        System.out.println("平均数为:" + avg);

    }
    public static void giveValue(int[] arr){
        Random s = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
