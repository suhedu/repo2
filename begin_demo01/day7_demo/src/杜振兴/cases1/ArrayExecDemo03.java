package 杜振兴.cases1;
/*
    拓展：动态，循环的方式为数组赋值。

    需求：
        1.定一个长度为4的数组，
        2.每个元素赋值成其索引值：0  1  2  3
        3.遍历出该数组的每个元素。*/
public class ArrayExecDemo03 {
    public static void main(String[] args) {
        //定义一个长度为四的数组
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
