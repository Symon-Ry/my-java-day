package cn.ry.java;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void eat(){
        System.out.println("人在吃饭");
    }

    public void walk(){
        System.out.println("人在走路");
    }



    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj instanceof Person){
            Person p=(Person)obj;
            return this.age==p.age&&this.name.equals(p.name);
        }
        return false;
    }
    /*@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }*/

}
