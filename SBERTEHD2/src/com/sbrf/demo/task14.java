package com.sbrf.demo;
import java.util.Random;
import java.util.Scanner;

public class task14 {
        public static void main(String[] args) {
            String s,n;
            Scanner in = new Scanner(System.in);
            s = in.nextLine();
            n = in.nextLine();

            while(n!=s)
            {
                n = in.nextLine();
                System.out.println("Lose");
            }
            System.out.println("Right");
        }
}

