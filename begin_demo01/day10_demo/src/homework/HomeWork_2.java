package homework;

public class HomeWork_2 {
    public static void main(String[] args) {
    int[] num = {11, 22, 33, 44, 55, 66};
    changArr(num, 1, 5);
    System.out.print("{");
        for (int i = 0; i < num.length; i++) {
            System.out.print(i == num.length - 1 ? num[i] : num[i] + ",");
        }
            System.out.print("}");
    }
    public static void changArr(int[] arr, int a,int b){
        if(arr != null && arr.length > 1 && a > -1 && b > -1 && a != b && a < arr.length && b < arr.length){
            int i = 0;
            i = arr[a];
            arr[a] = arr[b];
            arr[b] = i;
        }else {
            System.out.println("您输入的数据非法!");
        }
    }
}
