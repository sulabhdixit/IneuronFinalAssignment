package ineuronfinalassignment.solution10;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the total number of integers you want to enter");
		int size = sc.nextInt();
		System.out.println("Enter the Integers in the List");

		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		System.out.println("The second smallest integer in the list is :" + list.get(1));
		System.out.println("The second largest integer in the list is :" + list.get(size - 2));

	}

}
