package ineuronfinalassignment.solution7;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter the elements of array");
		int[] arr = new int[n];
		for (int i : arr) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target value");
		int key=sc.nextInt();
		Arrays.sort(arr);
		binarySearch(arr,0,n-1,key);
		

	}

}
