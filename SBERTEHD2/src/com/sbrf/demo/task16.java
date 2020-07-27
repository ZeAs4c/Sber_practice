package com.sbrf.demo;

public class task16 {
    public static void main(String[] args) {
        /*Задача 16 */
        int ct = 0;
        for (int i = 0; i < 50000; i++) {
        if (String.valueOf(i).contains("2")) {
            ct++;
        }
        }
        System.out.println(ct);
    }
}
