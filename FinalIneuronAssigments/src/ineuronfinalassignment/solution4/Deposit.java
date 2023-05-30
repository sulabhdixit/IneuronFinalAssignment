package ineuronfinalassignment.solution4;

import java.util.Scanner;

public class Deposit {
	public void deposit() {
		Scanner sc = new Scanner(System.in);

		int balance = 5000;
		System.out.println("Current Balance is :" + balance + " Rupees Only");
		System.out.println("Enter the amount to deposit");

		try {
			int de = sc.nextInt();
			int newbalance = balance + de;
			System.out.println("Amount of Rs :" + de + "Deposited Successfully");
			System.out.println("Current Balance is :" + newbalance + " Rupees Only");
			System.out.println("Thanks for visiting our bank!!!!!");
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("Please Enter Valid Amount");
		}

	}
}
