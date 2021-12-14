package com.why.p8equals;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述:
 * 对称性-----忽略大小写实现
 */
public class CaseIgnore {

    private final String str;

    public CaseIgnore(String str){
        if (str == null){
            throw new NullPointerException();
        }
        this.str = str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CaseIgnore){
            return str.equalsIgnoreCase(((CaseIgnore) obj).str);
        }
        if (obj instanceof  String){
            return str.equalsIgnoreCase((String) obj);
        }
        return false;
    }

















    public static void main(String[] args) {
        CaseIgnore caseIgnoreStr = new CaseIgnore("Abc");
        String str = "abc";

        System.out.println(caseIgnoreStr.equals(str));
        System.out.println(str.equals(caseIgnoreStr));

        //当集合中存在这种对象时，用 contains 判断会出现什么情况？
        Set<CaseIgnore> setStr = new HashSet<CaseIgnore>();
        setStr.add(caseIgnoreStr);
        CaseIgnore caseIgnoreStr1 = new CaseIgnore("ABc");
        System.out.println(setStr.contains(caseIgnoreStr1));
    }
}
