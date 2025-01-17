/* given array of integers of size n answer q queries where you need to print 
   the sum of values in a given range of indices from l to r */
package com.PrefixApproch;
import java.util.*;
public class PrefixQuqries {
	
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
		
		int arr[]= new int[n+1];
		
		System.out.println("Enter " +n+" Element");
		for(int i=1; i<=n;i++) {
			arr[i]= sc.nextInt();
			}
		
		int[] pref= prefixSum(arr);

		System.out.println("Enter the no of queries");
		int q=sc.nextInt();
		
		while(q-->0) {
			System.out.println("Enter Rnge");
			int l=sc.nextInt();
			int r=sc.nextInt();
			int ans = pref[r]-pref[l-1];
			System.out.println("Sum "+ ans);

		}
}
}