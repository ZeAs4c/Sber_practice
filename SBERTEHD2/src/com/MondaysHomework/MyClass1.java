package com.MondaysHomework;


public class MyClass1 <T>{
    private T num;
    private T name;
    private T oName;
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


}

