package com.itheima.exam;

import java.util.Scanner;

/*21、

请设计一个程序可以按照通话时间计算通话费用：


需求：提示用户键盘录入通话秒数，通话费用按分钟计算，前一分钟每分钟0.5元，超过一分钟的部分按每分钟0.3元计费。
不足一分钟时按一分钟收费（如：通话2分15秒，按照3分钟收费）。示例如下：


请输入通话秒数:
520
本次通话花费2.9元

*/
public class FirstExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入通话的秒数: ");
        int seconds = sc.nextInt();
        int minutes = seconds / 60 + 1;
        double price = 0;
        if(minutes <= 1){
            price = 0.5;
        }else {
            price = (minutes - 1) * 0.3 + 0.5;
        }
        System.out.println("本次通话花费" + price + "元");
    }
}
