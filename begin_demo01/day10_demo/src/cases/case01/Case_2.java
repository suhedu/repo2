package cases.case01;
/**
 目标：随便给你一个整型数组，可以返回他的最大值回来。

 独立功能独立成方法：基本常识。

 分析：
 1、定义数组
 2、定义一个方法接收数组，方法最终需要返回数组的最大值回来。
 3、在方法中遍历数组找出元素最大值，返回即可！
 4、传入数组给方法。

 */

public class Case_2 {
    public static void main(String[] args) {
        int[] ages = {10, 20, 30, 40, 50, 60};
        printArr(ages);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        if (arr != null && arr.length > 0){
            for (int i = 0; i < arr.length; i++) {
                /*if(i == arr.length){
                    System.out.print(arr[i]);
                }else {
                    System.out.print(arr[i] + ",");
                }*/
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
