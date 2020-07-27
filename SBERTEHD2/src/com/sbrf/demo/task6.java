package com.sbrf.demo;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /*Задача 6 */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вес Земли:");
        double weight = in.nextDouble();
        System.out.println("Масса луны = " + weight*0.17 + " кг");
    }
}
