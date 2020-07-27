package com.sbrf.demo;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        /*Задача 12 */
        Scanner in = new Scanner(System.in);

        String s,sana;
        int a;

        s = in.nextLine();
        a = in.nextInt();

        sana = s.substring(0, a) + s.substring(a+1);
        System.out.println(sana);
    }
}
