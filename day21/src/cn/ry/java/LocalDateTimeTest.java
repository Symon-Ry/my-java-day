package cn.ry.java;

import java.time.LocalDateTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2032, 3, 9, 12, 32);
        System.out.println(of);
        int dayOfMonth = time.getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println(time.getHour());

        LocalDateTime time1 = time.withDayOfMonth(1);
        System.out.println(time1);
        LocalDateTime time2 = time1.withHour(19);
        System.out.println(time2);


    }
}
