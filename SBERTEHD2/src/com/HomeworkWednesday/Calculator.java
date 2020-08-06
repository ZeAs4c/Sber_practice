package com.HomeworkWednesday;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;  // ERROR (специально допущенна ошибка для задание 2 под b)
    }
    public int div(int a, int b) {
        return a % b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
}
