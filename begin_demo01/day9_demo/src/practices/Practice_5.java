package practices;

import java.util.Random;

/*【Demo-05】分析并完成以下需求:
1.定义方法getMax()获取数组最大值、getMin()获取最小值、getAvg()获取元素平均值
2.在main方法中定义长度为10的数组，元素使用随机数生成
3.分别调用三个方法，传递该数组，接收返回值并打印
*/
public class Practice_5 {
    public static void main(String[] args) {
        int[] sum =new int[10];
        Random s = new Random();
        for (int i = 0; i < sum.length; i++) {
            sum[i] = s.nextInt(100);
        }
        System.out.println("平均值: " + getAvg(sum));
        System.out.println("最大值: " + getMax(sum));
        System.out.println("最小值" + getMin(sum));
    }
    public static int getMax(int[] arr){//定义一个方法,求出数组中的最大元素
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){//定义一个方法,求出数组中的最小元素
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static double getAvg(int[] arr){//定义一个方法,求出数组中所有元素的平均值
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum = sum / arr.length;
        return sum;
    }
}
