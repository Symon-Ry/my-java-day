package cn.ry1.exer;

public class Circle extends GeometricObject{

    private double radius;

    public Circle(double radius,String color, double weight) {
        super(color,weight);
        this.radius=radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }


}
