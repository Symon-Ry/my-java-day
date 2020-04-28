package cn.ry.java;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(123);
        list.add(false);
        Person ming=new Person("赖新明",18);
        list.add(ming);
        list.add(new Date());
        list.add(new Person("赖奕俊",80));
        //System.out.println(list.contains(new Person()));
        //System.out.println(list.contains(ming));

        System.out.println("*****contains******");
        /*boolean contains(Object o)  对集合列表中的元素逐一调用o对象所在类的equals()方法*/
        System.out.println(list.contains(new Person("赖新明", 18)));

        System.out.println("*****containsAll******");

        List list1 = Arrays.asList(123, ming,456);
        System.out.println(list.containsAll(list1));

        System.out.println("*****remove******");

        list.remove(new Person("赖奕俊",80));
        System.out.println(list);

        System.out.println("*****removeAll******");
        //list.removeAll(list1);
        System.out.println(list);

        System.out.println("*****retainAll******");
        //boolean retainAll(Collection coll) 获取交集，并返回到当前集合
        list.retainAll(list1);
        System.out.println(list);

        System.out.println("*****equals******");

        List<Object> list2 = Arrays.asList(123, new Person("赖新明", 18));
        System.out.println(list.equals(list2));

        System.out.println("*****toArray******");
        //集合->数组
        Object[] array = list.toArray();
        for(Object o:array){
            System.out.println(o);
        }
        System.out.println("*****asList******");
        //数组->集合:调用Arrays的静态方法asList()
        List<String> list3 = Arrays.asList(new String[]{"AA", "BB", "cc"});
        System.out.println(list3);

        List<int[]> ints = Arrays.asList(new int[]{123, 456});
        System.out.println(ints);
        System.out.println(ints.size());//1

        System.out.println();
        List ints2 = Arrays.asList(123, 456);
        System.out.println(ints2);
        System.out.println(ints2.size());//2

        System.out.println();
        List ints1 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(ints1);
        System.out.println(ints1.size());//2
    }
}
