package homework;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别输入三个整数:");
        int i = sc.nextInt();
        int j = sc.nextByte();
        int k = sc.nextByte();
        System.out.println("三个数中,最大的数为:" +getMax(i,j,k));
    }
    public static int getMax(int a,int b,int c){
        int max = 0;
        if (a >= b){
            if (a >= c){
                max = a;
            }else {
                max = c;
            }
        }else if (b >= c){
            max = b;
        }else{
            max = c;
        }
        return max;
    }
}
