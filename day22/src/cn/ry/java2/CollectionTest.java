package cn.ry.java2;

import java.util.ArrayList;
import java.util.Date;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(new Thread());
        list.add(123);
        list.add(new Date());
        System.out.println(list);
        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());

        System.out.println(list.isEmpty());
    }
}
