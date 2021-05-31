package model.services;

import java.util.Calendar;

import model.entities.Contract;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		 Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.MONTH, months);
		 
		 
	}
}
