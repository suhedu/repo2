package 杜振兴.cases2;
/**
 目标：数组遍历

 什么是“遍历”？
 遍历就是一个一个的访问一遍数据。

 为什么要遍历？
 开发中我们经常要从一批数据中找出一些信息：例如说，最大值，平均值，满足要求的某个值。
 这都设计到遍历。

 数组的遍历方式：
 1.for循环遍历数组。

 小结：
 记住。
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //for循环遍历一个数组中的元素
        //使用循环解决
        int[] scores = new int[]{100, 200,300,400};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
