package ineuronfinalassignment.solution3;
import java.util.Scanner;

public class Main {
	
	
	public void integer() throws NegativeValueException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Integer");
		int n=sc.nextInt();
		if(n>=0) {
			System.out.println("Entered value of Integer is :"+n);
		}
		else {
			NegativeValueException ne=new NegativeValueException();
			throw ne;

		}
		
	}

	public static void main(String[] args) {
		Main m=new Main();
		try {
			m.integer();
		} catch (NegativeValueException e) {
			System.out.println("NegativeValueException  Please Enter the positive value");
		}
	}


}
