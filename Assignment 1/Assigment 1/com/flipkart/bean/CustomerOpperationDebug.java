package com.flipkart.bean;


public class CustomerOpperationDebug {


    int MAX_SIZE = 10;
    private Customer[] customerArray;
    public boolean _DEBUG = false;

    public void setDebug(boolean debug) {
        this._DEBUG = debug;
    }

    public CustomerOpperationDebug() {
        this.customerArray = new Customer[this.MAX_SIZE];
    }

    public CustomerOpperationDebug(int maxSize) {
        this.MAX_SIZE = maxSize;
        this.customerArray = new Customer[this.MAX_SIZE];
    }

    private int min_unoccupied_index = 0;

    private int findIndexOfCustomer(int id) {
        int index = 0;
        for (Customer customer : this.customerArray) {
            if (customer != null && customer.getCustomerID() == id) {
                if (this._DEBUG) {
                    System.out.printf("Found customer with id %d at %d\n", id, index);
                }
                return index;
            }
            index++;
        }
        if (this._DEBUG) {
            System.out.printf("Could not find customer with id %d\n", id);
        }
        return -1;

    }

    public boolean createCustomer(int id, String name, String address) {
        if (this.min_unoccupied_index >= this.MAX_SIZE) {
            if (this._DEBUG) {
                System.out.printf("Overflow in array.Object not created with id %d\n", id);
            }
            return false;
        }
        int index_of_customer = this.findIndexOfCustomer(id);
        if (index_of_customer != -1) {
            if (this._DEBUG) {
                System.out.printf("Id %d already in array.Object not created", id);
            }
            return false;
        }

        this.customerArray[this.min_unoccupied_index] = new Customer();
        this.customerArray[this.min_unoccupied_index].setCustomerName(name);
        this.customerArray[this.min_unoccupied_index].setCustomerID(id);
        this.customerArray[this.min_unoccupied_index].setCustomerAddress(address);
        this.min_unoccupied_index++;
        return true;
    }


    public boolean updateCustomer(int id, String name, String address) {
        if (this._DEBUG) {
            System.out.printf("update called with id %d name \"%s\" address \"%s\"\n", id, name, address);
        }
        int index_of_customer = this.findIndexOfCustomer(id);
        if (index_of_customer != -1) {
            this.customerArray[index_of_customer].setCustomerAddress(address);
            this.customerArray[index_of_customer].setCustomerName(name);
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(int id) {
        if (this._DEBUG) {
            System.out.printf("delete called with id %d\n", id);
        }
        int index_of_customer = this.findIndexOfCustomer(id);
        if (index_of_customer != -1) {
            for (int i = index_of_customer; i < this.MAX_SIZE - 1; i++) {
                this.customerArray[i] = this.customerArray[i + 1];
            }
            if (this.min_unoccupied_index - 1 >= 0) {
                this.customerArray[--this.min_unoccupied_index] = null;
            }
            return true;
        }
        return false;
    }

    public void listCustomerInfo() {
        int index = 0;
        System.out.println("Listing all elements");
        for (Customer customer : this.customerArray) {
            if (customer != null) {
                System.out.println("Customer at index " + index + " " + customer.toString());
            }
            index++;
        }
        System.out.println();
    }

    public boolean printCustomerFromId(int id) {
        int index_of_customer = this.findIndexOfCustomer(id);
        if (index_of_customer != -1) {
            System.out.println("Customer at index " + index_of_customer + " " + this.customerArray[index_of_customer].toString());
            return true;
        } else {
            System.out.println("Customer not found");
            return false;
        }
    }
}
