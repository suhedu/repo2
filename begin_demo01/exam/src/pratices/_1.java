package pratices;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您消费的金额: ");
        double price = sc.nextDouble();
        System.out.println("优惠后的金额是: " +disCountPrice(price) );
    }
    public static double disCountPrice(double a){
        double disCountPrice = 0;
        if (a < 0){
            System.out.println("您的数据非法");
            return -1;
        }else {
            if (a >= 2000){
                disCountPrice = a * 0.7;
            }else if (a <= 1000 && a < 2000){
                disCountPrice = a * 0.8;
            }else if (a < 1000 && a >= 500){
                disCountPrice = a * 0.95;
            }else {
                disCountPrice = a;
            }
        }
        return disCountPrice;
    }
}
