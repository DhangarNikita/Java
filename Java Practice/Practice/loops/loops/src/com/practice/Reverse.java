//reveres the digits

package com.practice;

import java.util.Scanner;

public class Reverse {
	public static void main(String[]arrgs) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number");
		 int n = sc.nextInt();

		 int ans=0;
		 while(n>0) {
			 ans=ans*10+n%10;
			 n/=10;
			 
		 }
		 System.out.println(ans);
}
}