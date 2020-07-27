package com.sbrf.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        /*Задача 18 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите значение  b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите значение c: ");
        double c = scanner.nextDouble();
        double maxside = 0;

        ArrayList list = new ArrayList<>();

        list.add(a);

        list.add(b);

        list.add(c);
        maxside = (double) Collections.max(list);
        if(c >= a + b) {
            System.out.println("Треугольник невозможен");
        }else if(a*a + b*b - c*c>0) {
            System.out.println("Треугольник остроугольный");
        }else if(a*a + b*b - c*c == 0) {
            System.out.println("Треугольник прямоугольный");
        }else if(a*a + b*b - c*c < 0) {
            System.out.println("Треугольник тупоугольный");
        }
    }
}

