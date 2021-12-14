package com.why.p9hashcode;

public class Demo {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("abc");
        System.out.println(str.equals(str2));
        System.out.println(str.hashCode() == str2.hashCode());
        System.out.println(str == str2);
    }
}
