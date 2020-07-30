package homework;

import java.util.Random;

public class HomeWork04 {
    public static void main(String[] args) {
        Random s = new Random();
        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = s.nextInt(31) + 50;//生成50-80的随机数,并依次赋值给数组的每个元素
        }
        int sum = 0;//定义一个变量求满足要求的元素和
        for (int i = 0; i < 6; i++) {
            int j = num[i];//定义一个变量接收数组元素,减少程序对数组的调用
            if (j / 10 != 7 && j % 10 != 7 && j % 2 == 0){
                sum += j;//将满足条件的数求和
                //System.out.println(j);
            }
        }
        System.out.println("数组中,满足要求的元素的和为: " + sum);
    }
}
