package cn.ry.java2;

public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);

        MainTest test=new MainTest();
    }
}

class Main{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i]="arg_"+i;
            System.out.println(args[i]);
        }
    }
}
