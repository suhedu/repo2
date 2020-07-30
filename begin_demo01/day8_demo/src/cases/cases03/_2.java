package cases.cases03;

public class _2 {
    public static void main(String[] args) {
        System.out.println(sum(9));
        long result = sum(100);
        System.out.println(result);
        System.out.println("1-1000的和: "+ sum(1000));
    }
    public static long sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
