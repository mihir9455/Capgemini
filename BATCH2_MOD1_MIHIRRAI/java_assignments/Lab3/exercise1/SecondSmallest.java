package Lab3.exercise1;

import java.util.Arrays;

public class Lab3Ex1 {
	int arr[];

	int secondSmallest(int arr[]) {
		Arrays.sort(arr);
		int a = arr[1];
		return a;

	}



public static void main(String[] args) {
	Lab3Ex1 l=new Lab3Ex1();
	int b[]= {6,5,4,3,7,2,1};
	System.out.println("Second Smallest element is="+l.secondSmallest(b));
	
	
}
}