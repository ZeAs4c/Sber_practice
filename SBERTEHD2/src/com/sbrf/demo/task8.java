package com.sbrf.demo;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        /*Задача 8 */
        Scanner in = new Scanner(System.in);
        long a ;
        System.out.println("введите число:");
        a= in.nextLong();
            for(int i=(int)Math.sqrt(a);i>=1;i--){
                if(a%i==0&&i!=1){
                    System.out.println("число составное");
                    break;
                }
                if(i==1) {
                    System.out.println("число простое");
                }
            }
    }

}

