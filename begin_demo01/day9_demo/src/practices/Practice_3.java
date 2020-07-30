package practices;

import java.util.Scanner;

/*【Demo-03】按要求完成，评委打分案例:
1.控制台提示并键盘录入，总共6个评委打分，分数为[1-100]之间的int类型整数
2.除去一个最高分、一个最低分，统计该选手的平均成绩，并在控制台打印
*/
public class Practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];//定义一个数组,存放评委给出的分数
        int i = 0;
        while ( i < scores.length ) {//用数组长度作为循环是否结束判断标准
            System.out.print("请输入您打的分数(1-100): ");
            scores[i] = sc.nextInt();
            if (scores[i] > 100 || scores[i] < 1){
                System.out.println("您给出的分数非法,请重新输入!");//若数据非法,则跳出本次循环,计数器不计数
                continue;
            }
            i ++;//循环正常进行,计数器"+1"
        }
        int sum = sum(scores);
        double averageScore = (sum - max(scores) - min(scores)) * 1.0 / 4;
        System.out.println("该选手的平均分数为: " + averageScore);
    }
    public static int max(int[] arr){//定义一个方法,求出数组中的最大元素
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){//定义一个方法,求出数组中的最小元素
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int sum(int[] arr){//定义一个方法,求出数组中所有元素的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
