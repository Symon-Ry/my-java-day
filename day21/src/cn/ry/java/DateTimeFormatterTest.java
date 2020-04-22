package cn.ry.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //String -->LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDate parse = LocalDate.parse("1998-03-09 11:53:12",formatter);
        System.out.println(parse);
    }
}
