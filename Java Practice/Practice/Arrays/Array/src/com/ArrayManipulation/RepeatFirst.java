/* given an array a consisting of integers return the first value is repeating in this array
   if no value is being repeated return -1 */

package com.ArrayManipulation;

import java.util.Scanner;

public class RepeatFirst {
	static int firstRepeat(int arr[]) {
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}return -1;
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
		

		System.out.println(firstRepeat(age));
		
	}
	

}


