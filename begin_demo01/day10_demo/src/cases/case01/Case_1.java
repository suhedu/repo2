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
public class Case_1 {
    public static void main(String[] args) {
//1.定义一个数组
        int[] faceScores = {35, 15, 2000, 100, 10000, 4000};
        //传入数组给方法
        int max = getMax(faceScores);
        System.out.println("最大值是: " + max);
    }
    //定义一个方法接收数组,方法需要最终返回数组的最大值
    public static int getMax(int[] array){
        //3.在方法中遍历数组找到最大值
        if (array != null && array.length > 0){
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if(array[i] > max)max = array[i];
            }
            return max;
        }else{
            System.out.println("该数组没有元素存在或为null");
            return -1;
        }
    }
}
