package com.sbrf.demo;

public class task9 {
    public static void main(String[] args) {
        /*Задача 9 */
        for(int j=2;j<100;j++) {
            for (int i = (int) Math.sqrt(j); i >= 1; i--) {
                if (j % i == 0 && i != 1) {
                    break;
                }
                if (i == 1) {
                    System.out.println(j+" число простое");
                }
            }
        }
    }
}
