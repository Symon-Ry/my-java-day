package cn.ry1.exer;

public class MyRectangle extends GeometricObject {
    private double wight;
    private double height;

    public MyRectangle(double wight,double height,String color, double weight) {
        super(color, weight);
        this.wight=wight;
        this.height=height;
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public double findArea() {
        return wight*height;
    }
}
