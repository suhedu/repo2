package src.com.itheima._03搜索数组元素索引;

import java.util.Scanner;

/**
    目标：​	已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，查找该数据在数组中的索引。
 ​	并在控制台输出找到的索引值。如果没有查找到，则输出-1

    查询元素的索引返回：独立功能做成方法可能更好。

    分析步骤：
        1、定义数组：{19, 28, 37, 46, 50}
        2、定义一个方法，接收数组，和搜索的元素值。
        3、调用方法，传入数组和元素值
        4、在方法中遍历数组的每个元素，如果元素值与被搜索的元素值一样返回当前索引。
        5、遍历结束后还没有返回，返回-1.

 */
public class ExecTest {
    public static void main(String[] args) {
        // a.定义数组：{19, 28, 37, 46, 50}
        int[] arr = {19, 28, 37, 46, 50, 46};
        //           0   1    2  3   4   5

        // c.调用方法获取元素的索引值返回
        Scanner sc = new Scanner(System.in);
        System.out.print("请您输入要搜索的元素值：");
        int data = sc.nextInt();

        int index = getDataIndex(arr ,data);
        System.out.println("输出索引："+index);
    }

    /**
        b.定义一个方法，接收数组，和搜索的元素值 返回元素值的索引。不存在元素返回-1
     */
    public static int getDataIndex(int[] arr, int data){
        // d.在方法中遍历数组的每个元素，如果元素值与被搜索的元素值一样返回当前索引。
        for (int i = 0; i < arr.length; i++) {
            // 元素值与被搜索的元素值一样
            if(arr[i] == data){
                return i; // 找到了此元素，直接返回索引！
            }
        }
        return -1; // 执行到这儿说明循环中查无此元素，返回-1
    }
}
