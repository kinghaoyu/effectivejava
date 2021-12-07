package com.why.p2builder;

/**
 * 描述:
 * 测试
 */
public class ConstructerBuilderTest {
    public static void main(String[] args) {
        //如何使用这个构建器创建对象呢？
        ConstructerBuilder c1 = new ConstructerBuilder.Builder("花花","北京").age(20).number(1234567).build();
        System.out.println(c1);
    }
}
