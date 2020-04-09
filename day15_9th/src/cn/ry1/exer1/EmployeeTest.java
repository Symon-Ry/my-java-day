package cn.ry1.exer1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee manager=new Manager();
        Employee commonEmployee=new CommonEmployee();
        manager.work();
        commonEmployee.work();
        System.out.println(manager instanceof Manager);
        System.out.println(manager instanceof CommonEmployee);
        System.out.println(manager instanceof Employee);
    }
}
