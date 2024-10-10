package com.ArrayProblem;
import java.util.Scanner;
public class LastOccurence {
	
	static int lastoccurrence(int arr[], int x) {
		int lastIndex = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==x) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}
	
	public static void main(String []arrgs) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int age[] =new int[n];
		
		System.out.println("Enter array element");
		for(int i=0;i<n;i++) {
			age[i]=sc.nextInt();
		}
			System.out.println("Enter number");
			int x= sc.nextInt();
			
			System.out.println("Last occurence number is at "+ lastoccurrence(age,x)+" index");


		

		
	}
}
