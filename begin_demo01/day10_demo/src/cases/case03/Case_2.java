package cases.case03;

public class Case_2 {
    public static void main(String[] args) {
        System.out.println(compare(100,120)); // 整数默认值int
        System.out.println(compare((byte)100, (byte) 100)); //byte方法
        System.out.println(compare((short)100, (short)100)); //short方法
        System.out.println(compare(100L, 1200L)); //long方法
    }
    public static boolean compare(byte a , byte b){
        System.out.println("--------byte--------");
        return a == b;
    }


    public static boolean compare(short a , short b){
        System.out.println("--------short--------");
        return a == b ;
    }

    public static boolean compare(int a , int b){
        System.out.println("--------int--------");
        return a == b ;
    }

    public static boolean compare(long a , long b){
        System.out.println("--------long--------");
        return a == b ;
    }
}
