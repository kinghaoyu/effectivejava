package com.why.p3singleton;

/**
 * 描述:
 */
public class S1Test {
    public static void main(String[] args) {
        String str = Singleton.getStr();
        System.out.println(str);

        Singleton instance = Singleton.getInstance();
    }
}
