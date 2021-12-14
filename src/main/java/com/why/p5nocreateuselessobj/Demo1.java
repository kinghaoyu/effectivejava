package com.why.p5nocreateuselessobj;

//该实现方法，在每次调 isBabyBoomer() 方法时，都会创建一个 Calendar 、一个 TimeZone 和两个 Date 实例，
//这是不必要的
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Demo1 {
    private final Date birthDate;

    public Demo1(Date date){
        this.birthDate = date;
    }

    public boolean isBabyBoomer(){
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1964, Calendar.JANUARY, 1, 0,0,0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1,0,0,0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;

    }

}