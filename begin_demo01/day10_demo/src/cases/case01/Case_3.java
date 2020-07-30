package cases.case01;
/*目标：识别方法重载的调用机制。（面试常见，无实际意义）*/
public class Case_3 {
    public static void main(String[] args) {
        System.out.println(compare(100,200));
        System.out.println(compare((byte)100, (byte)200));
        System.out.println(compare((short)10, (short)5));
        System.out.println(compare(10L, 2000L));
    }
    //需求:调用方法,传入两个整数,返回比较的结果
    public static boolean compare(byte a, byte b){
        System.out.println("byte_______________");
        return  a==b;
    }
    public static boolean compare(short a, short b){
        System.out.println("short____________");
        return a==b;
    }
    public static boolean compare(int a, int b){
        System.out.println("int_____________");
        return a==b;
    }
    public static boolean compare(long a, long b){
        System.out.println("long___________");
        return a==b;
    }
}
