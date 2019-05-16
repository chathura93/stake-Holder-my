package com.virtusa.inventory.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.inventory.modal.LoyaltyCardDetail;
import com.virtusa.inventory.sevice.LoyaltyCardDetailService;

@Entity
@RestController
public class LoyaltyCardDetailController {
	
	@Autowired
	LoyaltyCardDetailService cardDetailService;
	
	public ResponseEntity<LoyaltyCardDetail> save(LoyaltyCardDetail cardDetail){
		
		return ResponseEntity.ok(cardDetailService.save(cardDetail));
	}
	public ResponseEntity<List<LoyaltyCardDetail>> fetchAll(){
		
		return ResponseEntity.ok(cardDetailService.fetchAll());
	}
public ResponseEntity<LoyaltyCardDetail> update(LoyaltyCardDetail cardDetail){
		
		return ResponseEntity.ok(cardDetailService.save(cardDetail));
	}

}
