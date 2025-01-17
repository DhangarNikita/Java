/*given an integer array a return the prifix sum/running sum in the same 
array without creating a new array*/

package com.PrefixApproch;
import java.util.Scanner;

public class PrefixSum {
	
	static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	static int[] prefixSum(int[]arr) {
		for(int i=1; i<arr.length;i++) {
			arr[i]= arr[i-1]+arr[i];
		}
		return arr;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		
		System.out.println("Enter " +n+" Element");
		for(int i=0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
			}
		
		System.out.println("Array befor sorting");
		printArray(arr);
		
		prefixSum(arr);
		
		System.out.println("Array after sorting");
		printArray(arr);
	}

}
