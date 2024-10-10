//search the given number x in the array if present then return index else return -1

//arr[i]= number of array
//i = index

package com.ArrayProblem;

class Find{
	void SearchNumber(){
		int arr[] = {1,8,6,3,4,};
		int x=8;
		int ans=-1;
		for (int i=0; i<arr.length;i++) {
			if(arr[i]==x) {
				ans=i;
			}
		}
		System.out.println(ans);
	}
}

public class Example_3 {
	public static void main(String[]arrgs) {
		Find f1 = new Find();
		f1.SearchNumber();
	}

}
