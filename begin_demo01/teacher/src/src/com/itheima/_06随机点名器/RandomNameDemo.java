package src.com.itheima._06随机点名器;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
     目标：随机点名器。
     键盘录入班级人数,  根据班级人数录入班级学员姓名
     从录入的学员姓名中, 随机取出一个, 并打印在控制台：说她\他可以点歌了。

     分析步骤：
        1、让用户输入学生人数。
        2、创建同样大小的数组，存储后续录入的学生名称
        3、录入学生名称存入到数组中
        4、随机一个索引
        5、取出索引对应的学生名称，让她\他点歌
 */
public class RandomNameDemo {
    public static void main(String[] args) {
        // 1、让用户输入学生人数。
        Scanner sc = new Scanner(System.in);
        System.out.print("请您输入您的学生总数: ");
        int number = sc.nextInt(); //

        // 2、创建同样大小的数组，存储后续录入的学生名称
        String[] names = new String[number];

        // 3、录入学生名称存入到数组中
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < names.length; i++ ) {
            // i = 0 1 2 3 4
//            if(i == names.length - 1){
//                System.out.println("请您输入最后一个学生名称：");
//            }else{
//                System.out.println("请您输入第" + (i+1) +"个学生名称：");
//            }
            System.out.print(i == names.length - 1?"请您输入最后一个学生名称：":"请您输入第" + (i+1) +"个学生名称：");
            names[i] = sc1.nextLine(); // 录入名称赋值给数组！
        }
        System.out.println("全部学生："+ Arrays.toString(names)); // 暂时了解！

        // 定义一个死循环，去判断用户是否需要继续抽奖！
        while(true){
            // 4、随机一个索引： 范围必须是数组的 0 - 长度-1
            Random r = new Random();
            int randomIndex = r.nextInt(names.length); // 0 - names.length-1

            // 5、取出索引对应的学生名称，让她\他点歌
            System.out.println("请："+ names[randomIndex] +"点歌！");
            Scanner sc2 = new Scanner(System.in);
            System.out.println("确认点吗？y/n");
            String command = sc2.nextLine();
            switch (command){
                case "y":
                    System.out.println("点好了");
                    return; // 点好了，直接通过return结束整个方法，因为点好了，没有必须继续抽奖了！
                case "n":
                    System.out.println("下一个！");
                    break;
            }
        }
    }
}
