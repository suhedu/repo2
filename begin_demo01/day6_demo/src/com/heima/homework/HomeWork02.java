package com.heima.homework;

public class HomeWork02 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            for (int j = 0; j < i+1; j++) {
                System.out.print("@");
            }
            i += 1;
            System.out.println();
        }
    }
}
