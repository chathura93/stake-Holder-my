package com.virtusa.inventory.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.inventory.modal.CustomerDetail;
import com.virtusa.inventory.sevice.CustomerdetailService;

@RestController
@RequestMapping(value = "/coustomerdetail")
public class CustomerDetailController {
	
	@Autowired
	CustomerdetailService customerdetailService;
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ResponseEntity<CustomerDetail> save(@RequestBody CustomerDetail customerDetail) {
		
		return ResponseEntity.ok(customerdetailService.save(customerDetail));
	}
	@RequestMapping(value = "/fetch",method = RequestMethod.GET)
	public ResponseEntity<List<CustomerDetail>> fetchAll(){
		
		return ResponseEntity.ok(customerdetailService.fetchAll());
	}
	@RequestMapping(value = "update",method = RequestMethod.POST)
	public ResponseEntity<CustomerDetail> update(CustomerDetail customerDetail){
		return ResponseEntity.ok(customerdetailService.save(customerDetail));
	}

}
