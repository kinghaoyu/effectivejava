package com.why.p1createbean;

/**
 * 描述:
 * 考虑用静态工厂方法代替构造器
 *
 * @author why 0005412
 * @date 2021-11-13
 */
public class Demo1 {

    Demo1(String str1, Integer i1){

    }

    Demo1(Integer i1, String str1){

    }

    public static void main(String[] args) {
        Demo1 d = new Demo1("d", 1);
        Demo1 d1 = new Demo1(1, "df");
        System.out.println(d + " " +d1);
    }
}
