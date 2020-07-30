package homework;

public class HomeWork05 {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        System.out.println("数组中只出现一次的元素有: " + getAllCount(arr) + "个");
    }
    public static int getCount(int[] arr,int num){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {//遍历数组,如若数组中出现元素和sum相等,计数器加一
            if(num == arr[i]){
                count ++;
            }
        }
        return count;
    }
    public static int getAllCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (getCount(arr,arr[i]) == 1){
                count ++;
            }
        }
        return count;
    }
}
