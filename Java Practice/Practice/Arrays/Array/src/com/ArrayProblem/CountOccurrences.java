//Count the number of occurrences a perticular element x

package com.ArrayProblem;
import java.util.Scanner;
public class CountOccurrences {
	
	static int CountOccurence1(int arr[], int x) {
		int count =0;
		for(int i=0; i<arr.length; i++) {
		if(arr[i]==x) {
			count++;
		}
	}
		return count;
	}
	public static void main(String[]arrgs) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	
	int age[]=new int[n];
	
	System.out.println("Enter the element");
	for(int i=0; i<age.length; i++) {
		age[i]=sc.nextInt();
	}
	System.out.println("Enter X");
	int x=sc.nextInt();
	
	System.out.println( CountOccurence1(age ,x));


}

}