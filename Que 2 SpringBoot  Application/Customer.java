package com.example.demo.modal;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity

public class Customer {

@Id

 private int customerId;

 private String customerName;

 private int customerPhone;
 
 private String customerAddress;
 
 private String customerLoginId;
 
 private String customerpassword;

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public int getCustomerPhone() {
	return customerPhone;
}

public void setCustomerPhone(int customerPhone) {
	this.customerPhone = customerPhone;
}

public String getCustomerAddress() {
	return customerAddress;
}

public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}

public String getCustomerLoginId() {
	return customerLoginId;
}

public void setCustomerLoginId(String customerLoginId) {
	this.customerLoginId = customerLoginId;
}

public String getCustomerpassword() {
	return customerpassword;
}

public void setCustomerpassword(String customerpassword) {
	this.customerpassword = customerpassword;
}

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone=" + customerPhone
			+ ", customerAddress=" + customerAddress + ", customerLoginId=" + customerLoginId + ", customerpassword="
			+ customerpassword + "]";
}



}