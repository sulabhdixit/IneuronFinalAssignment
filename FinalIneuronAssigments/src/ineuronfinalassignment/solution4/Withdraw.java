package ineuronfinalassignment.solution4;

import java.util.Scanner;

public class Withdraw {
	public void withdraw() {
		int balance = 5000;
		System.out.println("Current Balance is :" + balance + " Rupees Only");
		System.out.println("Enter the amount to withdraw");
		Scanner sc = new Scanner(System.in);
		try {
			int wi = sc.nextInt();
			int newbalance = balance - wi;
			System.out.println("Amount of Rs :" + wi + " Withdraw Successfully");
			System.out.println("Current Balance is :" + newbalance + " Rupees Only");

		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			System.out.println("Please Enter Valid Details");
		}
	}
}
