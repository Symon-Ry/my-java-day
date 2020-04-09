package cn.ry1.exer2;

/*定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
型,name,number,birthday。当键盘输入本月月份值时，如果本
月是某个Employee对象的生日，还要输出增加工资信息。*/

import java.util.Calendar;
import java.util.Scanner;

public class EmployeeSystem {

    public static void main(String[] args) {

        //方式一：
        // System.out.println("请输入当前的月份：");
        // int month=new Scanner(System.in).nextInt();
        //方式二：
        int month=Calendar.getInstance().get(Calendar.MONTH);


        Employee[] employees = new Employee[2];
        employees[0]=new SalariedEmployee("张三",1001,new MyDate(1998,03,13),10000);
        employees[1]=new HourlyEmployee("李四",1002,new MyDate(2000,2,30),300,60);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]+""+employees[i].earnings());
            if(month+1==employees[i].getBirthday().getMonth()){
                System.out.println("Happy birthday!Money+100");
            }
        }

    }
}
