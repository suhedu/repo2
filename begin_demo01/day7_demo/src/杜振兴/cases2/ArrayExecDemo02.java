package 杜振兴.cases2;
/*
    目标：数组练习题-求最值。

    分析步骤：
        1.定义一个整型数组存储全部人的颜值。
        2.定义一个变量存储最终的最大值，变量的初始值必须使用数组中的某个元素作为参照，建议用数组第一个元素！
        3.遍历数组中全部人的颜值。
        4.拿着当前遍历的元素值依次与最大值变量的值进行比较，如果比最大值变量的值大，替换最大值变量的值为当前值！*/
public class ArrayExecDemo02 {
    public static void main(String[] args) {
        //定义一个存储所有人颜值的数组
        int[] faceScore = new int[]{3,22,5555,445,33};
        int maxScore = faceScore[0];
        for (int i = 1; i < faceScore.length; i++) {
            int els = faceScore[i];
            if (els > maxScore){
                maxScore = els;
            }

        }
        System.out.println("最高颜值是:" + maxScore);
    }
}
