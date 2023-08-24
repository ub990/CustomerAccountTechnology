package com.wipro.service;

import java.util.List;

import com.example.ReuseableComponents.Bean.*;

/*Service Interface*/

public interface CustomerService {
	
	public Customer save(Customer cust);
	public Customer update(Customer cust);
	public Customer findById(Integer id);
	public boolean deleteById(Integer id);
	public List<Customer> findAll();
	
}
