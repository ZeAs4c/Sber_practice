package com.MondaysHomework.plugins;

import com.MondaysHomework.Plugins;
import com.MondaysHomework.RunMe;

@Plugins
public class aClass1  {
    public void foo1(String arg){
        System.out.println("aClass1 foo1 run with " + arg);
    }

    @Deprecated
    public void cool(String arg){
        System.out.println("AnyClass2 сool run with " + arg);
    }

    public void foo2(String arg){
        System.out.println("aClass1  foo2 run with " + arg);
    }

    public void foo3(String arg){
        System.out.println("aClass1  foo3 run with " + arg);
    }
}
