package com.virtusa.inventory.sevice;

import java.util.List;

import com.virtusa.inventory.modal.CustomerDetail;

public interface CustomerdetailService {

	public CustomerDetail save(CustomerDetail customerDetail);

	public List<CustomerDetail> fetchAll();
	
	public CustomerDetail update(CustomerDetail customerDetail);
}