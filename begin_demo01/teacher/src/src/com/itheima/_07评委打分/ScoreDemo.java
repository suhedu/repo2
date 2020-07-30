package src.com.itheima._07评委打分;

import java.util.Arrays;
import java.util.Random;

/**
    目标：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 ​    选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。

    分析步骤：
         1、定义一个数组中保存分数。
         2、随机生成6个分数范围在：0 - 100之间。
         3、把数组传入给一个方法，计算平均分返回。
 */
public class ScoreDemo {
    public static void main(String[] args) {
        //  1、存入到一个数组中保存起来。
        int[] scores = new int[6]; // [0 , 0 , 0 , 0 , 0 , 0]
        //                             0   1   2   3   4   5

        //  2、随机生成6个分数范围在：0 - 100之间。
        Random r = new Random();
        for (int i = 0; i < scores.length; i++) {
            // i = 0 1 2 3 4 5
            // 给数组的当前索引位置赋值一个随机的 0 - 100之间的分数
            scores[i] = r.nextInt(101); // 0 - 100
        }
        // 输出全部分数
        System.out.println("全部分数：" + Arrays.toString(scores)); // 后面的用法

        // 3、把数组传入给一个方法，计算平均分返回
        int averageScore = calcAverage(scores);
        System.out.println("该选手打分为："+ averageScore);
    }

    public static int calcAverage(int[] scores){
        // 平均分数 = （元素总和 - 最高分数 - 最低分数 ）/ （数组的长度 - 2）
        // a、定义3个变量存储最高分，最低分，总分
        int maxScore = scores[0], minScore = scores[0], sum = 0;
        // b.循环遍历找出最高分，最低分，总分。   [10 98 23 98 98 2]
        for(int i = 0; i < scores.length; i++ ) {
            // i = 0 1 2 3 4 5
            // 得到当前元素交给了一个变量
            int score = scores[i];
            // 找最大值，比当前最大值大，替换最大值
            if(score > maxScore) maxScore = score;
            // 找最小值，比当前最小值小，替换最小值
            if(score < minScore) minScore = score;
            // 累加求和
            sum += score;
        }
        System.out.println("总分："+sum);
        System.out.println("去掉最低分："+minScore);
        System.out.println("去掉最高分："+maxScore);
        // c.计算结果返回
        int averageScore = (sum - maxScore - minScore) / (scores.length - 2);
        return averageScore;
    }
}


