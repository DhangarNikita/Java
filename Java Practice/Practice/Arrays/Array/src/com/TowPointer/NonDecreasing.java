//given array sort in non decreasing order in square

package com.TowPointer;
import java.util.Scanner;
public class NonDecreasing {
	
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
	
	static void swap(int []arr, int i, int j) {
		int temp= arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
	}
	
	
	static void reverce(int[]arr) {
		int i=0, j=arr.length-1;
		while(i<j) {
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	
	static int[] sortSquare(int[] arr) {
		int n = arr.length;
		int left=0, right=n-1;
		
		int[] ans = new int[n];
		int k=0;
		
		while(left<=right) {
			if(Math.abs(arr[left])>Math.abs(arr[right])) {
				ans[k]=arr[left]*arr[left];
				k++;
				left++;
			}else {
				ans[k]=arr[right]*arr[right];
				k++;
				right--;
			}
			
		}
		return ans;
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
		int ans[]= sortSquare(arr);
        reverce(ans);
		
		System.out.println("Array after sorting");
		printArray(ans);
	}
}
