package ineuronfinalassignment.solution4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Verification {
	public boolean verify() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter login Details :\n");
		System.out.println("Please Enter your username");
		try {
			String user = sc.next();
			final String pass = "123";
			System.out.println("Please Enter your bank account No");
			String ba = sc.next();
			System.out.println("Please Enter yout bank account password");
			String pas = sc.next();
			if (pass.equals(pas)) {
				return true;
				} 

		} catch (InputMismatchException e) {
			e.getMessage();
			e.printStackTrace();
			System.out.println("Please Enter Valid Details");
		}
		return false;

	}
}
