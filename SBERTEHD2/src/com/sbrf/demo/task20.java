package com.sbrf.demo;
import java.util.*;


public class task20 {
    public static class Foo{
        int arr;
        float avg;
        String surname;
        Foo(String name,float avg){
            this.surname = name;
            this.avg = avg;
            int sum = 0;

        }
    }
    public static float setAvg(int[] arr) {
        float avg;
        int sum = 0;
        for (int i = 0; i < arr.length; ++i)
            sum += arr[i];
        return avg = sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(какое колличество фамилий от 1-5 хотите ввести):");
        int n = scanner.nextInt();
        int rand = (int) (Math.random() * (5 - 1) + 1);
        HashMap<String,Float> peopleq = new HashMap<>();
        float avg=0;
        for(int i = 0; i < n; ++i) {
            int[] temp = new int[rand];
            System.out.println("Введите Фамилию");
            String name = scanner.next();
            System.out.println("Введите " + rand + " числa(о)");
            for (int j = 0; j < rand; ++j)
                temp[j] = scanner.nextInt();
            avg = setAvg(temp);
            peopleq.put(name, avg);
        }
        peopleq.entrySet().stream()
                .sorted(Map.Entry.<String,Float>comparingByValue().reversed());
        ArrayList<String> values = new ArrayList<>(peopleq.keySet());
        for (String str  : values) {
            System.out.println("Значения в порядке убывания слева направо: " + values);
            break;
        }
    }
}


