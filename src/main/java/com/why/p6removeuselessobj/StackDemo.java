package com.why.p6removeuselessobj;

import java.util.Arrays;
import java.util.Date;
import java.util.EmptyStackException;

public class StackDemo {

    private Object[] elements;

    private int size = 0;

    private static final int DEFAULT_INIT_CAPACITY = 16;

    public StackDemo(){
        elements = new Object[DEFAULT_INIT_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if (size == 0){
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    private void ensureCapacity(){
        if (elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo();
        stackDemo.push(new Date());
        Object pop = stackDemo.pop();
        System.out.println(pop);
        System.out.println(stackDemo.elements[0]);

    }
}
