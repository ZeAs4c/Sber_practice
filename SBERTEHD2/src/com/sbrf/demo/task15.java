package com.sbrf.demo;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        /*Задача 15 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите значение b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите значение c: ");
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            if(a==0&&b==0&&c==0) {
                System.out.println("на ноль делить нельзя по этому считаем, что корней нет");
            } else {
                double x;
                x = -b / (2 * a);
                System.out.println("Уравнение имеет единственный корень: x = " + x);
            }
        } else {
            System.out.println("Уравнение не имеет квадратных корней");
        }
    }
}

