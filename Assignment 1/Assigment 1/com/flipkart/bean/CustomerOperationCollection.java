package com.flipkart.bean;

import java.util.HashMap;

public class CustomerOperationCollection {

    HashMap<Integer, Customer> customerHashMap = new HashMap<>();

    Customer getCustomerById(int id) {
        if (customerHashMap.containsKey(id)) {
            return customerHashMap.get(id);
        }
        return null;
    }

    public boolean createCustomer(int id, String name, String address) {
        if (customerHashMap.containsKey(id)) {
            // maybe call update
//            updateCustomer(id,name,address);
            return false;
        }
        Customer customer = new Customer();
        customer.setCustomerID(id);
        customer.setCustomerName(name);
        customer.setCustomerAddress(address);
        customerHashMap.put(id, customer);
        return true;
    }

    public boolean updateCustomer(int id, String name, String address) {
        Customer customer = getCustomerById(id);
        if (customer == null) {
            return false;
        }

        customer.setCustomerName(name);
        customer.setCustomerAddress(address);
        customerHashMap.remove(id);
        customerHashMap.put(id, customer);
        return true;
    }

    public boolean deleteCustomer(int id) {
        Customer customer = getCustomerById(id);
        if (customer == null) {
            return false;
        }
        customerHashMap.remove(id);
        return true;
    }

    public void listCustomerInfo() {
        if (customerHashMap.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.println("Listing all elements");
        for (Customer customer : customerHashMap.values()) {
            System.out.println(customer.toString());
        }
        System.out.println();
    }

    public boolean printCustomerFromId(int id) {
        Customer customer = getCustomerById(id);
        if (customer == null) {
            System.out.println("Customer not found");
            return true;
        }
        System.out.println(customer.toString());
        return false;
    }
}
