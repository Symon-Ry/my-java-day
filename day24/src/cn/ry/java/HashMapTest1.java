package cn.ry.java;

import java.util.*;


/*
 元视图操作的方法：
 Set keySet()：返回所有key构成的Set集合
 Collection values()：返回所有value构成的Collection集合
 Set entrySet()：返回所有key-value对构成的Set集合

 */
public class HashMapTest1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("AA",123);
        map.put("BB",45);
        map.put(567,321);
        map.put("cc",123);
        map.put(456,123);

        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        Collection values = map.values();
        for (Object obj:
             values) {
            System.out.println(obj);
        }

        //遍历方式一：
        System.out.println();
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Object next = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry=(Map.Entry)next;
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }

        //遍历方式二：
        System.out.println();
        Iterator iterator2 = keySet.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key+"==="+value);
        }
    }
}
