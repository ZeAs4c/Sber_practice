package com.sbrf.demo;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /*Задача 5 */
        String  a;
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        long b=0;
        b = Long.parseLong (a);;
        int multiplier = 10;
        long sum = 0;
        for(int i=0;i<a.length();i++) {
            if(i<=1) {
                multiplier =10;
            }
            else {
                multiplier =multiplier*10;
            }
            if (i==0) {
                sum =sum+ b%10;
            }
            else {
                sum =sum+ b/multiplier%10;
            }
        }
        System.out.print("Сумма цифр числа "+a+" = "+sum);

    }
}
