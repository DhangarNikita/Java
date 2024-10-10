/*find the unique number in a given array where all the elements are being repeated
twice with one value being unique*/

package com.ArrayManipulation;

import java.util.Scanner;

public class uniqueNo {
	static int findUnique(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		int ans=-1;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>0) {
				ans =arr[i];
			}
		}return ans;
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
	
		System.out.println(findUnique(age));
		
	}
	

}


