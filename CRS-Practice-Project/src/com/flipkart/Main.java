package com.flipkart;

import com.flipkart.bussiness.CustomerOperation;
import com.flipkart.demo.Calc;
import com.flipkart.demo.ScientificCalc;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("First Java Program");

        Calc calc = new Calc();

        System.out.println(calc.add(4, 6));
        System.out.println(calc.subtract(4, 6));
        System.out.println(calc.multiply(4, 6));
        System.out.println(calc.divide(16, 4));
        System.out.println(Calc.getDescription());

        ScientificCalc scientificCalc = new ScientificCalc();

        System.out.println(scientificCalc.sin(3.14));

        //Customer

        CustomerOperation customerOperation = new CustomerOperation();
        customerOperation.createCustomer();
        customerOperation.showCustomer();

        ///array operation customer

        customerOperation.createMultipleCustomers();
        customerOperation.listAllCustomers();
        System.out.println();
        customerOperation.updateCustomers();
        customerOperation.listAllCustomers();
        customerOperation.deleteCustomer(203);
        System.out.println();
        customerOperation.listAllCustomers();
    }
}

