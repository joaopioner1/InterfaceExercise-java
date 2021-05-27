package model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		return null;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return null;
	}

}
	//primeiro calcula valor 1% de acordo com o valor de cada parcela e depois soma mais 2% (juros simples) 
	//Cada mes tem seu valor proprio