package cn.ry.java;


public class PersonTest {
    public static void main(String[] args) {
        /*Person p=new Person("tom",12);
        Man p1=new Man("tom",12);
        System.out.println(p1.equals(p));*/

        int[] arr=new int[]{1,2,3};
        for(int i:arr){
            System.out.println(i);
        }

        System.out.println(arr.getClass().getSuperclass());
    }
}
