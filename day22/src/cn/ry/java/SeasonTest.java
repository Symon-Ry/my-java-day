package cn.ry.java;

public class SeasonTest {
    public static void main(String[] args) {

        Season spring = Season.SPRING;
        spring.show();

    }
}

interface Info{
    void show();
}

enum Season implements Info{
    //1、提供当前枚举类的对象，多个对象之间用","隔开，末尾对象用";"结束

    SPRING("春天"){
        @Override
        public void show() {
            System.out.println("春天来了");
        }
    },
    SUMMER("夏天"){
        @Override
        public void show() {
            System.out.println("夏天来了");
        }
    },
    AUTUMN("秋天"){
        @Override
        public void show() {
            System.out.println("秋天来了");
        }
    },
    WINTER("冬天"){
        @Override
        public void show() {
            System.out.println("冬天来了");
        }
    };

    //声明Season对象的属性:private final修饰
    private final String seasonName;

    //3、私有化类的构造器，并给对象属性赋值
    private Season(String seasonName){
        this.seasonName=seasonName;
    }
}
