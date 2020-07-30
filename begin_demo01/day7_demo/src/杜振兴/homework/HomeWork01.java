package 杜振兴.homework;

import java.util.Random;

public class HomeWork01 {
    public static void main(String[] args) {
        int[] a = new int[6];//创建一个长度为刘的数组
        Random s = new Random();
        int number;
        for (int i = 0; i < a.length; i++) {
            number = s.nextInt(100);//获取随机数
            a[i] = number;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
