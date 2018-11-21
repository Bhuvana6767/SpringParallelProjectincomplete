package com.cg.springmvc2.dao;

import java.util.List;

import com.cg.springmvc2.dto.Customer;

public interface CustomerDao {
	public void addCustomer(Customer customer);
	/*public List<Customer> showAllCustomers();*/
	public Customer showBalance(String mobnum);
	public int deposit(String mobilenum,double amount);
	public int withdraw(String mobilenum,double amount);
	public void fundtransfer(String smobnum,String tmobnum,double amount);
	
}
