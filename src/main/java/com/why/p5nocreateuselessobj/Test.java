package com.why.p5nocreateuselessobj;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date now = new Date();
        Demo1 demo1 = new Demo1(now);
        int i = 1;
        long start = System.currentTimeMillis();
        //执行 100 万次
        while(i++ < 1000000){
            demo1.isBabyBoomer();
        }
        System.out.println("Demo1 耗时：" + (System.currentTimeMillis() - start) + "毫秒");





        Demo2 demo2 = new Demo2(now);
        int j = 1;
        long start1 = System.currentTimeMillis();
        //执行 100 万次
        while(j++ < 1000000){
            demo2.isBabyBoomer();
        }
        System.out.println("Demo2 耗时：" + (System.currentTimeMillis() - start1) + "毫秒");
    }
}
