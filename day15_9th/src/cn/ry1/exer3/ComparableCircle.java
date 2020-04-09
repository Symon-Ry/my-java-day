package cn.ry1.exer3;

public class ComparableCircle extends Circle
        implements ComparableObject{
    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int comparableTo(Object o) {
        if(this==o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c=(ComparableCircle)o;
            return this.getRadius().compareTo(c.getRadius());
        }else
            throw new RuntimeException("传入的数据类型不匹配");
    }
}
