package com.itheima._01方法重载的详解;
/**
    目标：识别方法重载的调用机制。（面试常见，无实际意义）
 */
public class MethodExecDemo03 {
    public static void main(String[] args) {
        System.out.println(compare(100,120)); // 整数默认值int
        System.out.println(compare((byte)100, (byte) 100)); //byte方法
        System.out.println(compare((short)100, (short)100)); //short方法
        System.out.println(compare(100L, 100L)); //long方法
    }

    // 需求：调用方法，传入两个整数，返回比较的结果是：ture/false
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
