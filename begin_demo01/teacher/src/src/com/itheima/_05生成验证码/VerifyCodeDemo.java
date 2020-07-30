package src.com.itheima._05生成验证码;

import java.util.Random;

/**
    目标：生成一个5位数的验证码
          验证码由 4个 （A-Z a-z） 和1个 （0-9）的字符组成
          数字固定在最后一位即可
          例如：gAgZ6

    提炼主干：生成5个字符的验证码，前4个全部是英文，最后一个必须是数字。

    分析步骤：
        1、定义一个字符串类型String的变量用于存储最终的5个字符。
        2、定义一个随机数对象，用于后面生成随机数。
        3、得到一个4位数的英文随机字符串
        4、得到一个1位数的数字随机字符。
        5、拼接给字符串变量result输出即可！
 */
public class VerifyCodeDemo {
    public static void main(String[] args) {
        // 1、定义一个字符串类型String的变量用于存储最终的5个字符。
        String result = "";

        // 2、定义一个随机数对象，用于后面生成随机数。
        Random r = new Random();

        // 3、得到一个4位数的英文随机字符串
        for(int i = 0; i < 4; i++ ) {
            // i = 0 1 2 3
            //    a-z  A-Z
            // 不清楚当前这个位置到底生成小写，还是大写，随机一个数字（0生成一个小写，1生一个大写）
            int data = r.nextInt(2); // 0-1
            //
            switch (data) {
                case 0:
                    // 随机一个小写字符
                    // a(97) -  z(97 + 25)  alt+enter
                    char lowerCase = (char) (r.nextInt(26) + 97);
                    result += lowerCase;
                    break;
                case 1:
                    // 随机一个大写字符
                    // A(65) -  z(65 + 25)  alt+enter
                    char upperCase = (char) (r.nextInt(26) + 65);
                    result += upperCase;
                    break;
            }
        }

        // 4、得到一个1位数的数字随机字符拼接在最后面
        result += r.nextInt(10);// result = result + r.nextInt(10)

        System.out.println(result);
    }
}
