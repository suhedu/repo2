package pratices;

import java.util.Random;

public class _2 {
    public static void main(String[] args) {
        Random s = new Random();
        int num = s.nextInt(91) + 10;
        int count = 0;
        for (int i = 10; i <= num; i++) {
            if (i % 2 ==1){
                //System.out.print(i + " ");
                count ++;
            }
        }
        System.out.println("奇数数的个数为: " +count);
    }
}
