// add 2 numbers using methods

package com.Methods;
import java.util.Scanner;

class Stdudent {
	  public int sum(int a, int b) {
		  int ans = a+b;
	  return ans;
	  }
}


public class Exp_1 {
	public static void main(String[]arrgs) {
		Stdudent st = new Stdudent();
		Scanner sc = new Scanner(System.in);
		
		int x= sc.nextInt();
		int y = sc.nextInt();
		int ans = st.sum(x, y);
		
		System.out.print("sum is: ");
		System.out.print(ans);	
	}
}
