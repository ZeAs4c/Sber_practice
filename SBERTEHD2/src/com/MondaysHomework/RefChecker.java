package com.MondaysHomework;

public class RefChecker {
    private Object name;
    public Object createCopyObj(Object obj) throws IllegalAccessException, InstantiationException {
        Class clazz = obj.getClass();
        return clazz.newInstance();
    }
    public Object getName(){ return name; }
}
