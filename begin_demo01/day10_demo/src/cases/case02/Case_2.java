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
public class Case_2 {
    public static void main(String[] args) {
        int[] faceScores = {5, 11, 100 ,100 ,1111};
        int max = getMax(faceScores);
        System.out.println("最大值数: " + getMax(faceScores));
    }
    public static int getMax(int[] array){
        if (array != null && array.length > 0){
        int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if(array[i] > max)max = array[i];
            }
            return max;
        }else {
            System.out.println("该数组为null或没有元素");
            return -1;
        }
    }
}
