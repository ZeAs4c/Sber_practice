package com.sbrf.demo;

import java.util.Scanner;

public class task19 {
    /*Задача 19 */
    enum Numeral {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);
        int weight;

        Numeral(int weight) {
            this.weight = weight;
        }
    };

    public static String roman(long n) {

        if( n <= 0) {
            System.out.println("Число должно быть больше нуля!");
        }

        StringBuilder buf = new StringBuilder();

        final Numeral[] values = Numeral.values();
        for (int i = values.length - 1; i >= 0; i--) {
            while (n >= values[i].weight) {
                buf.append(values[i]);
                n -= values[i].weight;
            }
        }
        return buf.toString();
    }

    public static void test(long n) {
        System.out.println(n + " = " + roman(n));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арабское число, которое нужно перевести в римское число: ");
        int a = scanner.nextInt();
        test(a);
        }
}

