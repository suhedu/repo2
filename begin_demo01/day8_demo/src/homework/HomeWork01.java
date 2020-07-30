package homework;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个小数: ");
        double num = sc.nextDouble();
        System.out.println("您输入的小数的绝对值为:" +absoluteValue(num));
    }
    public static double absoluteValue(double n){
        double a ;
        if (n >= 0){
            a = n;
        }else{
            a = -n;
        }
        return a;
        }
}
