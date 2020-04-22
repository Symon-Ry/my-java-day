package cn.ry.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        //DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");


        Date date = new Date();
        System.out.println(format.format(date));

        String str="2019-03-09 12:00:00";

        Date date1=null;
        try {
            date1= format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        java.sql.Date dateSql=new java.sql.Date(date1.getTime());
        System.out.println(dateSql);

    }
}
