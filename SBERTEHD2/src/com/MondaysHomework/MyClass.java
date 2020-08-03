package com.MondaysHomework;
import com.sun.org.apache.xpath.internal.objects.XObject;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        RefChecker cheker = new RefChecker();

        Object clone = cheker.createCopyObj(t);
        System.out.println(clone+" Создан клон обьекта MyClass1");
        System.out.println(t2.getName() + " / " + t.getNum());

        int[] array = new int[] {1, 2 ,3 ,4 ,5};
        MyClass1.setDict("A", "B");
        MyClass1.setDict("C", "D");
        MyClass1.setDict("E", "F");
        array = copyForName(t2, "mainArray");
        System.out.println(Arrays.toString(array));
        Map<String,String> dictionary = new HashMap<String,String>();
        dictionary = copyForName(t2, "dict");
        System.out.println(dictionary.toString());
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
    public static <T> T copyForName(Object object,String nameField) throws Exception{
        T content = null;
        Field field = object.getClass().getDeclaredField(nameField);
        field.setAccessible(true);
        content = (T) field.get(object);
        return content;
    }
}






