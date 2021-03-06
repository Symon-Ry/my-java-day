package cn.ry.java;

import java.util.Objects;

public class Person {

    public Person() {
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    private String name;

    private int age;

    @Override
    public boolean equals(Object o) {
        System.out.println("Person equals()...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
