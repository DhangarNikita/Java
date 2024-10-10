// find the total number of pair in the array whose sum is equal to the given value x

package com.TargetSum;
import java.util.Scanner;
public class SumEqual {
	static int sum(int arr[], int x) {
		int count=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+ arr[j] == x) {
					count++;
				}
			}
		}return count;
	}
	public static void main (String[] arrg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int age[]= new int[n];
		
		System.out.println("enter array value");

		for(int i=0;i<age.length;i++ ) {
			age[i]= sc.nextInt();
		}
		System.out.println("enter x value");
		int x= sc.nextInt();

		System.out.println(sum(age, x));
		
	}
	

}
