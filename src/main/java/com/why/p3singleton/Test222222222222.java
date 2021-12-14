package com.why.p3singleton;

public class Test222222222222 {

    public static void main(String[] args) {
        Child child = null;
        System.out.println(child.parentStr);
    }
}

class Parent1{
    //isFinal ?
    public static String parentStr = "parent1";

    static {
        System.out.println("parent1 init....");
    }
}

class Child extends Parent1{
    public static String childStr = "child1";

    static {
        System.out.println("child1 init....");
    }
}
