package com.itheima._05方法练习题讲解;

/**
     目标：计算1+2+3...+n的和并返回求和的结果

     方法的格式：
         public static 返回值类型 方法名称(形参列表){
                 方法体代码;
         }

     分析步骤：
         定义方法的两个明确:
         1.方法是否需要返回值类型申明：
            -- 需要，求和的结果需要返回！ long
         2.方法是否需要申明形参列表：
            -- 需要，求和的边界没有确定：(int n)
 */
public class MethodExecDemo02 {
    public static void main(String[] args) {
        System.out.println(sum(10)); // 55
        System.out.println("1-100是：" + sum(100)); // 1-100是：5050

        long result = sum(100) + 100;
        System.out.println("结果是："+result); // 结果是：5150
    }

    public static long sum(int n){
        long sum = 0;// 累加求和的变量
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
