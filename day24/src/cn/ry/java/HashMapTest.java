package cn.ry.java;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap map=new HashMap();

        //map=new LinkedHashMap();

        //添加
        map.put("AA",123);
        map.put("BB",45);
        map.put(567,321);
        map.put("cc",123);
        map.put(456,123);

        //修改
        map.put("AA",321);

        //Object remove(Object key)
        //map.remove("AA");


        //clear()
        //map.clear();
        System.out.println(map.size());
        System.out.println(map);

        System.out.println();

        //public V get(Object key)
        System.out.println(map.get("AA"));

        //public boolean containsKey(Object key)
        boolean containsKey = map.containsKey("cc");
        System.out.println(containsKey);
    }
}
