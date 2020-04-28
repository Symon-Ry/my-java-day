package cn.ry.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(true);
        list.add(new Person());

        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
