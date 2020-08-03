package com.MondaysHomework;

public class  MyClass2<T> {
    private T num ;
    private T name;


    public MyClass2(){

    }
    public MyClass2(T num,T name){
        this.num = num;
        this.name = name;
    }
    public T getNum(){ return num; }
    public void setNum(T num){ this.num = num; }
    public T getName(){ return name; }
    public void setName(T name){ this.name = name; }
}