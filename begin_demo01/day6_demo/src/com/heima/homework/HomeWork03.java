package com.heima.homework;

public class HomeWork03 {
    public static void main(String[] args) {
        int i = 1;
        while(i < 10){
            for (int j = 1; j < i+1; j++) {
                int sum = i * j;
                System.out.print(j + "*" + i + "=" + sum + " ");
            }
            i += 1;
            System.out.println();
        }
    }
}
