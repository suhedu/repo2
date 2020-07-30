package practices;

import java.util.Random;

/*
    【Demo-01】分析并完成以下需求:
    1.获取一个[10,100]之间的int类型随机数num，统计[10,num]之间，奇数的个数
    2.最终在控制台打印所有的奇数，和个数
*/
public class Practice_1 {
    public static void main(String[] args) {
        Random s = new Random();
        int num = s.nextInt(91) + 10;
        int count = 0;
        for (int i = 10; i <= num; i++) {
            if (i % 2 ==1){
                System.out.print(i + " ");
                count ++;
            }
        }
        System.out.println("奇数数的个数为: " +count);
    }
}
