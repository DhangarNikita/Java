package com.ArrayProblem;
import java.util.Scanner;
public class SortOrNot {
	
	static boolean isSort(int[] arr) {
		boolean check =true;
		for(int i =1;i<arr.length; i++) {
			if (arr[i]<arr[i-1]) {
				check=false;
				System.out.println("Array is not sorted");
				break;
			}
		}
		return check;
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
			
			System.out.println( isSort(age));


		}

		}
