package cn.ry.exer;

public class Person<E> {

    private E e;

    public Person(){

    }

    public void setE(E e){
        this.e=e;
    }

    public E getE(){
        return e;
    }

    public <T> T calcTT(E e){
        T t = null;
        return t;
    }

}
