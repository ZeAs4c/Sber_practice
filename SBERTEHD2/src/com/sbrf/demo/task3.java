package com.sbrf.demo;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /* Задача 3*/
        boolean weekday,vocation,workers_dream;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выходной или нет (true или false)");
        weekday = in.nextBoolean();
        System.out.println("Введите отпуск или нет (true или false)");
        vocation = in.nextBoolean();
        if(!weekday == false || vocation == true) {
            workers_dream = false;
        } else {
            workers_dream=true;
        }
        System.out.print("Спать = "+workers_dream);

    }
}
