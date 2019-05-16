package com.virtusa.inventory.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.virtusa.inventory.modal.CustomerDetail;
import com.virtusa.inventory.repository.CustomerDetailRepository;

public class CustomerDetailServiceImpl implements CustomerdetailService {
	
	@Autowired
	CustomerDetailRepository customerDetailRepository;

	@Override
	public CustomerDetail save(CustomerDetail customerDetail) {
	
		return customerDetailRepository.save(customerDetail);
	}

	@Override
	public List<CustomerDetail> fetchAll() {
		
		return customerDetailRepository.findAll();
	}

	@Override
	public CustomerDetail update(CustomerDetail customerDetail) {
		
		return customerDetailRepository.save(customerDetail);
	}

}
