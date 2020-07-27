package com.sbrf.demo;

import java.util.Random;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Random rand = new Random();
        /*Задача 13 */
        Scanner in = new Scanner(System.in);
        int n,num=0,h;
        System.out.println("Введите размер массива: ");
        n=in.nextInt();
        System.out.println(" ");
        double[] myArray; // объявление массива
        myArray = new double[n];
        for (int i=0;i<n;i++)
        {
            myArray[i]=(int) rand.nextInt(50);
        }
        while(num!=3) {
            System.out.println("ИНТЕРФЕЙС:\n1 -  Вывести массив;\n2 - Увеличить элемент массива на 10%;\n3 - ВЫХОД;");
            System.out.println(" ");
            num = in.nextInt();
            if(num<1 || num>3) {
                System.out.println("Выберите варианты от 1 до 3 включительно!!!");
            }
            else {
                switch (num) {
                    case 1:
                        for (int i = 0; i < n; i++) {
                            System.out.print(myArray[i] + " ");
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("выберите элемент массива размером " + n + " :");

                        h = in.nextInt();
                        System.out.println(" ");
                        myArray[h] = myArray[h] + myArray[h] * 0.1;
                        break;
                    case 3:
                        break;
                }
            }
        }
    }
}
