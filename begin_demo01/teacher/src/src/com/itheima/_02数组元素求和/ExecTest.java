package src.com.itheima._02数组元素求和;

/**
    目标：
        有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。求出该数组中满足要求的元素和，
 ​      要求是：求和的元素个位和十位都不能是7，并且只能是偶数

    分析步骤：
        1、定义一个数组
        2、定义一个求和变量用于累加满足要求的元素和
        3、遍历数组的每个元素
        4、元素个位和十位都不能是7，且是偶数的元素，累加给求和变量
        5、遍历结束后输出求和变量即可
 */
public class ExecTest {
    public static void main(String[] args) {
        //  1、定义一个数组
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};

        //  2、定义一个求和变量用于累加满足要求的元素和
        int sum = 0;

        //  3、遍历数组的每个元素
        for (int i = 0; i < arr.length; i++) {
            // 个数数字
            int ge = arr[i] % 10;

            // 十位数字
            int shi = arr[i] / 10 % 10;

            // 4、元素个位和十位都不能是7，且是偶数的元素，累加给求和变量
            if(ge != 7 && shi != 7 && arr[i] % 2 == 0){
                sum += arr[i];
            }
        }

        //   5、遍历结束后输出求和变量即可
        System.out.println("累加求和的结果是："+ sum);
    }
}
