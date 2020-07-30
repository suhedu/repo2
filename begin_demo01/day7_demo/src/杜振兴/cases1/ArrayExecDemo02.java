package 杜振兴.cases1;
/*
    目标：数组练习题-求最值。

    分析步骤：
        1.定义一个整型数组存储全部人的颜值。
        2.定义一个变量存储最终的最大值，变量的初始值必须使用数组中的某个元素作为参照，建议用数组第一个元素！
        3.遍历数组中全部人的颜值。
        4.拿着当前遍历的元素值依次与最大值变量的值进行比较，如果比最大值变量的值大，替换最大值变量的值为当前值！*/
public class ArrayExecDemo02 {
    public static void main(String[] args) {
        //定义一个数组存储所有的数据
        int[] faceScores = {5,55,2000,4000,10000,100};
        //定义一个存储最大值的变量,变量的初始值必须要以数组中的某一个元素作为参展哦
        //建议用数组的第一个元素
        int maxScore = faceScores[0];
        for (int i = 1; i < faceScores.length; i++) {
            int els = faceScores[i];
            if (maxScore < els){
                maxScore = els;
            }
        }
        System.out.println("最高颜值是:" + maxScore);
    }
}
