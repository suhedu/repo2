package practices;

import java.util.Random;

/*【Demo-06】分析并完成以下需求:
1.定义一个方法getCount(int[] arr) ，获取一个指定数组中，小于平均数的元素个数并返回
2.在main方法中，使用随机数给一个长度为8的int类型数组赋值，元素数据范围为[7,78]
3.调用getCount()方法，接收返回值并打印
*/
public class Practice_6 {
    public static void main(String[] args) {
        Random s = new Random();
        int[] num = new int[8];
        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextInt(72) + 7;
        }
        System.out.println("数组中小于数组元素平均值的元素的个数为: " + getCount(num));
    }
    public static int  getCount(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count ++;
            }
        }
        return count;
    }
}
