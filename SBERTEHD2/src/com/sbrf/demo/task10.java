package com.sbrf.demo;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        /*Задача 10 */
        Scanner in = new Scanner(System.in);
        int n ;
        int a=0;
        int b=1;
        int c;
        System.out.println("введите число:");
        n= in.nextInt();
        for(int i = 1;i<n;i++) {
            if (i==1) {
                a=0;
                System.out.println(a);
            }
            else if (i==2) {
                b=1;
                System.out.println(b);
            }
            else{
                c=a+b;
                a=b;
                b=c;
                System.out.println(c);
            }
        }
    }
}
