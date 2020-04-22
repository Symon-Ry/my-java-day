package cn.ry.java;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);

        calendar.set(Calendar.YEAR,2001);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.HOUR,1);
        System.out.println(calendar.getTime());

        calendar.setTime(time);
        System.out.println(calendar.getTime());
    }
}
