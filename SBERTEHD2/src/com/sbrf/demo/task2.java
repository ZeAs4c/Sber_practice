package com.sbrf.demo;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*Задача 2 */
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a");
        a=in.nextInt();
        System.out.println("Введите число b");
        b=in.nextInt();
        if(b==0) {
            System.out.print("Делить на ноль нельзя!");
        }
        else {
            int c = 0, g = 0;
            c = a / b;
            g = a % b;
            System.out.print(a + " / " + b + " = " + c + " и " + g + " в остатке");
        }
    }

}
