package ineuronfinalassignment.solution8;

public class Thread2 extends Thread {
	public void run() {
		System.out.println("Odd Numbers Between 1 and 10 are : ");

		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(" "+i);
			}
		}
}}
