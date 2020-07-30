package homework;

public class HomeWork03 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,3,2,1};
        System.out.println("[1,2,3,4,3,2,1]是否对称:" + isSym(a));
    }
    public static boolean isSym(int[] arr){
        int i = 0;
        int l = arr.length;
        while (i < l / 2){
            if(arr[i] != arr[l - i -1]){//如果出现数组中对称位置的元素不相等,则return false
                return false;
            }
            i ++;
        }
        return true;//循环结束,数组元素对称,return true
    }
}
