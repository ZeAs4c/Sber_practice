package com.sbrf.demo;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        /*Задача 11 */
        Scanner in = new Scanner(System.in);
        System.out.println("введите первое число:");
        int a = in.nextInt();
        System.out.println("введите второе число (обязательно должно быть больше первого числа) :");
        int b = in.nextInt();

        System.out.println((int) (Math.random() * ((b + 1) - a) + a));
    }
}
