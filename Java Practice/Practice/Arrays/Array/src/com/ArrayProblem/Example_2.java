//search maximum number 
package com.ArrayProblem;
 
 class Max{
	 void MaxNumber() {
		 int arr[]= {5,8,6,2};
		 int ans=0;
		 
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i]> ans) {
				 ans=arr[i];
			 }
		 }
		 System.out.println(ans);
	 }
 }
 

public class Example_2 {
	public static void main(String[]arrgs) {
		Max m1 = new Max();
		m1.MaxNumber();
	}

}
