package com.itheima._06数组的遍历;

/**
    目标：数组练习题-求最值。

    分析步骤：
        1.定义一个整型数组存储全部人的颜值。
        2.定义一个变量存储最终的最大值，变量的初始值必须使用数组中的某个元素作为参照，建议用数组第一个元素！
        3.遍历数组中全部人的颜值。
        4.拿着当前遍历的元素值依次与最大值变量的值进行比较，如果比最大值变量的值大，替换最大值变量的值为当前值！

 */
public class ArrayExecDemo02 {
    public static void main(String[] args) {
        // 1.定义一个整型数组存储全部人的颜值。
        int[] faceScores = {5, 15, 2000, 10000, 100, 4000};
        //                      1   2     3      4    5
        // 2.定义一个变量存储最终的最大值，变量的初始值必须使用数组中的某个元素作为参照，
        // 建议用数组第一个元素！
        int maxScore = faceScores[0];

        // 3.遍历数组中全部人的颜值。
        // 注意：只需要从第二个位置开始找人比较
        for (int i = 1; i < faceScores.length; i++) {

            // 4.拿着当前遍历的元素值
            int ele = faceScores[i];
            // 依次与最大值变量的值进行比较，如果比最大值变量的值大，替换最大值变量的值为当前值！
            if(ele > maxScore){
                maxScore = ele; // 从右往左赋值！
            }
        }

        System.out.println("最高颜值是："+ maxScore);
    }
}
