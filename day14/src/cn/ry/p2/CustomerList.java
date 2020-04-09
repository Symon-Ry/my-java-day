package cn.ry.p2;

public class CustomerList {
    private Customer[] customers;
    private int total=0;


    public CustomerList(int totalCustomer){
        customers=new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer){
        if(total>=customers.length)
            return false;
        customers[total++]=customer;
        return true;
    }

    public boolean replaceCustomer(int index,Customer customer){
        if(index>total-1||index<0) return false;
        customers[index]=customer;
        return true;
    }

    public boolean deleteCustomer(int index){
        if(index>total-1||index<0) return false;
        for(int i=index;i<total-1;i++){
            customers[i]=customers[i+1];
        }
        customers[--total]=null;
        return true;
    }

    public Customer[] getAllCustomers(){
        Customer[] cust=new Customer[total];
        for(int i=0;i<total;i++){
            cust[i]=customers[i];
        }
        return cust;
    }
    public Customer getCustomer(int index){
        if(index>total-1||index<0) return null;
        return customers[index];
    }
    public int getTotal(){
        return total;
    }


}
