package practices;

import java.util.Scanner;

/*【Demo-04】分析并完成以下需求:
1.定义一个方法getSum(int start, int end){ … }，该方法完成获取[start,end]范围中的数据的和
2.在main方法中键盘录入start和end(start小于end)，调用方法传递参数，打印结果
*/
public class Practice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个开始数: ");
        int start = sc.nextInt();
        System.out.println("请输入一个结束数: ");
        int end = sc.nextInt();
        System.out.println("您输入的两个数之间的和为(包括两个数本身): " + getSum(start,end));
    }
    public static int getSum(int start,int end){
        int sum = 0;
        if(start > end){
            for (int i = end; i <= start; i++) {
                sum += i;
            }
        }else{
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        }
        return sum;
    }
}
