package com.HomeworkWednesday.task2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quadratic_equation {
    public List<Double> quadraticEquation(double a, double b, double c) {
        List<Double> arr = new ArrayList<>();
        double d = (b*b) - 4*a*c;
        double x1,x2;
        if (a == 0 && b == 0 && c == 0 || a == 0) {
            return arr;
        } else if(d > 0){
            x1 = ( (-b) + Math.sqrt(d) )/ (2*a);
            x2 = ( (-b) - Math.sqrt(d) )/ (2*a);
            arr.add(x1);
            arr.add(x2);
            Collections.sort(arr);
            return arr;
        }
        if(d == 0 && (a!=0 || b!=0 || c!=0) ) {
            x1 = ( (-b) + Math.sqrt(d) )/ (2*a);
            arr.add(x1);
            return arr;
        }
        else
            return arr;
    }

}


