package com.itheima._05方法练习题讲解;

/**
     目标：求2个整数中的较大值。

     方法的格式：
         public static 返回值类型 方法名称(形参列表){
                方法体代码;
         }

     分析步骤：
         定义方法的两个明确：
         1.方法是否需要返回值类型申明：
            -- 需要，返回较大值：int
         2.方法是否需要申明形参列表：
            -- 需要，求2个值得较大值： (int a, int b)

     小结：
        开发中方法是否需要参数和返回值类型申明，是由业务需求和你自己决定的！
 */
public class MethodExecDemo03 {
    public static void main(String[] args) {
        System.out.println(getMax(10,30));

        // i j 实参：
        int i = 520;
        int j = 340;
        System.out.println("较大值是："+ getMax(i , j));
    }

    // a  b 形参！
    public static int getMax(int a, int b){
        int max = a >= b ? a : b;
        return max;
    }
}
