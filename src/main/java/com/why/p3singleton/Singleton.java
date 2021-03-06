package com.why.p3singleton;

/**
 * 描述:
 * 在内部类被加载和初始化时，才创建 INSTANCE 实例对象
 * 静态内部类不会自动随着外部类的加载和初始化而初始化，它是单独加载和初始化的。
 * 因为是在内部类加载和初始化时，创建的，因此是线程安全的。
 */
public class Singleton {

    private Singleton(){
        System.out.println("单例类被初始化了。。。");
    }

    public static String getStr(){
        return "weioewoiqruow";
    }

    private static class Inner{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return Inner.INSTANCE;
    }

}
