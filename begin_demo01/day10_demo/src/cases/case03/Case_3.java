package cases.case03;

public class Case_3 {
    public static void main(String[] args) {
        int[] ages = {5, 333, 5555, 100, 10};
        printArr(ages);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        if (arr != null && arr.length > 0){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}
