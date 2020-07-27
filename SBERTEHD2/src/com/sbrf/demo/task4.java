package com.sbrf.demo;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /*Задача 4 */

        String  a;
        Scanner in = new Scanner(System.in);
        System.out.println("введите строку:");
        a = in.nextLine();
        boolean flag = true;
        for(int i=0;i<a.length()/2;i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if(flag==true) {
            System.out.print("палиндром");
        } else {
            System.out.print("не палиндром");
        }
    }
}
