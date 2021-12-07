package com.why.p2builder;

/**
 * 描述:
 * 构建器模式实现
 */
public class ConstructerBuilder {
    private final String name;
    private final String address;
    private final int age;
    private final int number;
    /**
     * 私有化构造器，并将构建器作为参数传进去
     */
    private ConstructerBuilder(Builder builder){
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.number = builder.number;
    }
    /**
     * public 静态的构建器，直接使用 new 外部类名.Builer() 就可以创建 构建器
     */
    public static class Builder{
        private final String name;
        private final String address;
        private int age;
        private int number;

        /**
         * 构建器的构造器参数，可以是一些必传的参数
         * @param name
         * @param address
         */
        public Builder(String name, String address){
            this.name = name;
            this.address = address;
        }

        /**
         * 选填的参数可以该类型的方法设置，返回当前 builder 对象，可以实现 连续 点 . 的效果
         * @param age
         * @return
         */
        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder number(int number){
            this.number = number;
            return this;
        }

        /**
         * 使用 公共的 builder() 方法来调外部类的私有构造器，并将当前构建器作为参数传进去
         * @return
         */
        public ConstructerBuilder build(){
            return new ConstructerBuilder(this);
        }
    }
}
