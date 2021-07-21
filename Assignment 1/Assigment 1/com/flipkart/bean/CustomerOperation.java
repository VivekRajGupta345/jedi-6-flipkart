package com.flipkart.bean;

public class CustomerOperation {
    int MAX_SIZE = 10;
    private Customer[] customerArray;
    private int minUnoccupiedIndex = 0;

    public CustomerOperation() {
        customerArray = new Customer[MAX_SIZE];
    }

    public CustomerOperation(int maxSize) {
        MAX_SIZE = maxSize;
        customerArray = new Customer[MAX_SIZE];
    }


    private int findIndexOfCustomer(int id) {
        for (int index = 0; index < minUnoccupiedIndex; index++) {
            if (customerArray[index].getCustomerID() == id) {
                return index;
            }
        }
        return -1;
    }

    public boolean createCustomer(int id, String name, String address) {
        if (minUnoccupiedIndex >= MAX_SIZE) {
            // maybe delete first customer and add this one
//            deleteCustomer(customerArray[0].getCustomerID());
            return false;
        }
        int indexOfCustomer = findIndexOfCustomer(id);
        if (indexOfCustomer != -1) {
            // maybe call update with params
//            updateCustomer(id,name,address);
            return false;
        }

        customerArray[minUnoccupiedIndex] = new Customer();
        customerArray[minUnoccupiedIndex].setCustomerID(id);
        customerArray[minUnoccupiedIndex].setCustomerName(name);
        customerArray[minUnoccupiedIndex].setCustomerAddress(address);
        minUnoccupiedIndex++;
        return true;
    }


    public boolean updateCustomer(int id, String name, String address) {
        int indexOfCustomer = findIndexOfCustomer(id);
        if (indexOfCustomer != -1) {
            customerArray[indexOfCustomer].setCustomerAddress(address);
            customerArray[indexOfCustomer].setCustomerName(name);
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(int id) {
        int indexOfCustomer = findIndexOfCustomer(id);
        if (indexOfCustomer != -1) {
            for (int index = indexOfCustomer; index + 1 < minUnoccupiedIndex; index++) {
                customerArray[index] = customerArray[index + 1];
            }
            customerArray[--minUnoccupiedIndex] = null;
            return true;
        }
        return false;
    }

    public void listCustomerInfo() {
        System.out.println("Listing all elements");
        if (minUnoccupiedIndex == 0) {
            System.out.println("Empty");
            return;
        }
        int index = 0;
        for (Customer customer : customerArray) {
            if (customer != null) {
                System.out.println("Customer at index " + index + " " + customer.toString());
            }
            index++;
        }
        System.out.println();
    }

    public boolean printCustomerFromId(int id) {
        int indexOfCustomer = findIndexOfCustomer(id);
        if (indexOfCustomer != -1) {
            System.out.println("Customer at index " + indexOfCustomer + " " + customerArray[indexOfCustomer].toString());
            return true;
        } else {
            System.out.println("Customer not found");
            return false;
        }
    }
}
