package com.sbrf.demo;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        /*Задача 7 */
        Scanner in = new Scanner(System.in);
        long a ;
        a= in.nextLong();
        for(int i = 1;i<=a;i++)
        {
            if(i==1)
            {
                System.out.println("Все положительные делители числа "+a);
            }
            if(a%i==0) {
                System.out.println(i);
            }
        }
    }
}
