package com.itheima._06数组的遍历;

/**
    拓展：动态，循环的方式为数组赋值。

    需求：
        1.定一个长度为4的数组，
        2.每个元素赋值成其索引值：0  1  2  3
        3.遍历出该数组的每个元素。
 */
public class ArrayExecDemo03 {
    public static void main(String[] args) {
        // 1.定一个长度为4的数组，
        int[] arr = new int[4];   // [0 , 0 , 0,  0]
        //                            0  1    2  3

        // 2.每个元素赋值成其索引值：0  1  2  3 4
        // 循环赋值：了解即可！
        for(int i = 0 ; i < arr.length ; i++ ){
            // i = 0 1 2 3
            arr[i] = i ; // 赋值！
        }

        //            [0 , 1 , 2,  3]
        //             0  1    2  3
        // 3.遍历
        for(int i = 0 ; i < arr.length ; i++ ){
            // i = 0 1 2 3
            System.out.println(arr[i]);
        }
    }
}
