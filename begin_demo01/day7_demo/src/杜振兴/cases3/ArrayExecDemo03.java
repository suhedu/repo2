package 杜振兴.cases3;

public class ArrayExecDemo03 {
    public static void main(String[] args) {
        //定义一个长度为四的数组
        int[] arr = new int[4];
        //每个元素赋值为其索引值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
