package com.flipkart.bussiness;

import com.flipkart.bean.Customer;

public class CustomerOperation {

    private final Customer customer = new Customer();
    private Customer[] customers;

    public void createCustomer(){
        customer.setCustomerId(1);
        customer.setCustomerName("Dave");
        customer.setAddress("Hyderabad");
        customer.setPinCode(1000);
    }

    public void showCustomer() {
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCustomerId());
        System.out.println(customer.getAddress());
        System.out.println(customer.getPinCode());
    }

    public void createMultipleCustomers() {
        customers  = new Customer[4];
        customers[0] =  new Customer();
        customers[0].setCustomerId(201);
        customers[0].setCustomerName("CapGemini");

        customers[1] = new Customer();
        customers[1].setCustomerId(202);
        customers[1].setCustomerName("i-flex");

        customers[2] = new Customer();
        customers[2].setCustomerId(203);
        customers[2].setCustomerName("GTL");

        customers[3] = new Customer();
        customers[3].setCustomerId(204);
        customers[3].setCustomerName("Wipro");
    }

    public void listAllCustomers() {
        for(Customer  cust : customers){

            System.out.println("details of Customer--> " +cust.getCustomerId() + " " +cust.getCustomerName()+ " " +cust.getAddress());
        }
    }

    public void updateCustomers() {

        customers[0].setCustomerName("Dave");
        customers[1].setCustomerId(14);
        customers[2].setCustomerName("Popeye");
        customers[3].setCustomerId(5151);
    }

    public void updateCustomer() {

    }

    public void deleteCustomer(int customerId) {

        int indexToDelete =-1;
        for(int i=0; i<customers.length;i++) {

            if(customers[i].getCustomerId() == customerId) {
                indexToDelete = i;
                break;
            }
        }

        if(indexToDelete!=-1) {
            Customer[] tempCustomers = new Customer[customers.length-1];
            int j=0;
            for(int i=0;i<customers.length;i++) {
                if(i!=indexToDelete) {
                    tempCustomers[j] = customers[i];
                    j+=1;
                }
            }
            customers = tempCustomers;
            tempCustomers = null;
            return ;
        }

        System.out.println("Customer Id Not found");

    }
}
