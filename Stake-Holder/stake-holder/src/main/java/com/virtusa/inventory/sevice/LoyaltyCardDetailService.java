package com.virtusa.inventory.sevice;

import java.util.List;

import com.virtusa.inventory.modal.LoyaltyCardDetail;

public interface LoyaltyCardDetailService {
	
	public LoyaltyCardDetail save(LoyaltyCardDetail cardDetail);
	
	public List<LoyaltyCardDetail> fetchAll();
	
	public LoyaltyCardDetail update(LoyaltyCardDetail cardDetail);

}
