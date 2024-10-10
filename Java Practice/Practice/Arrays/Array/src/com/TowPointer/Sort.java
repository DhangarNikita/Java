//write a code for sort 0 and 1
package com.TowPointer;
import java.util.Scanner;

class SortZeroes{
	static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void sortArray(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			if(i<count) {
				arr[i]=0;
			}else {
				arr[i]=1;
			}
		}	
	}
}
public class Sort {
	public static void main(String[]arg) {
		
		SortZeroes m =new SortZeroes();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		
		int old[]=new int[n];
		System.out.println("enter "+n+" element");
		for(int i=0;i<old.length;i++) {
		old[i]=sc.nextInt();
		}
		
		System.out.println("Original Array");
		m.printArray(old);
        m.sortArray(old);

		System.out.println("Sort Array");
		m.printArray(old);

		}
	}

