package ineuronfinalassignment.solution4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome To The Ineuron Bank ATM !!!!!\n");
		System.out.println("1) Press [B] to Check Balance Amount\n"+"2) Press [D] to Deposit Amount\n"+"3) Press [W] to Withdraw Amount");
		Scanner sc=new Scanner(System.in);
		char o=sc.next().charAt(0);
		if (o=='B') {
			Verification v=new Verification();
			v.verify();
			if(true) {
			BalanceCheck b=new BalanceCheck();
			b.balacnceCheck();}
		}
		else if(o=='D') {
			Verification v=new Verification();
			v.verify();
			if(true) {
			Deposit d = new Deposit();
			d.deposit();}
		}
		else if(o=='W') {
			Verification v=new Verification();
			v.verify();
			if(true) {
			Withdraw w = new Withdraw();
			w.withdraw();}
		}
		else {
			System.out.println("Please Enter Valid Option");
		}
	}

}
