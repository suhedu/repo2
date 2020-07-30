package cases.cases03;

public class _3 {
    public static void main(String[] args) {
        System.out.println(max(17,44));
        int i = 0;
        int j = -44;
        System.out.println(max(i,j));
    }
    public  static int max(int a, int b){
        int max;
        max = a > b ? a :b;
        return max;
    }
}
