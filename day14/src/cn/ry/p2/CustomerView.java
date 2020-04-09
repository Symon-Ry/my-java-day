package cn.ry.p2;

import java.util.Scanner;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public void enterMainMenu() {


        Scanner in = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("********************project2**************");
            System.out.println();
            System.out.println("请选择：");
            System.out.println("        1.添加客户");
            System.out.println("        2.修改客户");
            System.out.println("        3.删除客户");
            System.out.println("        4.客户列表");
            System.out.println("        5.退出系统");
            System.out.println();
            System.out.println("********************project2**************");

            switch (in.next()) {
                case "1":
                    addNewCustomer();
                    break;
                case "2":
                    modifyCustomer();
                    break;
                case "3":
                    deleteCustomer();
                    break;
                case "4":
                    listAllCustomers();
                    break;
                case "5":
                    System.out.println("是否退出(Y/N)");
                    if (in.hasNext("Y") || in.hasNext("y"))
                        flag = false;
                    break;
                default:
                    System.out.println("请输入合法数字（1~5）");
            }
        } while (flag);


    }

    private void addNewCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.println("---add new customer---");
        System.out.println("    Name:");
        String name = input.next();
        System.out.println("    Age:");
        int age = input.nextInt();
        System.out.println("    Gender");
        String gender = input.next();
        if (customerList.addCustomer(new Customer(name, age, gender))) {
            System.out.println("Success!");
        } else
            System.out.println("Fail!");
    }

    private void modifyCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.println("---modify customer---");
        System.out.println("    Index:");
        int index = input.nextInt();
        System.out.println("    Name:");
        String name = input.next();
        System.out.println("    Age:");
        int age = input.nextInt();
        System.out.println("    Gender");
        String gender = input.next();
        if (customerList.replaceCustomer(index, new Customer(name, age, gender))) {
            System.out.println("Success!");
        } else
            System.out.println("Fail!");
    }

    private void deleteCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.println("---delete customer---");
        System.out.println("    Index:");
        int index = input.nextInt();
        if (customerList.deleteCustomer(index)) {
            System.out.println("Success!");
        } else
            System.out.println("Fail!");
    }

    private void listAllCustomers() {
        Customer[] allCustomers = customerList.getAllCustomers();
        System.out.println("Index" + "               " + "Name" + "             " + "Age" + "               " + "Gender");
        for (int i = 0; i < allCustomers.length; i++)
            System.out.println(i + "               " + allCustomers[i].getName() + "              " + allCustomers[i].getAge() + "                " + allCustomers[i].getGender());
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
