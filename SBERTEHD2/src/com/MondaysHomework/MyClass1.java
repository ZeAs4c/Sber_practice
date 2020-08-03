package com.MondaysHomework;


import java.util.HashMap;
import java.util.Map;

public class MyClass1 <T>{
    private T num;
    private T name;
    private T oName;
    private int[] mainArray = new int[]{0, 0 ,0 ,0, 0};
    private static Map<String,String> dict = new HashMap<String,String>();
    public MyClass1(){

    }
    public void Fly(){
        System.out.println("Работает");
    }
    public T getNum(){ return num; }
    public void setNum(T num){ this.num = num; }
    public  T getName(){ return name; }
    public void setName(T name){ this.name = name; }
    public  T getoName(){ return oName; }
    public void setoName(T oName){ this.oName = oName; }
    public int [] getMainArray() {
        return mainArray;
    }
    public void setMainArray(int[] mainArray) {
        this.mainArray = mainArray;
    }

    public static void setDict(String key, String value) {
        dict.put(key, value);
    }
    public Map<String,String> getDict() {
        return dict;
    }

}

