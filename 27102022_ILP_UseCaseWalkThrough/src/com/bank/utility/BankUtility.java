package com.bank.utility;

import com.bank.enitity.Service;
import com.bank.service.BankService;

public class BankUtility {

	public static void main(String[] args) {
		
		
		Service service = BankService.createService();
        BankService.createRateCard(service);
        BankService.displayDetails(service);
        
	}

}
