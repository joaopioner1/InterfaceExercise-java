package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		 double basicQuota = contract.getTotalValue() / months;
		 //basicQuota = 200
		 for (int i = 1; i <= months; i++) {
			 double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			 //updateQuota = 202
			 double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			 Date dueDate = addMonths(contract.getDate(), i);
			 contract.getInstList().add(new Installment(dueDate, fullQuota));
		 }
	}
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
}
