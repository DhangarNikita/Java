//// find the total number of triplet in the array whose sum is equal to the given value x

package com.TargetSum;

import java.util.Scanner;

public class TripletSum {
	static int triplet(int arr[], int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length; j++) {
				for(int k=j+1;k<arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						count++;
					}
				}
			}
		}	return count;

		
	}
	public static void main (String[] arrg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int age1[]= new int[n];
		
		System.out.println("enter array value");

		for(int i=0;i<n;i++ ) {
			age1[i]= sc.nextInt();
		}
		System.out.println("enter x value");
		int x= sc.nextInt();

		System.out.println(triplet(age1, x));
		
	}
}
