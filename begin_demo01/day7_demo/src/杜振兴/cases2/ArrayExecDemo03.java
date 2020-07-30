package 杜振兴.cases2;
/*
    目标：数组练习题-求最值。

    分析步骤：
        1.定义一个整型数组存储全部人的颜值。
        2.定义一个变量存储最终的最大值，变量的初始值必须使用数组中的某个元素作为参照，建议用数组第一个元素！
        3.遍历数组中全部人的颜值。
        4.拿着当前遍历的元素值依次与最大值变量的值进行比较，如果比最大值变量的值大，替换最大值变量的值为当前值！*/
public class ArrayExecDemo03 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
