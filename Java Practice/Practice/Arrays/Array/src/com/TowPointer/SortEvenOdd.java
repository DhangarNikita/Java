//sort even first then odd


package com.TowPointer;
import java.util.Scanner;

class Evenodd{
	
	static void ptintArray(int []arr) {
		
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void swap(int[] arr ,int i, int j) {
		int temp=arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	
	static void sortByParity(int[] arr) {
		int n =arr.length;
	int left=0 ,right=n-1;
	
	while(left<right) {
		if(arr[left]%2==1 && arr[right]%2==0) {
			swap(arr,left,right);
			left++;
			right--;
		}
		if(arr[left]%2==0) {
			left++;
		}
		if(arr[right]%2==1) {
			right--;
		}
	}
	
	}
}
public class SortEvenOdd {
	public static void main(String[]args) {
		Evenodd eo=new Evenodd();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n=sc.nextInt();
		
		int [] arr =new int[n];
		System.out.println("Enter Array Size");
        for(int i=0;i<arr.length;i++) {
	    arr[i]=sc.nextInt();
        }
		System.out.println("Original arry");
		eo.ptintArray(arr);
		
		eo.sortByParity(arr);
		
		System.out.println("sort arry");
		eo.ptintArray(arr);		
	}
}
