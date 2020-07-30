package cases.case02;
/**
 目标：随便给你一个整型数组，可以返回他的最大值回来。

 独立功能独立成方法：基本常识。

 分析：
 1、定义数组
 2、定义一个方法接收数组，方法最终需要返回数组的最大值回来。
 3、在方法中遍历数组找出元素最大值，返回即可！
 4、传入数组给方法。

 */
public class Case_1 {
    public static void main(String[] args) {
        int[] ages = {23123, 34, 34, 222};
        printArr(ages);
    }
    public static void printArr(int[] array){
            System.out.print("[");
        if(array != null && array.length > 0){
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1){
                    System.out.print(array[i]);
                }else {
                    System.out.print(array[i] + ",");
                }
            }
            System.out.print("]");
        }
    }
}
