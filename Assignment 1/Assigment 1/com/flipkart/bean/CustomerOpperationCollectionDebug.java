package com.flipkart.bean;

import java.util.HashMap;
import java.util.Map;

public class CustomerOpperationCollectionDebug {

    HashMap<Integer, Customer> customerHashMap = new HashMap<>();
    public boolean _DEBUG = false;

    public void setDebug(boolean debug) {
        _DEBUG = debug;
    }

    Customer getCustomerById(int id) {
        if (customerHashMap.containsKey(id)) {
            Customer customer = customerHashMap.get(id);
            if (_DEBUG) {
                System.out.printf("Found customer with id %d %s\n", id, customer.toString());
            }
            return customer;
        }
        if (_DEBUG) {
            System.out.printf("Could not find customer with id %d\n", id);
        }
        return null;
    }

    public boolean createCustomer(int id, String name, String address) {
        if (customerHashMap.containsKey(id)) {
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
        if (_DEBUG) {
            System.out.printf("update called with id %d name \"%s\" address \"%s\"\n", id, name, address);
        }
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

    //
    public boolean deleteCustomer(int id) {
        if (_DEBUG) {
            System.out.printf("delete called with id %d\n", id);
        }
        Customer customer = getCustomerById(id);
        if (customer == null) {
            return false;
        }
        customerHashMap.remove(id);
        return true;
    }

    //
    public void listCustomerInfo() {
        System.out.println("Listing all elements");
        for (Map.Entry<Integer, Customer> entry : customerHashMap.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        System.out.println();
    }

    //
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
