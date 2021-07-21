package com.flipkart.bean;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerAddress;
    private String customerPinCode;

    public int getCustomerID() {
        return this.customerID;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    public String getCustomerPinCode() {
        return this.customerPinCode;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerPinCode(String customerPinCode) {
        this.customerPinCode = customerPinCode;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + this.customerID +
                ", customerName='" + this.customerName + '\'' +
                ", customerAddress='" + this.customerAddress + '\'' +
                '}';
    }
}
