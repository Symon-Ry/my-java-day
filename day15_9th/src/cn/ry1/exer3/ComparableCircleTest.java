package cn.ry1.exer3;

public class ComparableCircleTest{
    public static void main(String[] args) {
        ComparableCircle c1=new ComparableCircle(3.4);
        ComparableCircle c2=new ComparableCircle(3.6);
        int compareValue=c1.comparableTo(c2);
        if(compareValue > 0){
            System.out.println("c1对象大");
        }else if(compareValue < 0){
            System.out.println("c2对象大");
        }else{
            System.out.println("c1与c2一样大");
        }

        int comparableValue1=c1.comparableTo(new String("aa"));
        System.out.println(comparableValue1);

    }
}
