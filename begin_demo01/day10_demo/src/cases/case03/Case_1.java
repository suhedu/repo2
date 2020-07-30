package cases.case03;

public class Case_1 {
    public static void main(String[] args) {
        int[] faceScorces = {123123, 22, 3, 44, 55555};
        System.out.println("最大值为: " + getMax(faceScorces));
    }
    public static int getMax(int[] arr){
        if(arr != null && arr.length > 0){
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i])max = arr[i];
            }
            return max;
        }else {
            System.out.println("数组为null或无元素");
            return -1;
        }
    }
}

