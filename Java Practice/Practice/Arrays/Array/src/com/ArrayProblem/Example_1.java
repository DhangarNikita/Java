//Calculate sum of an array
package com.ArrayProblem;

class First{
	void SumOfArray() {
		int arr[]= {1,5,3};
		int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
public class Example_1 {
	public static void main(String[]arrgs) {
		First frt=new First();
		
		frt.SumOfArray();	
	}
}
