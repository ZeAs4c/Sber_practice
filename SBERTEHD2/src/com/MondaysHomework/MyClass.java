package com.MondaysHomework;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

class MyMain {
    public static void main(String[] args) throws Exception {
        MyClass1 t = new MyClass1();
        t.setName(1);
        t.setNum(10);
        getMet(t);
        MyClass1 t2 = new MyClass1();
        t2.setName("Василий");
        t2.setNum(10);
        copy(t,t2);
        callFly(t2);
        System.out.println(t2.getName() + " / " + t.getNum());
    }

    public static void getMet(Object a) {
        Method[] methods = a.getClass().getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }
    }
    public static void copy(Object source, Object dist) throws Exception{
        Class sourceClass = source.getClass();
        Class distClass = dist.getClass();
        Field[] sourceFields = sourceClass.getDeclaredFields();
        Field[] distClassFields = distClass.getDeclaredFields();
        for(Field sourceField:sourceFields){
            Field distField = distClass.getDeclaredField(sourceField.getName());
            if(distField!=null){
                sourceField.setAccessible(true);
                distField.setAccessible(true);
                if(distField.getType()==sourceField.getType())
                distField.set(dist, sourceField.get(source));
            }
        }
    }
    public static void callFly(Object obj) throws Exception {
        Method method = obj.getClass().getDeclaredMethod("Fly");
        method.setAccessible(true);
        method.invoke(obj);
    }
}






