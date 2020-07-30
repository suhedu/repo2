package cases.cases03;

public class _1 {
    public static void main(String[] args) {
        printHelloWorld(10);
        System.out.println("_____________");
        printHelloWorld(9);
    }
    public static  void printHelloWorld(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Helloworld");
        }
    }
}
