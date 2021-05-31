package application;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 26/05/2021
		//last edition: 27/05/2021 10:18
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		OnlinePaymentService ps = new PaypalService();
		System.out.println(ps.interest(200.00, 3));
		/*
		try {
			System.out.println("Enter contract data");
			System.out.print("Number: ");
			Integer number = in.nextInt();
			System.out.print("Date (dd/mm/yyyy): ");
			Date date = sdf.parse(in.next());
			System.out.print("Contract value: ");
			Double contractValue = in.nextDouble();
			System.out.print("Enter number of installments: "); //parcelas
			Integer installments = in.nextInt();
		}
		catch (ParseException e) {
			System.out.println("ERROR:" + e.getMessage());
		}*/
		in.close();
	}
}
