package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 26/05/2021
		//last edition:
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
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
		}
		in.close();
	}
}
