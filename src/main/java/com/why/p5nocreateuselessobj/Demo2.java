package com.why.p5nocreateuselessobj;

//该实现将已经确定不会改变的 BOOM_START, BOOM_END 定义为 常量，并只需在静态代码块中初始化一次
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Demo2 {
    private final Date birthDate;

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1964, Calendar.JANUARY, 1, 0,0,0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public Demo2(Date date){
        this.birthDate = date;
    }

    public boolean isBabyBoomer(){
        return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;

    }
}