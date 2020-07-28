package com.sber.vector3d;

import javafx.geometry.Point3D;
import sun.security.util.Length;

class Vector3d {

    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalar_Product(Vector3d vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector3d cross_Product(Vector3d vector) {
        return new Vector3d(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    public static Vector3d[] gener_vect(int n){
        Vector3d[] vectors = new Vector3d[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector3d(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
    public Vector3d cross_Addit(Vector3d vector) {
        return new Vector3d(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }
    // метод, вычисляющий векторное вычитание
    public Vector3d cross_Subtract(Vector3d vector) {
        return new Vector3d(
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public static void main(String[] args) {
        Vector3d[] vectors = Vector3d.gener_vect(10);
        System.out.println("Вектор 0: "+ vectors[0]);
        System.out.println("Вектор 1: "+vectors[1]);
        System.out.println("Длина вектора: "+vectors[0].getLength());
        System.out.println("Скалярное произведение вектора 0 и 1: "+vectors[0].scalar_Product(vectors[1]));
        System.out.println("Векторное произведение вектора 0 и 1: "+vectors[0].cross_Product(vectors[1]));
        System.out.println("Сложение векторов 0 и 1: "+vectors[0].cross_Addit(vectors[1]));
        System.out.println("Вычитание из вектора 0 вектор 1: "+vectors[0].cross_Subtract(vectors[1]));

    }
}

