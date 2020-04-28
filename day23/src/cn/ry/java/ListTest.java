package cn.ry.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(true);
        list.add(new Person());
        list.add(2);
        System.out.println(list);

        System.out.println("*******void add(int index,Object ele)*******");

        list.add(2,789);
        System.out.println(list);

        System.out.println("*******void addAll(int index,Collection ele)*******");

        List list1 = Arrays.asList("AA", "BB", 33);
        list.addAll(list1);
        System.out.println(list);
        list.add(list1);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("*******int indexOf(Object obj)*******");

        int of = list.indexOf(33);
        int of1 = list.indexOf(44);
        System.out.println(of);
        System.out.println(of1);

        System.out.println("*******int lastIndexOf(Object obj)*******");

        System.out.println(list.lastIndexOf(33));

        System.out.println("*******Object remove(int index)*******");

        Object o = list.remove(2);
        System.out.println(o);
        System.out.println(list);
        boolean remove = list.remove(new Integer(2));
        System.out.println(list);

        System.out.println("*******Object set(int index,Object ele)*******");

        Object set = list.set(2, 8910);
        System.out.println(set);
        System.out.println(list);

        System.out.println("*******Object subList(int fromIndex,int toIndex)*******");

        List subList = list.subList(3, list.size());
        System.out.println(subList);
    }
}
