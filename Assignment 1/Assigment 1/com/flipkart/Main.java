package com.flipkart;

import com.flipkart.bean.CustomerOperation;

public class Main {

    public static void main(String[] args) {

        {
//            SciCacl calc = new SciCacl();
//            System.out.println("add " + calc.add(1.0, 1.0));
//            System.out.println("add int " + calc.add(1, 1));
//            System.out.println("substract " + calc.substract(1.0, 1.0));
//            System.out.println("substract int" + calc.substract(1, 1));
//            System.out.println("divide " + calc.divide(1.0, 1.0));
//            System.out.println("divide int" + calc.divide(1, 1));
//            System.out.println("multiply " + calc.multiply(1.0, 1.0));
//            System.out.println("multiply int" + calc.multiply(1, 1));
//            System.out.println("acos " + calc.acos(1.0));
//            System.out.println("asin " + calc.asin(1.0));
//            System.out.println("atan " + calc.atan(1.0));
//            System.out.println("ceil " + calc.ceil(1.0));
//            System.out.println("floor " + calc.floor(1.0));
//            System.out.println("sin " + calc.sin(1.0));
//            System.out.println("cos " + calc.cos(1.0));
//            System.out.println("tan " + calc.tan(1.0));
        }

        CustomerOperation customerOperation = new CustomerOperation(5);
        for (int i = 0; i < 5; i++) {
            int id = i + 100;
            customerOperation.createCustomer(id, String.format("Name %d", id), String.format("Address %d", id));
        }
        customerOperation.listCustomerInfo();

        customerOperation.updateCustomer(100, "Updated Name 100", "Updated Address 100");
        customerOperation.updateCustomer(102, "Updated Name 102", "Updated Address 102");

        customerOperation.listCustomerInfo();

        customerOperation.deleteCustomer(100);
        customerOperation.deleteCustomer(101);
        customerOperation.deleteCustomer(104);

        customerOperation.listCustomerInfo();

    }
}
