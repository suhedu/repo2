package com.heima.homework;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.print("请输入第三个整数(1-4)：");
        int num3 = sc.nextInt();
        switch (num3){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 -num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("您输入的第三个整数非法！");
        }
    }
}
